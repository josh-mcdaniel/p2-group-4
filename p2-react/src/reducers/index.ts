import { combineReducers } from "redux";
import { GameReducer } from "./GameReducer";
import { UserReducer } from "./UserReducer";

export default combineReducers({
    user:UserReducer,
    ml:GameReducer
})