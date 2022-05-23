import { useState } from 'react';
import { useDispatch, useSelector } from "react-redux"
import {RegisterUser, registerUser } from '../../actions/UserActions';
import './Register.css';
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

            <div className="input-container">
                    <p className='form-animation'>USERNAME</p>
                    <input className='input-form-borders' type="text" name="username" id="username" onChange={handleChange} />
                </div>
            <div className="input-container">
                    <p className='form-animation'>PASSWORD</p>
                    <input className='input-form-borders' type="password" name="password" onChange={handleChange} />
            </div>
            <div className='input-container'>
                <p className='form-animation'>EMAIL</p>
                <input className='input-form-borders' type="email" name="email" onChange={handleChange} />
            </div>
            <div className='sign-up-div'>
            <button className="login-button" onClick={register}>SIGN UP</button>
       </div>
        </div>
        </div>)
}
