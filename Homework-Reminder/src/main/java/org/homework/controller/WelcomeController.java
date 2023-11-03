package org.homework.controller;

import org.homework.ui.LoginUI;
import org.homework.ui.RegisterUI;

public class WelcomeController {
    public static String choose;

    public static boolean isContinue(boolean OK) {
        switch (choose) {
            case "1":
                LoginUI.show();
                break;
            case "2":
                RegisterUI.show();
                break;
            case "3":
                return false;
            default:
                System.out.println("输入错误，请重新输入");
                break;
        }
        return OK;
    }
}
