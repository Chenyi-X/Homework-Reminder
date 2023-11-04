package org.homework.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {
    private int roleId;
    private String roleName;
    private String menuList;

    // 省略构造方法、getter和setter方法
}
