import { combineReducers } from "redux";
import { GameReducer } from "./GameReducer";
import { LeaderBoardReducer } from "./LeaderboardReducer";

import { UserReducer } from "./UserReducer";
import { WordReducer } from "./wordReducer";


export default combineReducers({
    user:UserReducer,
    ml:GameReducer,
    word: WordReducer,
    leaderboard: LeaderBoardReducer

})