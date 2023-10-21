# Day-03

`2023.10.20 周六 雨`

今天并没有怎么运动。。上了实验课，好多作业要做，人不是很好了。

学习时间：*大约 4小时*

本想周末冲刺一次多学会，但我发现我周末反而冲不起来。

# 本日计划

初定为：

1. 继续Day-02所列出的内容
2. 部署好开发环境
3. 开始学习MySQL
4. Maven。
5. 分析类似项目 https://github.com/ZeroWdd/studentmanager



# 目录

[toc]

# 学习内容

## Java包术语



## Maven

书接上回。

### 目录结构

Maven约定了一套规则来创建和构建我们的项目。在项目的目录结构上，Maven有一套约定的通用的目录结构。

> 使用一套通用的目录结构的好处是，可以减少开发人员熟悉不同Maven项目时的认知负担。在使用相同的目录结构的情况下，开发人员可以很快的熟悉一个项目。

```
${basedir}
|-- pom.xml
|-- src
|	|-- main
|	|	`-- java
|	|	`-- resources
|	|	`-- filters
|	`-- test
|	|	`-- java
|	|	`-- resources
|	|	`-- filters
|	`-- it
|	`-- assembly
|	`-- site
`-- LICENSE.txt
`-- NOTICE.txt
`-- README.txt
```

- `src/main/java` **源代码**所在的目录
- `src/main/resources` 资源文件**所在的目录
- `src/main/filters` 资源**过滤文件**所在的目录
- `src/main/webapp` 如果是web项目，则该目录是**web应用源代码**所在的目录，比如html文件和web.xml等都在该目录下。
- `src/test/java` 测试代码所在的目录
- `src/test/resources` 测试相关的资源文件所在的目录
- `src/test/filters` 测试相关的资源过滤文件所在的目录

上面的目录结构，我们接触的比较多，而下面的这些目录结构，用的相对不是很多：

- `src/it` 集成测试代码所在的目录，主要是供别的插件使用的。
- `src/assembly` 组件（Assembly）描述符所在的目录
- `src/site` 站点文件
- `LICENSE.txt` 项目的许可文件
- `NOTICE.txt` 该项目依赖的库的注意事项
- `README.txt` 项目的readme文件

> 在根目录下，主要有两个目录，分别是`src`和`target`目录，除此之外，还会有一些版本控制系统的元数据文件，包括git的`.gitignore`或者svn的`.svn`。如果一个项目时由多个子项目组成的，那么在该项目的根目录下，还会包含它的子项目的目录。子项目的目录布局，默认也是和上面列出的目录结构一致的。
>
> `target`目录，这个目录只要用于存放项目构建的输出文件，比如class文件以及打包后的包文件等。
>
> `src`目录，包含了项目所有的源代码和资源文件，以及其他项目相关的文件。
>
> > 在该目录的`main`目录下，包含了构建该项目的artifact（可以理解为时项目的程序部分）所需的代码和资源，而`test`目录包含了测试相关的代码和资源文件。
>
>  在目录`main`和`test`下的子目录结构，是非常相似的，都包含了两个子目录：`java`子目录和`resources`子目录，这两个目录分别放了源代码和资源文件。不同的是，在`main`目录下的这两个目录中放置了项目主程序的代码，而在`test`目录下，放置的是测试相关的代码和资源文件。其中`java`目录是代码的根目录，在该目录下的子目录，就是Java的包名对应的目录结构了。

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



## 数据库

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