package org.homework.service.impl;

import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.homework.common.entity.UserInformation;
import org.homework.service.infa.UserInformationService;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.homework.common.utils.DButils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import java.sql.SQLException;

public class UserInformationServiceImpl implements UserInformationService {
    private QueryRunner runner;

    public UserInformationServiceImpl() {
        runner = DButils.getQueryRunner();
    }
    @Override
    public Integer login(String user, String password) throws SQLException {
        Integer result = 0;
        String sql = "select count(*) from user_information where `user_name`=? and `password`=?";
        Object[] params = {user, password};
        ScalarHandler<Long> handler = new ScalarHandler<>();
        Long count = runner.query(sql, handler, params);
        if (count == 1) {
            result = 1; // 成功
        } else {
            result = 0;// 未找到
        }
        return result;
    }

    @Override
    public void register(UserInformation userInformation) throws SQLException {
        String sql = "insert into user_information values(?,?,?,?,?)";
        Object[] params = {
                userInformation.getUserId(),
                userInformation.getPassword(),
                userInformation.getUserName(),
                userInformation.getUserAge(),
                userInformation.getRoleId(),
        };
        runner.update(sql, params);
    }

    @Override
    public String[] getMenu(String account) throws SQLException {
        String sql = "select `menu_list` from user_role where `role_id` = (select `role_id` from user_information where `user_name`=?)";
        Object[] params = {account};
        ScalarHandler<String> handler = new ScalarHandler();
        String query = runner.query(sql, handler, params);
        return query.split("\\|");
    }

}


