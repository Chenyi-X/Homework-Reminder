package org.homework.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeworkInformation {
    private int hwId;
    private String title;
    private String content;
    private Date ddl;
    private int prId;

    // 省略构造方法、getter和setter方法
}
