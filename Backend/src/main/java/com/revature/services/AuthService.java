package com.revature.services;

import com.revature.daos.AuthDAO;
import com.revature.models.User;

public class AuthService {
    AuthDAO aDAO = new AuthDAO();
    public User login(String username, String password) {
        return aDAO.isValidUser(username, password);
}
}