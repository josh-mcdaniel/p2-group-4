import { useState } from 'react';
import { useDispatch, useSelector } from "react-redux"
import {RegisterUser, registerUser } from '../../actions/UserActions';
export const Register: React.FC<any> = () => {

    const [user, setUser] = useState({});
    const dispatch = useDispatch();

    const handleChange = (e: any) => {
        const updatedUser = {
            ...user,
            [e.target.name]: e.target.value
        };
        setUser(updatedUser);
    }

    const register = async () => {
        console.log('User ', user);
        const response = await dispatch(
            registerUser(user as RegisterUser) as any
        )
        console.log('Response: ', response);
    }

    return (
        <div className="login">
        <header>
            <h1>WELCOME TO CODALZ!</h1>
        </header>
        <div className="text-container">
            <h3>FILL OUT THE FIELDS BELOW TO REGISTER</h3>

            <span className="input-container">
                    <p>USERNAME</p>
                    <input type="text" name="username" id="username" onChange={handleChange} />
                </span>
            <span className="input-container">
                    <p>PASSWORD</p>
                    <input type="password" name="password" onChange={handleChange} />
                </span>
            <span className="input-container">
                <p>EMAIL</p>
                <input type="email" name="email" onChange={handleChange} />
            </span>
            <button className="login-button" onClick={register}>SIGN UP</button>
        </div>
        </div>)
}