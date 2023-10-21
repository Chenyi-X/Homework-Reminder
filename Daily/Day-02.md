# Day-02 



`2023.10.20 周五 雨`

下午打了个把小时的球~

学习时间：*大约 6 小时*

# 目录

[TOC]

# 本日目标计划

根据搜集到的资料，各种开源后台管理系统，框架，博客都会讲一大堆听不懂的名词，技术栈。

所以我想我的计划是搞懂专业术语，各种技术栈的的含义开始。对于这些名词，我认为采取先了解其作用，再看需求进行深度学习为佳。然后再研究他们的开源代码，各种包各种类。所以在了解了这些技术名词的下一步研究源码，包。

先从顶层，了解设计模式开始。据菜鸟教程，设计模式的定义如下：

> *设计模式（Design pattern）代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是一套被反复使用的、多数人知晓的、经过分类编目的、代码设计经验的**总结**。使用设计模式是为了重用代码、让代码更容易被他人理解、保证代码可靠性。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。*

并且

> 对于那些经验不足的开发人员，学习设计模式有助于通过一种简单快捷的方式来学习软件设计。

设计模式多种多样，例如单例模式，代理模式等等

对于后台管理系统，我了解到大多用采用**MVC三层架构**。

搜寻到的参考资料：

**合集资源：**

