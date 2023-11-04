package org.homework.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserInformation {
    private String userId;
    private String password;
    private String userName;
    private int userAge;
    private int roleId;

    // 省略构造方法、getter和setter方法
}
