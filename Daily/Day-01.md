# Day-01 



`2023.10.19 周四 雨`

学习时间：*大约 5 小时*

# 目录

[TOC]



# 本日目标计划

- ### 完成**准备工作**（文档书写与环境配置）
  
  - 考核任务分析
  - 学习计划制定
  - 学习资源选择
  - 前置准备工作与基础知识
    - IDEA下载安装
    - MySQL
    - 需要用到的包安装管理
    - 等等

- ### 基本shell命令

- ### 掌握Git

  - 原理
  - 基本操作
  - remote操作
  - commit 规范

- ### Github

  - Github与Git联合使用
  - Github注册登录创建仓库流程
  - 使用规范
  - SSH，token登录等

- ### MarkDown

  - 语法
  - 编辑器

- ### 文档的书写 与 博客选择

  - Typora编辑Daily
  - mdnice排版编辑好的MD并转换格式
  - 转换后在公众号 “公式痛哭” 每日发布
  - 更新仓库

# 本日学习心得

先把一些前置的技术学会，再按照实际需求来开发会更快入门开始。

今日先把文档书写相关技术技能掌握。

然后再把代码提交相关技术掌握。

总的来说本日学习目标不难实现。

# 学习内容

## MARKDOWN

### 编辑器

#### Typora

##### 主题

换了几款好看好用的主题，尝试了自定义主题内的CSS文件对主题换字体和修改等。

#### 快捷键

- ctrl123456标题
- 任务列表
- 数字列表
- 下划线
- 强调
- 代码块
- 查看源码快捷键
- 引用
- 插入html，css

#### MarkDownX

Android的MD编辑器。

### 在线编辑器

#### mdnice墨滴

#### [在线markdown编辑器](https://markdown.com.cn/editor/)

### 语法

> ```markdown
> ## 一级标题
> 
> #### 二级标题
> 
> ###### 三级标题
> 
> ###### 2.2 字体
> 
> 粗体、斜体、粗体和斜体，删除线，需要在文字前后加不同的标记符号。如下：
> 
> **这个是粗体**
> 
> *这个是斜体*
> 
> ***这个是粗体加斜体***
> 
> ~这里想用删除线~~
> 
> 注：如果想给字体换颜色、字体或者居中显示，需要使用内嵌HTML来实现。
> 
> ###### 2.3 无序列表
> 
> 无序列表的使用，在符号`-`后加空格使用。如下：
> 
> - 无序列表 1
> - 无序列表 2
> - 无序列表 3
> 
> 如果要控制列表的层级，则需要在符号`-`前使用空格。如下：
> 
> - 无序列表 1
> - 无序列表 2
>   - 无序列表 2.1
>   - 无序列表 2.2
> 
> **由于微信原因，最多支持到二级列表**。
> 
> ###### 2.4 有序列表
> 
> 有序列表的使用，在数字及符号`.`后加空格后输入内容，如下：
> 
> 1. 有序列表 1
> 2. 有序列表 2
> 3. 有序列表 3
> 
> ###### 2.5 引用
> ```

> 此外，还可内嵌html和css样式。

## Shell

### 命令

```shell
cd
ls
...
```



## Git

### 配置

> ```shell
> git config -e [--global] ## 编辑Git配置文件
> 
> git config --global user.name yanhaijing
> git config --global user.email yanhaijing@yeah.net
> 
> git config --list ##查看配置的信息
> 
> git help config ##获取帮助信息
> ```

### 新建仓库

```shell
git init ##初始化
git status ##获取状态
git add [file1] [file2] ... ##.或*代表全部添加
git commit -m "message" ##此处注意乱码
git remote add origin git@github.com:yanhaijing/test.git ##添加源
git push -u origin master ##push同事设置默认跟踪分支
```

### 从现有仓库克隆

```shell
git clone git://github.com/xxx	
git clone git://github.com/xxx mypro##克隆到自定义文件夹
```

### 本地

