import { combineReducers } from "redux"
import { WordReducer } from "./wordReducer";




export default combineReducers({
    word: WordReducer

})