- [Gitee资料合集](https://gitee.com/explore/backend?lang=Java)  很多项目
- [廖雪峰文档](https://www.liaoxuefeng.com/)  偏知识教程

- [开源文档合集](https://osdoc.net/spring/)  偏知识教程

**项目：**

- [Ruoyi后台管理系统](http://doc.ruoyi.vip/) 
- [ELADMIN（Spring boot）后台管理框架](https://eladmin.vip/) 
- [Art_Blog](https://gitee.com/luotf/Art_Blog) （基于Spring+SpringMVC+Mybatis架构的开源博客）
- 

## 技术名词

（待补充

### Java：

- jar包 

  - jar 包就是 zip 包，内容通常是类。jar 与 zip 唯一的区别就是在 jar 文件的内容中，包含了一个 META-INF/MANIFEST.MF 文件。

    > 该文件是在生成 jar 文件的时候自动创建的，作为jar里面的"详情单"，包含了该Jar包的版本、创建人和类搜索路径Class-Path等信息，当然如果是可执行Jar包，会包含Main-Class属性，表明Main方法入口，尤其是较为重要的Class-Path和Main-Class，



#### 项目：

- **bean** 实体类，对应数据库中的表，构造方法，属性，getter setter，toString()

- **dao** 持久层 数据库增删改查

- **service** 业务层
- **view** 层

- **controller** 控制层 跳转哪里



### resources：

　　**mapper** dao实现类
　　**applicationContext.xml** Spring的配置文档
　　**db.properties** 数据库连接信息
　　**log4j.properties** 日志配置文件
　　springmvc.xml 配置springmvc
　　

## 框架模式

### 三层架构

什么是三层架构？

**视图层view（表现层）**，**服务层service（业务逻辑层）**，**持久层Dao（数据访问层）**

<div style="text-align: center; width: 500px; border: green solid 1px;">
	<img src="C:\Users\Cypol\AppData\Roaming\Typora\typora-user-images\image-20231020142801742.png" alt="image-20231020142801742" style="zoom: 45%;" />
<div/>

1.**view层**：用于显示数据和接收用户输入的数据，为用户提供一种交互式操作的界面。主要作用是界面展示，接收请求，分发请求。


2.**service层**：实现业务的主要逻辑，是系统架构中体现核心价值的部分。将一个业务中所有的操作封装成一个方法，同时保证方法中所有的数据库更新操作，即保证同时成功或同时失败。避免部分成功部分失败引起的数据混乱操作。

3.**Dao层**：也称为是[持久层](https://so.csdn.net/so/search?q=持久层&spm=1001.2101.3001.7020)，其功能主要是**负责数据库的访问**（可以访问数据库、二进制文件、文本文件等），**是对数据库，而不是对数据的操作**。简单的说法就是实现对数据表的Select，Insert，Update，Delete的操作。如果要加入ORM的元素，那么就会包括对象和数据表之间的mapping，以及对象实体的持久化。也就是哪个类对应哪个表，哪个属性对应哪个列。持久层的目的就是，完成对象数据和关系数据的转换。

- 需要了解 JDBC技术 （考核要求中提到

### spring框架

Spring 是分层的 Java SE/EE 应用 轻量级开源框架

[spring开源文档](https://osdoc.net/spring/)

使用 Spring 的意义在于：**对于 bean 对象的实例管理更加方便，代码编写更加优雅，降低代码的耦合性，提升代码的扩展性。**

### MVC模式

[Spring MVC 开源文档](https://osdoc.net/springmvc/)

MVC 是一种使用 MVC（Model View Controller 模型-视图-控制器）设计创建 Web 应用程序的模式：

> **MVC模式**是软件工程中常见的一种软件架构模式，该模式把软件系统（项目）分为三个基本部分：**模型（Model）、视图（View）和控制器（Controller）。**MVC是**在三层架构的基础上**设计的一种框架型架构，三层架构是一种宏观的概念，而 MVC 就是一种比较具体的三层架构的框架实现。

MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。

- **Model（模型）** - 模型承载数据，对用户提交请求进行计算的模块，分为两类：
  1. 数据承载bean，数据承载bean是指实体类专门承载业务数据的，比如Student，User
  2. 业务承载bean，业务处理bean是指Service或者Dao对象，专门处理用户的请求的。 

- **View（视图）** - 视图代表模型包含的数据的可视，为用户提供使用界面，与用户进行交互。 
- **Controller（控制器）** - 控制器作用于模型和视图上，用来将用户请求转发给相应的Model进行处理，并且根据Model的计算结果向用户提供相应的响应。

<img src="C:\Users\Cypol\AppData\Roaming\Typora\typora-user-images\image-20231020223708913.png" alt="image-20231020223708913" style="zoom:50%;" />

<img src="C:\Users\Cypol\AppData\Roaming\Typora\typora-user-images\image-20231020205426999.png" alt="image-20231020205426999" style="zoom:50%;" />

#### MVC与三层架构的区别

MVC架构里面的Controller以及View层合并在一起就是三层架构的View层，而MVC的Model层就包含了三层架构的Service层以及Dao层。

### SSM框架

SSM，即SpringMVC，Spring与Mybatis的统称。

#### **SpringMVC**：

作为view的实现者，它的controller作为整个应用的控制器，完成用户请求的转发和对用户的响应。 Spring MVC是主流的**Web前端框架**。

#### **Mybatis**：

作为Dao的实现者，完成数据库的增伤改查等功能。

#### **Spring**：

是service同时也是整个应用的大管家，整个应用中所有的bean的生命周期行为，都是由Spring来管理的，就是说整个应用中所有的对象的创建，初始化，销毁，以及对象之间关联的关系维护，都是由Spring来进行管理。

#### SSM与三层架构的对应关系

> 表现层————SpringMVC
> 业务层————手写需求
> 持久层————MyBatis
> Spring则控制整个项目中对象的创建与管理。

<img src="C:\Users\Cypol\AppData\Roaming\Typora\typora-user-images\image-20231020223320476.png" alt="image-20231020223320476" style="zoom:50%;" />

1.SpringMVC:作为view的实现者，它的controller作为整个应用的控制器，完成用户请求的转发和对用户的响应。 

2.Mybatis:作为Dao的实现者，完成数据库的增伤改查等功能。 

3.Spring：是整个应用的大管家，整个应用中所有的bean的生命周期行为，都是由Spring来管理的，就是说整个应用中所有的对象的创建，初始化，销毁，以及对象之间关联的关系维护，都是由Spring来进行管理。 



### SpringBoot

Spring Boot 为简化 Spring 应用开发而生，Spring Boot 中的 **Boot** 一词，即为快速启动的意思。Spring Boot 可以在零配置情况下一键启动，简洁而优雅。

## maven

[廖雪峰](https://www.liaoxuefeng.com/wiki/1252599548343744/1255945359327200)

### maven是什么？

据官网英文:

> Apache Maven is a software **project management** and **comprehension tool**. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

Maven是专门为Java项目打造的**管理和构建工具**，它的主要功能有：

- 提供了一套标准化的项目结构；
- 提供了一套标准化的构建流程（编译，测试，打包，发布……）；
- 提供了一套依赖管理机制。

总而言之，maven就是项目和包的管理工具。

### Maven项目结构

一个使用Maven管理的普通的Java项目，它的目录结构默认如下：

```ascii
a-maven-project
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       ├── java
│       └── resources
└── target
```

- `a-maven-project `
  - 项目的根目录，项目名
- `pom.xml` 
  - 项目描述文件
- `src/main/java` 
  - 存放Java源码的目录
- `src/main/resources` 
  - 存放资源文件的目录
- `src/test/java` 
  - 存放测试源码的目录
- `src/test/resources` 
  - 存放测试资源的目录
- `target`
  - 所有编译、打包生成的文件

`这些就是一个Maven项目的标准目录结构`

### 项目描述文件

最关键的一个项目描述文件`pom.xml`

里面内容包含很多信息，例如：

```xml
<project ...>
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.itranswarp.learnjava</groupId>
	<artifactId>hello</artifactId>
	<version>1.0</version>
	<packaging>jar</packaging>
	<properties>
        ...
	</properties>
	<dependencies>
        <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.2</version>
        </dependency>
	</dependencies>
</project>
```

1. `groupId` 类似于Java的包名，通常是公司或组织名称
2. `artifactId `类似于Java的类名，通常是项目名称
3. `version `版本

一个Maven工程就是由`groupId`，`artifactId`和`version`作为唯一标识。

在引用其他第三方库的时候，也是通过这3个变量确定。例如，依赖`commons-logging`：

```xml
<dependency>
    <groupId>commons-logging</groupId>
    <artifactId>commons-logging</artifactId>
    <version>1.2</version>
</dependency>
```

使用`<dependency>`声明一个依赖后，Maven就会自动下载这个依赖包并把它放到classpath中。

### 依赖管理

### 依赖关系

Maven定义了几种依赖关系，分别是`compile`、`test`、`runtime`和`provided`：

| scope    | 说明                                          | 示例            |
| :------- | :-------------------------------------------- | :-------------- |
| compile  | 编译时需要用到该jar包（默认）                 | commons-logging |
| test     | 编译Test时需要用到该jar包                     | junit           |
| runtime  | 编译时不需要，但运行时需要用到                | mysql           |
| provided | 编译时需要用到，但运行时由JDK或某个服务器提供 | servlet-api     |

其中，默认的`compile`是最常用的，Maven会把这种类型的依赖直接放入classpath。

`test`依赖表示仅在测试时使用，正常运行时并不需要。最常用的`test`依赖就是JUnit：

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.3.2</version>
    <scope>test</scope>
</dependency>
```

### 唯一ID

对于某个依赖，Maven只需要3个变量即可唯一确定某个jar包：

- groupId：属于组织的名称，类似Java的包名；
- artifactId：该jar包自身的名称，类似Java的类名；
- version：该jar包的版本。

通过上述3个变量，即可唯一确定某个jar包。Maven通过对jar包进行PGP签名确保任何一个jar包一经发布就无法修改。修改已发布jar包的唯一方法是发布一个新版本。

## 数据库 （SQL）

[廖雪峰学习文档](https://www.liaoxuefeng.com/wiki/1177760294764384)

企业中大部分业务数据都是用关系型数据库存储。

**数据库（Database）**是按照数据结构来组织、存储和管理数据的仓库。

**关系型数据库，**是建立在关系模型基础上的数据库，借助于集合代数等数学概念和方法来处理数据库中的数据。关系型**数据库管理系统（RDBMS）**特点如下：

- 数据以表格的形式出现
- 每行为各种记录名称
- 每列为记录名称所对应的数据域
- 许多的行和列组成一张表单
- 若干的表单组成database

RDBMS的一些术语：

- **数据库:** 数据库是一些关联表的集合。
- **关联表**：两个表之间的多对多（M:N）关系。在多对多关系中，一个表中的条目可以与另一个表中的多个条目相关联，反之亦然。
- **数据表:** 表是数据的矩阵。在一个数据库中的表看起来像一个简单的电子表格。
- **列:** 一列(数据元素) 包含了相同类型的数据, 例如邮政编码的数据。
- **行：**一行（元组，或记录）是一组相关的数据，例如一条用户订阅的数据。
- **冗余**：存储两倍数据，冗余降低了性能，但提高了数据的安全性。
- **键**：键（Key）就是用来识别实体的。换句话说，键可以用来确定表中具体的一行记录。
- **主键**：主键是唯一的。一个数据表中只能包含一个主键。可以使用主键来查询数据。
- **外键：**外键用于关联两个表。
- **复合键**：复合键（组合键）将多个列作为一个索引键，一般用于复合索引。
- **索引：**使用索引可快速访问数据库表中的特定信息。索引是对数据库表中一列或多列的**值进行排序**的一种结构。类似于**书籍的目录**。
- **参照完整性:** 参照的完整性要求关系中不允许引用不存在的实体。与实体完整性是关系模型必须满足的完整性约束条件，目的是保证数据的一致性。

### MySQL

[学习文档](https://www.sjkjc.com/mysql/getting-started/)

~~[菜鸟](https://www.runoob.com/mysql/mysql-install.html)~~

#### 知识

- 基本概念
- MySQL 搭建
- SQL 语句编写
- 约束
- 索引
- 事务
- 设计数据库表
- 性能优化

#### 基本概念

MySQL 为关系型数据库(Relational Database Management System)，是一种关联数据库管理系统,，这种所谓的"关系型"可以理解为"表格"的概念,，一个关系型数据库由一个或数个表格组成。关联数据库将数据保存在不同的表中，而不是将所有数据放在一个大仓库内，这样就增加了速度并提高了灵活性。

<img src="https://www.runoob.com/wp-content/uploads/2014/03/0921_1.jpg" alt="mysql" style="zoom: 67%;" />

- 表头(header): 每一列的名称;
- 列(col): 具有相同数据类型的数据的集合;
- 行(row): 每一行用来描述某条记录的具体信息;
- 值(value): 行的具体信息, 每个值必须与该列的数据类型相同;
- **键(key)**: 键的值在当前列中具有唯一性。

#### MySQL 搭建

好麻烦。。。

[看这文档一步步来了](https://www.sjkjc.com/mysql/install-on-windows/)

#### SQL 语句编写

SQL是操作和检索关系型数据库的**标准语言**，标准SQL语句可用于操作关系型数据库。

5大主要类型：

1. DQL（Data Query Language，数据查询语言）语句**，**主要由于select关键字完成，查询语句是SQL语句中最复杂，功能最丰富的语句。
2. DML（Data Munipulation Language，数据操作语言）语句，DML语句修改后数据将保持较好的一致性；操作表的语句，如增插insert、更新update、删除delete等；
3. DDL（Data Definition Language，数据定义语言）语句，操作数据对象的语言，包括创建create、删除drop、修改alter数据库对象。
4. DCL（Data Control Language，数据控制语言）语句，主要有grant、revoke语句。
5. 事务控制语句**：**主要有commit、rollback和savepoint三个关键字完成

注意：

1. SQL 对大小写不敏感：SELECT 与 select 是相同的；
2. MySQL 的SQL语句以分号 (;) 作为结束标识。

#### 设计数据库表

做一个学生管理系统，要能想到需要哪些表，比如学生表、班级表；

每个表需要哪些字段、字段类型

### ORM

**对象关系映射（Object Relational Mapping，简称ORM）模式是一种为了解决面向对象与关系数据库存在的互不匹配的现象的技术**。

> ORM框架是连接数据库的桥梁，只要提供了持久化类与表的映射关系，ORM框架在运行时就能参照映射文件的信息，把对象持久化到数据库中。
>
> **ORM框架：为了解决面型对象与关系数据库存在的互不匹配的现象的框架。**
>
> 当前ORM框架主要有五种：
> （1）Hibernate 全自动 需要写hql语句
> （2）iBATIS 半自动 自己写sql语句,可操作性强,小巧
> （3）**Mybatis**
> （4）eclipseLink
> （5）JFinal

学习 https://www.cnblogs.com/xiaotian0422/p/16496908.html

#### Mybatis

> mybatis是一款用于持久层的、轻量级的半自动化ORM框架，封装了所有jdbc操作以及设置查询参数和获取结果集的操作，支持自定义sql、存储过程和高级映射。

学习 https://blog.csdn.net/chaizepeng/article/details/119384531

##### MyBatis Generator

> mybatis-geneator是一款mybatis自动代码生成工具，可以通过配置，根据数据库中的表，快速生成DAO、POJO，xml，供mybatis使用的实体类，接口类。

##### ~~PageHelper~~

~~MyBatis分页查询，可能用不到，有空就看~~

~~https://pagehelper.github.io/~~

### Navicat

Navicat是一个可多重连接的**数据库管理工具**。

> 它可以让用户连接到本机或远程服务器、提供一些实用的数据库工具如数据模型、数据传输、数据同步、结构同步、导入、导出、备份、还原、报表创建工具及计划以协助管理数据。
>
> 
>
> **Navicat**的功能可以满足专业开发人员的所有需求，对数据库服务器的新手来说学习起来也不难。由于具有图形用户界面（GUI），Navicat可以简便、安全地创建、组织、访问和共享信息。

~~好像群内存在破解版~~

### JDBC

编写SQL语句,操作数据库

## Apache Shiro

是 Java 的一个安全框架。

> Shiro 可以非常容易的开发出足够好的应用，其不仅可以用在 JavaSE 环境，也可以用在 JavaEE 环境。
>
> Shiro 可以帮助我们完成：认证、授权、加密、会话管理、与 Web 集成、缓存等。

## Servlet

### Servlet

Java Servlet 是运行在 Web 服务器或应用服务器上的程序，它是作为来自 Web 浏览器或其他 HTTP 客户端的请求和 HTTP 服务器上的数据库或应用程序之间的中间层。

> Servlet 是 Server Applet 的缩写，译为“服务器端小程序”，是 Sun 公司推出的一种基于 Java 的动态网站开发技术。
>
> 
>
> Servlet 编写 Servlet 代码需要遵循 Java 语法，一个 Servlet 程序其实就是一个按照 Servlet 规范编写的 Java 类。
>
> 
>
> Servlet 程序需要先编译成字节码文件（`.class`文件），然后再部署到服务器运行。
>
> 
>
> Servlet 虽然被称作“小程序”，但是它的功能却异常强大，因为它是基于 Java 的，几乎可以使用所有的 Java API，Java 能做的事情，Servlet 也能做。

学习资料 https://c.biancheng.net/servlet2/what-is-servlet.html

### Servlet容器

> Servlet容器也叫做Servlet引擎，是Web服务器或应用程序服务器的一部分，用于在发送的请求和响应之上提供网络服务，解码基于 MIME的请求，格式化基于MIME的响应。Servlet没有main方法，不能独立运行，它必须被部署到Servlet容器中，由容器来实例化和调用 Servlet的方法（如doGet()和doPost()），Servlet容器在Servlet的生命周期内包容和管理Servlet。在JSP技术 推出后，管理和运行Servlet/JSP的容器也称为Web容器。

#### Tomcat

> Tomcat是一个免费的开放源代码的Servlet容器。

## Java

[学习文档](https://osdoc.net/?tags=java)

