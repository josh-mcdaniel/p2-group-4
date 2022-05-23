import {configureStore} from "@reduxjs/toolkit";
import reducer from "../reducers/index";

import { AppState } from "./types";

const initialState:AppState = {
    user: {
        id:0,
        username:"",
        password:"",
        email:"",
        score:0,
        gamesPlayed:0

    },
    leaderboard: [],
    words: {
        id:0,
        word:"",
        mlId:0
    },
    mixedLetters: {
        id:0,
        mixedLetters:""

    },
    word: {

        word: "",
        Notword:"",
        isValid: false
        
    }
}

export const store = configureStore({
    reducer
})