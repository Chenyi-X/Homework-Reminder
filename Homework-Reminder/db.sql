
-- 创建用户信息表
CREATE TABLE IF NOT EXISTS user_information (
    user_id INT AUTO_INCREMENT,
    password VARCHAR(255) NOT NULL,
    user_name VARCHAR(15),
    user_age INT UNSIGNED CHECK (user_age < 150),
    role_id INT NOT NULL,
    PRIMARY KEY(user_id)
) DEFAULT CHARSET=UTF8;

-- 创建角色表
CREATE TABLE IF NOT EXISTS user_role (
    role_id INT,
    role_name VARCHAR(12) NOT NULL UNIQUE,
    menu_list VARCHAR(255) NOT NULL,
    PRIMARY KEY(role_id)
) DEFAULT CHARSET=UTF8;

-- 创建作业信息表
CREATE TABLE IF NOT EXISTS homework_information (
    hw_id INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL UNIQUE,
    content LONGTEXT NOT NULL,
    ddl DATE NOT NULL,
    pr_id INT NOT NULL,
    PRIMARY KEY(hw_id)
) DEFAULT CHARSET=UTF8;

-- 创建优先级表
CREATE TABLE IF NOT EXISTS priority (
    pr_id INT,
    priority_name VARCHAR(12) NOT NULL UNIQUE,
    PRIMARY KEY(pr_id)
) DEFAULT CHARSET=UTF8;

-- 初始化优先级表数据
INSERT INTO priority VALUES (0,'低');
INSERT INTO priority VALUES (1,'中');
INSERT INTO priority VALUES (2,'高');

-- 初始化角色表数据
INSERT INTO user_role VALUES (0,'超级管理员','作业创建|作业编辑|搜索作业|删除作业|个人信息管理|用户管理');
INSERT INTO user_role VALUES (1,'用户','作业创建|作业编辑|搜索作业|删除作业|个人信息管理');
