package org.homework.ui;

import org.homework.controller.WelcomeController;

import java.util.Scanner;

public class WelcomeUI {
    private static Scanner in = new Scanner(System.in);

    public static void show() {
        System.out.println("--------欢迎使用学生管理系统--------");
        System.out.println("|         1. 登录               |");
        System.out.println("|         2. 注册               |");
        System.out.println("|         3. 退出               |");
        System.out.println("---------------------------------");
        System.out.print("请输入你的选择：");

        WelcomeController.choose = in.nextLine();

    }
}
