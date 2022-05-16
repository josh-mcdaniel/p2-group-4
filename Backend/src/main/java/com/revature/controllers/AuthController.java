package com.revature.controllers;

import com.google.gson.Gson;
import com.revature.models.LoginDTO;
import com.revature.services.AuthService;
import io.javalin.http.Handler;

public class AuthController {
    AuthService as = new AuthService();

    public Handler loginHandler = (ctx) -> {
        String body = ctx.body();
        Gson gson = new Gson();
        LoginDTO LDTO = gson.fromJson(body, LoginDTO.class);

        if (as.login(LDTO.getUsername(), LDTO.getPassword()) != null) {
            ctx.req.getSession();
            ctx.status(202);
            String userJSON = gson.toJson((as.login(LDTO.getUsername(), LDTO.getPassword())));

            //send back our user JSON object
            ctx.result(userJSON);

        } else {
            ctx.status(401); //401 stands for "unauthorized"
            System.out.println("login failed");

        }

    };
}
