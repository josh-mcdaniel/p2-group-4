import axios from "axios";
import { FETCH_LEADERBOARD } from "./actionTypes";

export const fetchLeaderboard = () =>  async (dispatch: any) => {
    try {
        const response = await axios.get('http://localhost:5000/leaderboard');
        console.log(response, '<<<<<<')
        if (response.status === 200) {
            return dispatch({
                type: FETCH_LEADERBOARD,
                payload: response.data
            })
        }
    } catch (e) {
        console.log("Fetch FAILED!", e)
    }
}
