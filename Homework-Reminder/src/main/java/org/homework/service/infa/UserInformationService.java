package org.homework.service.infa;

import org.homework.common.entity.UserInformation;

import java.sql.SQLException;

public interface UserInformationService {
    public void register(UserInformation userInformation) throws SQLException;

    public Integer login(String user, String password) throws SQLException;

    public String[] getMenu(String account) throws SQLException;
}
