package org.homework.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Priority {
    private int prId;
    private String priorityName;

    // 省略构造方法、getter和setter方法
}
