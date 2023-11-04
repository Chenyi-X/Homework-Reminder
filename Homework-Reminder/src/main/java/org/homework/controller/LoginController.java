package org.homework.controller;

import org.homework.common.CommonClass;
import org.homework.view.HomeUI;

import java.sql.SQLException;

public class LoginController {

    public static void login(String account, String pwd){
        try {
            Integer loginFlag = CommonClass.service.login(account, pwd);
            switch (loginFlag) {
                case 1:
                    // 登录成功
                    System.out.println("登录成功");
                    HomeUI.show();
                    break;
                case 0:
                    // 登录失败
                    System.out.println("登录失败");
                    break;
                default:
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
