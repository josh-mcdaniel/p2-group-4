import { LOGIN_USER } from "../actions/actionTypes";
import { IUser } from "../store/types";

let initialState:IUser = {
    id:0,
    username:"",
    password:"",
    email:""
}

type Action = {type:string, payload:any};

export const UserReducer = (state:IUser = initialState, action: Action) => {

    switch(action.type) {

        case LOGIN_USER:
            return action.payload

            default:
                return state
    }
}