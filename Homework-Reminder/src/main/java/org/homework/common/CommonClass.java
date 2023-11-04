package org.homework.common;

//import org.homework.service.impl.UserInformationServiceImpl;
import org.homework.service.impl.UserInformationServiceImpl;
import org.homework.service.infa.UserInformationService;

import java.util.Scanner;

public class CommonClass {
    public static String choose = new String();
    public static Scanner in = new Scanner(System.in);

    public static UserInformationService service = new UserInformationServiceImpl();
}
