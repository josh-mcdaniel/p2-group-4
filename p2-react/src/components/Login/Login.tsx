import React from "react"
import "./Login.css"

export const Login: React.FC<any> = () => {
    return(
        <div className="login">
            <header>
                <h1>WELCOME TO CODALZ!</h1>
            </header>
            <div className="text-container">
                <h3>SIGN IN BELOW TO START DECODING</h3>
                
                <span className="input-container">   
                    <p>USERNAME</p>    
                    <input type="text" name="username" id="username" />
                </span>
                <span className="input-container">
                    <p>PASSWORD</p>
                    <input type="password" name="password"  />
                </span>

                <button className="login-button" >LOGIN</button>
            </div>



        </div>
    )
}