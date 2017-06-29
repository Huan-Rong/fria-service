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