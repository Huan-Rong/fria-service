# JDBC
## 数据持久化
* 持久化指的是将数据保存到可掉电式设备中以供之后使用。
* 大多数情况下，特别是企业级应用，数据持久化意味着将内存中的数据保存到硬盘上加以“固化”。这是应该从哪里来到哪里去的问题。
* 持久化的媒介包含磁盘文件、XML 数据文件、关系型数据库。
## Java 中的数据存储技术
* JDBC 直接访问数据库
* JDO 技术
* O/R 工具，如 Hibernate、MyBatis

JDBC 是 Java 访问数据库的基石，JDO、Hibernate 等只是更好地封装了 JDBC。
## JDBC 是什么
* JDBC 是一组独立于特定数据库管理系统的、通用的 SQL 数据库存取和操作接口。
* 它定义了用来访问数据库的标准 Java 类库，使用这个类库可以以一种标准的方法、方便地访问数据库资源。
* 它的目标是使 Java 程序员无需对特定的数据库系统的特点有过多的了解，使用 JDBC 就可以连接任何提供了 JDBC 驱动程序的数据库系统，从而大大简化和加快了开发的进程。
## JDBC 的体系结构
* JDBC 的总体结构有 4 个组件：应用程序、驱动管理器、驱动程序、数据源。
* JDBC 驱动程序分为 2 个层次：Java API 和 Java Driver API
* 面向应用的 JDBC API 提供给应用程序开发人员使用，用于连接数据库、执行脚本、获取脚本执行结果等
* 面向数据库的 JDBC Driver API 提供给数据库产商用于开发数据库驱动。
## JDBC 驱动程序
JDBC 驱动程序是数据库产商依据 JDBC Driver API 开发出来的实现类库。JDBC 驱动程序根据其实现方式有 4 种类型。
1. JDBC-ODBC bridge plus ODBC driver
2. Native-API partly-java driver
3. Pure Java Drvier for Database Middleware
4. Direct-to-Database Pure Java Driver

**Direct-to-Database Pure Java Driver**

多数数据库厂商已经支持允许客户程序通过网络直接与数据库通信的网络协议。
这种类型的驱动程序完全使用 Java 编写，通过与数据库建立的 Socket 连接，采用具体与厂商的网络协议把 JDBC 调用转换为直接连接的网络调用。

