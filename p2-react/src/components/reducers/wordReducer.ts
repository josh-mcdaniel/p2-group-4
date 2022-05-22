import { GET_WORD } from "../actions/actionType"
import { Iword } from "../store/types"


let initialState: Iword = {
    word: "",
    Notword:"",
    isValid: false
  
    
}

type Action = {type: string, payload: any}

//should match file name
export const WordReducer = (state: Iword = initialState, action: Action) => {

    switch(action.type){

        case GET_WORD:
            initialState = action.payload
            return{
                ...initialState
            }
        default:
            return state
    }

}