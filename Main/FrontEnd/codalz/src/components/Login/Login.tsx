import React from 'react';

import "./Login.css"

export const Login: React.FC<any> = () => {

    return(
        <div className="login">

        <div className="text-container">
            <h1>Welcome to CODALZ!</h1>
            <h3>Please Sign In Below</h3>

            <div className="input-container">
                <input type="text" name="username" placeholder="Username"/>
            </div>
            <div className="input-container">
                <input type="password" name="password" placeholder="Password"/>
            </div>

            <button className="login-button">LOGIN</button>
        </div>
    </div>





    )






}