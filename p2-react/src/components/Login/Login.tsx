import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import { loginUser } from "../../actions/UserActions"
import { MainPage } from "../MainPage/mainpage"
import "./Login.css"



export const Login: React.FC<any> = () => {
    return(
        <div className="login">
            
            <header>
                <h1 className="welcom-top">WELCOME TO CODALZ!</h1>
                
                
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
        <div className="loginbutton-padding">
                <button className="login-button" onClick={Login}>LOGIN</button>
                </div>
            </div>



        </div>
    )
}