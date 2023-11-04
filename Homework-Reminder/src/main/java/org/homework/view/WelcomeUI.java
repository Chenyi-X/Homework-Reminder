package org.homework.view;

import org.homework.common.CommonClass;
import org.homework.controller.WelcomeController;

import java.util.Scanner;

public class WelcomeUI {

    public static void show() {
        System.out.println("--------欢迎使用学生管理系统--------");
        System.out.println("|         1. 登录               |");
        System.out.println("|         2. 注册               |");
        System.out.println("|         3. 退出               |");
        System.out.println("---------------------------------");
        System.out.print("请输入你的选择：");

        CommonClass.choose = CommonClass.in.nextLine();

        WelcomeController.isContinue(true);
    }
}
