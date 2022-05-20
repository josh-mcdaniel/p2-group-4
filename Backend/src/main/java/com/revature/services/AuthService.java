package com.revature.services;

import com.revature.daos.AuthDAO;
import com.revature.daos.UserDAO;
import com.revature.models.LoginDTO;
import com.revature.models.User;

public class AuthService {

    UserDAO uDAO = new UserDAO();

    //transfering user login information
    public User userLogin(LoginDTO ldto) {

        User user = uDAO.userLoginDAO(ldto.getUsername(), ldto.getPassword());

        return user;

    }

    //transferring a new user and inputting into the database
    public void insertUser(User user) {

        uDAO.insertUser(user);

    }

}