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
        runner = JDBCUtils.getQueryRunner();
    }
    @Override
    public Integer login(String user, String password) throws SQLException {
        Integer result = 0;
        String sql = "select count(*) from userInformation where `user`=? and `password`=?";
        Object[] params = {user, password};
        ScalarHandler<Long> handler = new ScalarHandler<>();
        Long count = runner.query(sql, handler, params);
        Integer state = this.getState(user);
        if (count == 1) {
            result = 1; // 成功
        } else if (state == 0) { //1启用 0禁用
            result = 0; // 账户被禁用
        } else {
            result = -1;// 未找到
        }
        return result;
    }

    @Override
    public void register(UserInformation userInformation) throws SQLException {
        String sql = "insert into userInformation values(?,?,?,?,?)";
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
        return userInformationDao.getMenu(account);
    }

}