[存在即真理：JDBC 的 4 种驱动程序](http://blog.csdn.net/xad707348125/article/details/44984093)

## JDBC API
JDBC API 是一组面向应用程序开发人员的 API，主要包含以下接口：
* DriverManager
* Connection
* Statement
* PreparedStatement
* CallableStatement
## Driver
* java.sql.Driver 接口是所有 JDBC 驱动程序需要实现的接口。这个接口是提供给数据库产商使用的，不同的数据库产商提供不同的实现。
* 在程序中不需要直接去访问实现了 Driver 接口的类，而是由驱动程序管理类 java.sql.DriverManager 去调用这些 Driver 的具体实现。
* 应当说，应用程序开发人员不需要调用 JDBC Driver API 这一层次的所有的接口。
## 加载与注册 JDBC 驱动
* 加载 JDBC 驱动需要调用 **Class 类的静态方法 forName()**，向其传递要加载的 JDBC 驱动的类名
* DriverManager 类是驱动程序管理器类，负责管理驱动程序
* 通常不用显示调用 DriverManager 类的 registerDriver() 方法来注册驱动程序类的实例，因为 Driver 接口的驱动程序类都包含了静态代码块；
这个静态代码块会调用 DriverManager.regitsterDriver() 方法来注册自身的一个实例。
## 建立连接
* 可以调用 DriverManager 类的 getConnection() 方法建立到数据库的连接。
* JDBC URL 用于标志一个被注册的驱动程序，驱动程序管理器通过这个 URL 选择正确的驱动程序，从而建立到数据库的连接。
* JDBC URL 的标准由三部分组成，各部分间用冒号分隔
    * jdbc:<子协议>:<子名称>
    * 协议：JDBC URL 中的协议总是 jdbc。
    * 子协议：子协议用于标识一个数据库驱动程序。
    * 子名称：一种标识数据库的方法。子名称可以依据不同的子协议而变化，子名称为了定位数据库提供足够的信息。
    
## 访问数据库
* 数据库连接被用于向数据库服务器发送命令和 SQL 语句。
* 在 java.sql 包中有 3 个接口分别定义了对数据库调用的不同方式：
    * Statement：用于执行静态的 SQL 语句
    * PreparedStatement：用于执行预编译的 SQL 语句
    * CallableStatement：用于执行数据库中的存储过程的调用
    
## Statement
* 通过调用 Connection.createStatement() 方法创建该对象
* Statement 用于执行静态的 SQL 语句，并且返回执行结果
* Statement 接口中定义了下列方法用于执行 SQL 语句
    * ResultSet executeQuery(String sql)
    * int executeUpdate(String sql)
    
## ResultSet
* 通过调用 Statement.executeQuery() 方法创建该对象
* ResultSet 用于以逻辑表格的形式封装执行数据库操作后的结果集
* ResultSet 接口由数据库产商实现
* ResultSet 维护了一个指向当前数据行的游标，初始的时候，游标在第一行之前，可以通过 ResultSet.next() 方法移动到下一行
* ResultSet 接口的常用方法：
    * boolean next()
    * getString()
    
注意 Java 数据类型与 SQL 数据类型之间的转换。

## SQL 注入攻击
* SQL 注入是利用系统没有对用户输入的数据进行充分的检查，而在用户输入数据中注入非法的 SQL 语句段或命令，从而利用系统的 SQL 引擎完成恶意的行为的做法。
* 对于 Java 而言，要防范 SQL 注入，只需要使用 PreparedStatement 取代 Statement 即可。
## PreparedStatement
* 通过调用 Connection.preparedStatement() 方法获取 preparedStatement 对象
* PreparedStatement 是 Statement 的子接口，它表示一条预编译过得 SQL 语句
* PreparedStatement 对象所代表的是 SQL 语句中的参数用问号来表示，然后可通过调用 PreparedStatement 对象的 setXXX() 方法来设置这些参数。
* setXXX() 方法有两个参数，第一个参数是要设置的 SQL 语句中的参数的索引，索引值从 1 开始，第二个参数是这事的 SQL 语句中的参数的值。
## PreparedStatement VS Statement
* PreparedStatement: DBMS 会对预编译语句提供性能优化
* PreparedStatement：可以防止 SQL 注入
## 使用 JDBC 驱动程序处理元数据
* 通过 Connection 对象可以获取 DatabaseMetaData 对象
* 通过 DatabaseMetaData 对象可以获取有关数据库管理系统的各种信息，包括数据库的各个表、表的列信息、数据类型、触发器、存储过程等各方面的信息。
* DatabaseMetaData 提供了以下方法
    * getURL()：返回数据库的URL
    * getUserName()：返回连接当前数据库管理系统的用户名
    * isReadOnly()：表示数据库是否只允许读操作
    * getDatabaseProductName()：返回数据库的产品名称
    * getDatabaseProductVersion()：返回数据库的版本号
    * getDriverName()：返回驱动程序的名称
    * getDriverVersion()：返回驱动程序的版本号
 
## ResultSetMetaData
ResultSetMetaData 提供了获取 ResultSet 对象中列的类型和属性信息的方法
* getColumnName(int column)：获取指定列的名称
* getColumnCount()：返回当前 ResultSet 对象中的列数
* getColumnTypeName(int column)：检索指定列的数据库特定的类型名称
* getColumnDisplaySize(int column)：指示指定列的最大标准宽带，以字符为单位
* isNullable(int column)：指示指定列中的值是否可以为 null
* isAutoIncrement(int column)：指示是否自动为指定列进行编号，这样这些列仍然是只读
## 反射与 ResultSetMetaData
## Lob
## 数据库事务
事务是一组逻辑处理单元，使得数据库从一种状态变换到另一种状态。数据库事务具有 ACID 属性。
* Atomicity 原子性：指事务是一个不可分割的单元，事务中的操作要么全都发生，要么都不发生。
* Consistency 一致性：指事务必须使数据库从一个一致性状态变换到另一个一致性状态。
* Isolation 隔离性：指一个事务的执行不能被其他事务干扰。即一个事务内部的操作及使用的数据对并发的其他事务是隔离的，并发执行的各个事务不能相互干扰。
* Durability 持久性：指一个事务一旦被提交，它对数据库中数据的改变就是永久性的，接下来的其他操作和数据库故障不应该对其有任何影响。
## JDBC 的事务处理
当一个连接对象被创建时，默认情况下事务是自动提交的。即每次执行一个 SQL 语句时，如果执行成功，就会向数据库自动提交，而不能回滚。
为了让多个 SQL 语句作为一个事务执行，在 JDBC 中可以做以下操作：
* 调用 Connection 对象的 setAutoCommit(false) 来取消自动提交事务
* 在所有的 SQL 语句都执行成功后，调用 commit() 方法来提交事务
* 在出现异常时，调用 rollback() 方法来回滚事务
* 若此时 Connection 没有被关闭，则需要回复其自动提交状态？
## 数据库的隔离级别
对于同时运行的多个事务，当这些事务访问数据库中相同的数据时，如果没有采取必要的隔离机制，就会导致各种并发问题。
* 脏读：对于两个事务 T1、T2，T1 读取了已经被 T2 更新但还没有被提交的数据，之后若 T2 回滚，T1 读取的内容就是临时且无效的。
* 不可重复读：对于两个事务 T1、T2，T1 读取了一个字段，然后 T2 更新了该字段。之后 T1 再次读取同一个字段，值就不同了。
* 幻读：对于两个事务 T1、T2，T1 从一个表中读取了一个字段，然后 T2 在该表中插入了一些新的行。之后，如果 T1 再次读取同一个表，就会多出几行。
### 数据库事务的隔离性
数据库系统必须具有隔离并发运行各个事务的能力，使它们不会相互影响，避免各种并发问题。
### 隔离级别
一个事务与其他事务隔离的程度成为隔离级别。数据库规定了多种事务隔离级别，不同的隔离级别对应不同的干扰程度。隔离级别越高，数据一致性就会好，但并发性越弱。
### 4 种事务隔离级别
| 隔离级别        | 描述          | 
| ------------- |:-------------:| -----:|
| READ UNCOMMITTED 读未提交    | 允许事务读取未被其他事务提交的变更。脏读、不可重复读、幻读的问题都会出现。 |
| READ COMMITTED 读已提交     |  只允许事务读取已经被其他事务提交的变更。可以避免脏读，但不可重复读和幻读问题仍然可能出现。 |
| REPEATABLE READ 可重复读 | 确保事务可以多次从一个字段中读取相同的值。在这个事务持续期间，禁止其他事务对这个字段进行更新，可以避免脏读和不可重复读，但幻读的问题仍然存在。 |
| SERIALIZABLE 串行化 | 确保事务可以从一个表中读取相同的行。在这个事务持续期间，禁止其他事务对该表执行插入、更新、删除操作。所有并发问题都可以避免，但性能十分低下。|

Oracle 支持 2 种事务隔离级别： READ COMMITTED（默认） 和 SERIALIZABLE。

MySQL 支持 4 种事务隔离级别，默认的事务隔离级别是 REPEATABLE READ。