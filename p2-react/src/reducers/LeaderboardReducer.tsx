import { FETCH_LEADERBOARD } from "../actions/actionTypes";
import { ILeaderboard } from "../store/types";

const initialState:ILeaderboard[] = []

type Action = { type:string, payload:any };

export const LeaderBoardReducer = (state:ILeaderboard[] = initialState, action: Action) => {
    switch(action.type) {
        case FETCH_LEADERBOARD:
            return action.payload
        default:
            return state
    }
}
