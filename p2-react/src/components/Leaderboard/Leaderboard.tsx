import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import axios from 'axios'
import { fetchLeaderboard } from "../../actions/LeaderboardActions"

export const Leaderboard: React.FC<any> = () => {
    const dispatch = useDispatch();

    const leaderboard = useSelector<any>((state) => state.leaderboard);

    useEffect(() => {
        dispatch(fetchLeaderboard() as any)
    }, [])

    // @ts-ignore
    return(
        <div>
            <h3>LEADERBOARD</h3>
            <table>
                <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>SCORE</th>
                </tr>
                </thead>
                <tbody>
                    {/* @ts-ignore */}
                    {leaderboard.map((l: any) => {
                        return  <div key={l.user_id}>
                                <div>{l.score}</div>
                                <div>{l.username}</div>
                            </div>;
                    })}
                </tbody>
            </table>

        </div>
    )

}