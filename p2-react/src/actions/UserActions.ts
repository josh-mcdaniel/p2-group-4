import axios from "axios";
import { IUser, INewUser } from "../store/types";
import { LOGIN_USER_SUCCESS,LOGIN_USER_FAILURE, REGISTER_USER_SUCCESS, REGISTER_USER_FAILURE } from "./actionTypes";

export interface UserLogin {
    username: string,
    password: string
}

export interface RegisterUser {
    username: string,
    password: string,
    email: string,
    score?: number,
    gamesPlayed?: number
}

export const loginUser = (loginCreds: UserLogin) =>  async (dispatch: any) => {
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
                score: response.data.score
            }

            return dispatch({
                type: LOGIN_USER_SUCCESS,
                payload: loggedInUser
            })
        }
    } catch (error) {
        return dispatch({
            type: LOGIN_USER_FAILURE,
            payload: error
        })
    }

}

export const registerUser = (userCreds: RegisterUser) => async (dispatch:any) => {
    try {
        let newUser: RegisterUser = {} as RegisterUser;
        const response = await axios.post('http://localhost:5000/register', userCreds);
        if (response.status === 201) {
            console.log(response);
            newUser = {
                ...response.data
            }
        }
        return dispatch({
            type: REGISTER_USER_SUCCESS,
            payload: newUser,
        })
    } catch (error) {
        console.log("REGISTER FAILED!")
        return dispatch({
            type: REGISTER_USER_FAILURE,
            payload: error,
        })
    }
}