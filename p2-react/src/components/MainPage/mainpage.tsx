import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import { getRandomString } from "../../actions/GameActions"

import "./mainpage.css"

export const MainPage: React.FC<any> = () => {

    const appState = useSelector<any, any>((state) => state);

    const dispatch = useDispatch();

    const navigate = useNavigate();



    console.log(appState.user);
    const handleChange = (e:any) => {
        if (e.target.name === "start-button") {
           
            navigate("/game")
        } else if (e.target.name === "score-button") {
            navigate("/myScores")
        } else if (e.target.name === "leaderboard") {
            navigate("/leaderboard")
        } else {
            navigate("/")
        }
    }
    return(
    <div className="black-buttons">
           
    
        <h1>Codalz</h1>
        
        <div>
            <button id="start-button" name="start-button" onClick={handleChange}>START</button></div>

        
        <div>
            <button id="score-button" name="score-button" onClick={handleChange}>SEE YOUR SCORES</button>
        </div>
        
        <div>
            <button id="leaderboard" name="leaderboard" onClick={handleChange}>SEE LEADERBOARD</button>
        </div>

        
        <div>
            <button id="logout-button" name="logout" onClick={handleChange}>LOG OUT</button> 
        </div>
    
    
    </div>
        

    )

}