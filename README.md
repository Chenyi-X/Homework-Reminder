# Homework-Reminder

Remind you to do homework before DDL.

[toc]

## 部署



## 依赖



## 目录结构



## 数据库设计(实体类)

### 用户

#### 用户信息表

```mysql
create table userInformation
(
    `user_id` varchar(18)  auto_increment,
    `password` varchar(255) not null,
    `user_name` varchar(15),
    `user_age`  int unsigned check ( `user_age` < 150 ),
    `roleid` int not null,
    PRIMARY KEY(`user_id`)
)default charset=utf8;
```

#### 角色表

```mysql
create table userRole
(
    `roleid` int,
    `rolename` varchar(12) not null unique,
    `menulist` varchar(255) not null
    PRIMARY KEY(`roleid` )
)default charset=utf8;
```

### 作业

#### 作业信息表

id主键

标题

内容

截止日期

优先级

```mysql
create table homeworkInformation
(
	`hwid` int auto_increment,
	`title` varchar(255) not null unique,
	`content` LONGTEXT not null,
	`ddl` DATE not null,
    `prid` int not null,
    PRIMARY KEY(`hwid`)
)default charset=utf8;
```

#### 优先级表

0-优先级较低

1-优先级中等

2-优先级较高

```mysql
create table priority
(
	`prid` INT,
    `priority_name` varchar(12) not null unique,
    PRIMARY KEY(`prid`)
)default charset=utf8;
```

### 初始化数据

#### 初始化角色表

```mysql
insert into userRole values(0,'超级管理员','作业创建|作业编辑|搜索作业|删除作业|个人信息管理|用户管理');
insert into userRole values(1,'用户','作业创建|作业编辑|搜索作业|删除作业|个人信息管理');
```

#### 初始化优先级表

```mysql
insert into priority values(0,'低');
insert into priority values(1,'中',);
insert into priority values(2,'高',);
```

### 数据库配置



## 主要功能 

### 用户角色

管理员（admin），用户（user）

1. 用户：注册，登录，设置个人信息，管理作业
2. 管理员：具有所有用户的功能，且能操作所有用户。

### 管理作业

创建、编辑、搜索 (精确搜索) 和删除作业。

