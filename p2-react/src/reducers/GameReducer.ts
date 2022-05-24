import { GET_MIXED_LETTERS } from "../actions/actionTypes";
import { IMixedLetters } from "../store/types";

let initialState: IMixedLetters = {
    id: 0,
    mixedLetters:""
}

type Action = {type:string, payload:any};

export const GameReducer = (state:IMixedLetters = initialState, action: Action) => {

    switch (action.type) {

        case GET_MIXED_LETTERS:
            return action.payload

        default:
            return state
    }
}