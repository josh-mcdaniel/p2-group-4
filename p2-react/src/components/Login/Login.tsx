import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import { loginUser } from "../../actions/UserActions"
import { MainPage } from "../MainPage/mainpage"

import "./Login.css"

export const Login: React.FC<any> = () => {

    const appState = useSelector<any, any>((state) => state);

    const dispatch = useDispatch();

    let [username, setUsername] = useState('');
    let [password, setPassword] = useState('');

    const navigate = useNavigate();

    const handleChange = (e:any) => {
        if(e.target.name === "username") {
            setUsername(e.target.value)
            console.log(username)
        } else {
            setPassword(e.target.value)
        }
    }

    const login = async () => {
        await dispatch(
            loginUser({username, password}) as any
        )
        
    }

    useEffect(() => {
        if (appState.user.id > 0) {
            navigate("/home");
        }
    }, [appState.user.id])

    return(
        <div className="login">
            
            <header>
                <h1 className="welcom-top">WELCOME TO CODALZ!</h1>
            </header>
            <div className="text-container">
                <h3 className="sign-in">SIGN IN BELOW TO START DECODING</h3>
                
                <span className="input-container">   
                    <p className="username">USERNAME</p>    
                    <input className="username-form" type="text" name="username"  onChange={handleChange} />
                </span>
                <span className="input-container">
                    <p className="password">PASSWORD</p>
                    <input className="password-form" type="password" name="password" onChange={handleChange} />
                </span>

                <button className="login-button" onClick={login}>LOGIN</button>
            </div>



        </div>
    )
}