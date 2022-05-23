import { combineReducers } from "redux";
import { UserReducer } from "./UserReducer";
import { LeaderBoardReducer } from "./LeaderboardReducer";

export default combineReducers({
    user: UserReducer,
    leaderboard: LeaderBoardReducer
})