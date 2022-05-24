import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import axios from 'axios'
import { fetchLeaderboard } from "../../actions/LeaderboardActions"

import "./Leaderboard.css"

export const Leaderboard: React.FC<any> = () => {
    const dispatch = useDispatch();

    const leaderboard = useSelector<any>((state) => state.leaderboard);

    const navigate = useNavigate();

    const handleChange = (e:any) => {
        if (e.target.name === "back-button") {
            navigate("/home")
        }
    }
    useEffect(() => {
        dispatch(fetchLeaderboard() as any)
    }, [])

    // @ts-ignore
    return(
        <div className="leaderboard">
            <h3 className="header">LEADERBOARD</h3>
            <table>
                <thead>
                <tr>
                    <th>USERNAME</th>
                    <th>SCORE</th>
                </tr>
                </thead>
                <tbody className="body">
                {/* @ts-ignore */}
                {leaderboard.map((l: any) => {
                    return  <tr className="row" key={l.user_id}>
                        <td className="data">{l.username}</td>
                        <td className="data">{l.score}</td>

                    </tr>;
                })}
                </tbody>
            </table>
            <button id="back-button" name="back-button" onClick={handleChange}>GO BACK</button>

        </div>
    )

}