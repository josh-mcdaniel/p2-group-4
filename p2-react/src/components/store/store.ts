import { configureStore } from "@reduxjs/toolkit";
import { AppState } from "./types";
import reducer from "../reducers";



const initialState: AppState = {

    word: {
        word: "",
        Notword:"",
        isValid: false
        
    },

    score: {
        score: 0
  
      }
}

export const store = configureStore({
    reducer
})