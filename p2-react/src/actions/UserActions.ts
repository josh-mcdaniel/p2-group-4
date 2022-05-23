import axios from "axios";

import { IUser } from "../store/types"
import { LOGIN_USER, UPDATE_USER } from "./actionTypes";



interface UserLogin {
    username: string,
    password: string
}

interface NewUser {
    username: string,
    password: string,
    email: string
}

export const loginUser = (loginCreds:UserLogin) => async (dispatch:any) => {

    let loggedInUser: IUser;

    try {

        const response = await axios.post('http://localhost:5000/login', loginCreds);

        if (response.status === 202) {

            console.log(response);

            loggedInUser = {
                id: response.data.user_id,
                username: response.data.username,
                password: response.data.password,
                email: response.data.email,
                score: response.data.score,
                gamesPlayed: response.data.games_played
            }

            return dispatch({
                type: LOGIN_USER,
                payload: loggedInUser
            })
        }
    } catch (e) {
        console.log("LOGIN FAILED!")
    }
}

/*export const registerUser = (UserCreds:NewUser) => async (dispatch:any) => {

    try {
        
        const response = await axios.post('projdb.cbwacvu5rhbu.us-east-1.rds.amazonaws.com:5432/register', UserCreds);

        if (response.status === 201) {

            console.log(response);

            UserCreds = {
                
            }
        }
        
    }
}*/
interface score {
    score: number
}
export const updateUser = (user:IUser, score:number) => async (dispatch:any) => {

    let newUser: IUser = {
        id: user.id,
        username: user.username,
        password: user.password,
        email: user.email,
        score: score,
        gamesPlayed: user.gamesPlayed

    }
    try {

        const response = await axios.put('http://localhost:5000/updateScore', newUser)

        if (response.status === 200) {
            console.log(response);


            return dispatch({
                type: UPDATE_USER,
                payload: newUser
            })

        }
    } catch (e) {
        console.log("SCORE UPDATE FAILED")
    }
}