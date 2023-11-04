package org.homework.controller;

import org.homework.common.CommonClass;
import org.homework.view.LoginUI;
import org.homework.view.RegisterUI;

public class WelcomeController {

    public static boolean isContinue(boolean OK) {
        switch (CommonClass.choose) {
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
