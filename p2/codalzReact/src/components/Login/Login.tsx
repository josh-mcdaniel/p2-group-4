import React from 'react';

import "./Login.css"

export const Login: React.FC<any> = () => {

    return(
        <div className="login">

        <div className="text-container">
            <header>
                <h1>Welcome to CODALZ!</h1>
                <h3>Please Sign In Below</h3>
            </header>

            <div className="input-container">
                <input type="text" name="username" className='input-box' placeholder="Username"/>
            </div>
            <div className="input-container">
                <input type="password" name="password" className='input-box' placeholder="Password"/>
            </div>

            <button className="login-button">LOGIN</button>
        </div>
    </div>





    )






}