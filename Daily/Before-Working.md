# Before-Working



##### 自我介绍^^

这是一份关于挑战14天左右从0开始，开发出**作业管理系统**的学习文档及日常学习记录。我会在这里记录我是如何开始这一份项目，我的计划，我的每一天的学习内容和开发进度等。说实话难度很大，非常具有挑战性。

项目地址：https://github.com/Chenyi-X/Homework-Reminder

博客更新：微信公众号**[*公式痛哭*](https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=Mzg2NzgzNzE1Nw==&scene=117#wechat_redirect)** 

## 如何开启一个项目

### **我的思考如下：**

1. 如何开启一个项目，一开始说实话没什么头绪，于是我想有无**范例**可参考？
   - （暂无搜寻到较好的参考，后续更新补充
   - 可能有点类似博客管理系统
   - https://blog.csdn.net/weixin_45019350/article/details/108869025
2. 开发项目的流程是什么？
   - 寻找范例
     - https://www.cnblogs.com/hanyinglong/archive/2013/01/21/2870494.html
   - 参照教程
     - [个人开发总结](https://blog.csdn.net/qq_40772692/article/details/124289779)
3. 我需要会的技术是什么
   - 取决于我需要实现的功能
   - 因此先进行分析
4. 了解一些技术概念术语（不深究
   1. s
5. 制定开发计划，学习技术，写开发文档，coding~



## 考核任务分析

这是一个作业管理系统，用于提醒用户有哪些作业没完成，其它还要一些零碎的功能。用户和管理员需要前端（或黑窗口）**交互**，~~交流点赞~~，管理作业等；需要后端处理业务逻辑，管理数据库。

### **需要实现（不知道能不能实现）的feature：**

1. 用户管理
2. 作业管理
3. 进度跟踪
4. 进度跟踪
5. 安全性 （加密储存
6. 记录操作日志
7. 提醒功能
   - 系统可以自动对将要ddl的作业发出提醒
   - *~~了解线程池的原理和使用~~*
   - *可以使用外部框架*
8. 使用mysql数据库对数据进行持久化操作
   - 使用mysql模糊查询
   - jdbc，封装工具类
9. mvc三层架构
10. 使用缓存, 加快用户列表和作业列表的展示
11. 简单JavaWeb
    - ajax
    - 前端框架和组件库
    - 前后端分离

### **代码要求**

1. Java语言	Java8

   - 使用Stream流操作集合

   - 使用Optional优化判空操作

2. 单元测试 

3. 异常处理

### 允许使用的第三方工具

- MySQL连接驱动
- Servlet包
- JSON序列化工具
- Apache commons包、Apache IO包
- Junit包
- 需求里出现的包
  - 都有啥我忘了
  - 前端框架和库
  - ajax
- maven

## 计划&开发

### Learning：

1. Git
2. Github
3. MarkDown
4. MySQL
5. Java基础
6. MVC三层架构 & 设计模式
7. Java高级
8. 多线程，线程池
9. 第三方包 & maven
10. 缓存
11. 后端框架
    - Spring
    - Spring MVC
    - MyBatis
    - Spring Boot
    - Spring Cloud
12. 前端框架

### 开发计划 （后续慢慢完善

`总的来说计划是 边学边开发，按照feat列表由简到易进行。`

#### 项目架构

##### 技术栈介绍

- ~~好像没什么好介绍的~~

##### 运行环境

- Java8

- 开发工具：IDEA

##### 架构设计与分析

整个项目采用主流的**前后端分离项目**架构	

项目的用例设计思路如下：

> - 基本用例：作业，作业列表展示、作业详情展示、作业的搜索、查看并更新作业的进度、作业添加备注，作业的统计信息，登陆/注册、查看别人公开的作业完成情况/点赞，提醒功能，注销。
> - 权限等级：admin>user
>   - admin：
>     - 拥有作业系统的所有权限，用户的所有权限，可以登陆后台管理系统，
>     - 添加、编辑和删除用户。
>     - 查看用户的作业的统计信息，包括作业总数、已完成作业数、进行中作业数等。
>     - 可以对用户进行权限管理，包括user和admin角色的区分。
>     - 可以对用户的作业内容进行审核, 避免出现不合规的内容
>   - user：
>     - 用户可以登录注册系统，设置自己的个人信息。
>     - 用户可以查看
>       - 自己的作业列表
>       - 作业的详细信息。
>       - 作业的进度，包括作业的状态（待处理、进行中、已完成）等。
>     - 用户拥有对作业详细信息的修改权限
>       - 用户可以给作业添加备注
>       - 作业可包括标题、内容、截止日期等属性。
>       - 作业可以设置优先级（高、中、低）。
>     - 用户查看别人公开的作业完成情况,可以点赞。
>     - 用户可以创建、编辑、搜索和删除作业。

#### 后端开发

~~在后端开发中，我们使用[SpringBoot2](https://so.csdn.net/so/search?q=SpringBoot2&spm=1001.2101.3001.7020).6.3作为后端服务开发框架，用mysql8.0作为关系数据库，整合MyBatis作为数据库交互框架，并使用Redis作为数据缓存工具。在项目架构方面，我们使用MVC三层架构划分业务逻辑，其详细介绍如下：~~(后期修改完善)

> - Dao层：Dao层接口是数据库交互的直接层，该层只提供简单的数据库交互操作，包括增删改查，只返回基本的结果集封装。Dao层只与Service层交互，每一个Dao层方法是一个基本的数据单元操作。
> - Service层：Service层提供业务的逻辑处理封装，缓存@Cacheable和事务@Transactional管理集中在Service层处理，所以涉及缓存、业务逻辑封装、事务管理的所有操作集中在Service层，并且Service层也只处理返回中间结果形式！Service层向上为其他各层提供具体的逻辑处理方法，每一个Service层方法是一个基本的逻辑单元操作（可能包含多个数据单元操作）。
> - Controller层：Controller层主要对前端接收匹配Request请求，并交由Service处理。提供主要的业务流程控制，并不进行业务逻辑的具体实现，该层不涉及不体现缓存和事务相关操作，返回最终响应结果ResultVo。Controller与前端交互，控制处理流程。

~~（这是照抄的模板~~

在权限管理方面，使用Shiro+JWT的方式（现在主流可能是SpringSecurity，但Shiro比较简单和通用），将项目的权限管理大部分集中到后端处理，并实现Token自动刷新+Token注销后失效机制。 

##### 数据库设计

1. **user 用户表**
2. **blog 博客表** 

##### 统一结果封装

##### ~~全局异常处理~~

##### 整合Redis缓存

**RedisConfig配置** 

##### ~~权限管理~~

##### 分页查询处理

##### 多表查询处理

##### 后端接口实现

#### 前端开发

前端使用[Vue2](https://so.csdn.net/so/search?q=Vue2&spm=1001.2101.3001.7020).9.6框架开发，开发IDE为WebStorm。其中，前端开发使用Axios作为前后端异步通信工具，结合Vuetify+ElementUI快速搭建前端页面，并使用Vuex作为数据存储媒介，VueRouter控制前端跳转路由。除此之外，还引入了很多第三方的插件，比如animated动画渲染、InfiniteLoading无限加载、highlight.js代码高亮、mavonEditor 编辑插件等。下面将简单展示前端项目的界面布局。

（随便搬一个来用吧。）

#### 项目部署

无法部署。