package org.homework.view;

import org.homework.common.CommonClass;
import org.homework.controller.LoginController;
import org.homework.service.impl.UserInformationServiceImpl;
import org.homework.service.infa.UserInformationService;

public class LoginUI {

    public static String account;
    public static String pwd;
    public static void show() {

        System.out.println("请输入账号：");
        account = CommonClass.in.next();

        System.out.println("请输入密码：");
        pwd = CommonClass.in.next();

        LoginController.login(account,pwd);


    }
}
