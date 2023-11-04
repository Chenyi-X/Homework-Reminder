package org.homework;


import org.homework.controller.WelcomeController;
import org.homework.view.WelcomeUI;

public class Main {
    public static void main(String[] args) {
        /*入口*/
        do {
            WelcomeUI.show();
        } while (WelcomeController.isContinue(true));
    }
}