```shell
git add * ## 跟踪新文件
git add -u [path] ## 添加[指定路径下]已跟踪文件

rm *&git rm * ## 移除文件
git rm -f * ## 移除文件
git rm --cached * ## 停止追踪指定文件，但该文件会保留在工作区
git mv file_from file_to ## 重命名跟踪文件

git log ## 查看提交记录

git commit ## 提交更新	
git commit [file1] [file2] ... ## 提交指定文件	
git commit -m 'message'
git commit -a ## 跳过使用暂存区域，把所有已经跟踪过的文件暂存起来一并提交
git commit --amend##修改最后一次提交
git commit -v ## 提交时显示所有diff信息

git reset HEAD *##取消已经暂存的文件
git reset --mixed HEAD *##同上
git reset --soft HEAD *##重置到指定状态，不会修改索引区和工作树
git reset --hard HEAD *##重置到指定状态，会修改索引区和工作树
git reset -- files##重置index区文件

git revert HEAD ##撤销前一次操作
git revert HEAD~ ##撤销前前一次操作
git revert commit #### 撤销指定操作

git checkout -- file##取消对文件的修改（从暂存区——覆盖worktree file）
git checkout branch|tag|commit -- file_name##从仓库取出file覆盖当前分支
git checkout -- .##从暂存区取出文件覆盖工作区

git diff file ##查看指定文件的差异
git diff --stat ##查看简单的diff结果
git diff ##比较Worktree和Index之间的差异
git diff --cached ##比较Index和HEAD之间的差异
git diff HEAD ##比较Worktree和HEAD之间的差异
git diff branch ##比较Worktree和branch之间的差异
git diff branch1 branch2 ##比较两次分支之间的差异
git diff commit commit ##比较两次提交之间的差异


git log ##查看最近的提交日志
git log --pretty=oneline ##单行显示提交日志
git log --graph ## 图形化显示
git log --abbrev-commit ## 显示log id的缩写
git log -num ##显示第几条log（倒数）
git log --stat ## 显示commit历史，以及每次commit发生变更的文件
git log --follow [file] ## 显示某个文件的版本历史，包括文件改名
git log -p [file] ## 显示指定文件相关的每一次diff

git stash ##将工作区现场（已跟踪文件）储藏起来，等以后恢复后继续工作。
git stash list ##查看保存的工作现场
git stash apply ##恢复工作现场
git stash drop ##删除stash内容
git stash pop ##恢复的同时直接删除stash内容
git stash apply stash@{0} ##恢复指定的工作现场，当你保存了不只一份工作现场时。
```

### 分支

```shell
git branch##列出本地分支
git branch -r##列出远端分支
git branch -a##列出所有分支
git branch -v##查看各个分支最后一个提交对象的信息
git branch --merge##查看已经合并到当前分支的分支
git branch --no-merge##查看为合并到当前分支的分支
git branch test##新建test分支
git branch branch [branch|commit|tag] ## 从指定位置出新建分支
git branch --track branch remote-branch ## 新建一个分支，与指定的远程分支建立追踪关系
git branch -m old new ##重命名分支
git branch -d test##删除test分支
git branch -D test##强制删除test分支
git branch --set-upstream dev origin/dev ##将本地dev分支与远程dev分支之间建立链接

git checkout test##切换到test分支
git checkout -b test##新建+切换到test分支
git checkout -b test dev##基于dev新建test分支，并切换

git merge test##将test分支合并到当前分支
git merge --squash test #### 合并压缩，将test上的commit压缩为一条

git cherry-pick commit ##拣选合并，将commit合并到当前分支
git cherry-pick -n commit ##拣选多个提交，合并完后可以继续拣选下一个提交

git rebase master##将master分之上超前的提交，变基到当前分支
git rebase --onto master 169a6 ##限制回滚范围，rebase当前分支从169a6以后的提交
git rebase --interactive ##交互模式	
git rebase --continue## 处理完冲突继续合并	
git rebase --skip## 跳过	
git rebase --abort## 取消合并
```

### 远端

```shell
git fetch origin remotebranch[:localbranch]## 从远端拉取分支[到本地指定分支]

git merge origin/branch##合并远端上指定分支

git pull origin remotebranch:localbranch## 拉取远端分支到本地分支

git push origin branch##将当前分支，推送到远端上指定分支
git push origin localbranch:remotebranch##推送本地指定分支，到远端上指定分支
git push origin :remotebranch ## 删除远端指定分支
git push origin remotebranch --delete ## 删除远程分支
git branch -dr branch ## 删除本地和远程分支
git checkout -b [--track] test origin/dev##基于远端dev分支，新建本地test分支[同时设置跟踪]
```

### 源

git是一个分布式代码管理工具，所以可以支持多个仓库，在git里，服务器上的仓库在本地称之为remote。

个人开发时，多源用的可能不多，但多源其实非常有用。

```shell
git remote add origin1 git@github.com:yanhaijing/data.js.git

git remote##显示全部源
git remote -v##显示全部源+详细信息

git remote rename origin1 origin2##重命名

git remote rm origin##删除

git remote show origin##查看指定源的全部信息
```

### 标签

当开发到一定阶段时

```shell
git tag##列出现有标签	

git tag v0.1 [branch|commit] ## [从指定位置]新建标签
git tag -a v0.1 -m 'my version 1.4'##新建带注释标签

git checkout tagname##切换到标签

git push origin v1.5##推送分支到源上
git push origin --tags##一次性推送所有分支

git tag -d v0.1##删除标签
git push origin :refs/tags/v0.1##删除远程标签
```

```shell
git help *##获取命令的帮助信息
git status##获取当前的状态，非常有用，因为git会提示接下来的能做的操作
```

救命的命令

```shell
git reflog ## 显示最近操作的commit id
```



## GitHub

### **登录**

### **注册**

### **创建仓库**

create

### **使用规范**

pull request 

个人项目直接push

### 获取TOKEN令牌

