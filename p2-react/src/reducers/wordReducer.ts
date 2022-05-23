import { GET_WORD} from "../actions/actionTypes"
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
            return action.payload

        default:
            return state
    }

}