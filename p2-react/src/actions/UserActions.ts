import axios from "axios";
import { IUser } from "../store/types";
import { LOGIN_USER } from "./actionTypes";

interface UserLogin {
    username: string,
    password: string
}

/*interface NewUser {
    username: string,
    password: string,
    email: string
}*/


export const loginUser = (loginCreds:UserLogin) =>  async (dispatch: any) => {
    let loggedInUser: IUser;
    try {

        const response = await axios.post('http://localhost:5000/login', loginCreds);

        if (response.status === 202) {

            console.log(response);

            loggedInUser = {
                id: response.data.user_id,
                username: response.data.username,
                password: response.data.password,
                email: response.data.email
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