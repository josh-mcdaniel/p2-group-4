import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"





export const UserScore: React.FC<any> = () => {


    const appState = useSelector<any, any>((state) => state);

    const navigate = useNavigate();

    const handleChange = (e:any) => {
        if (e.target.name === "back-button") {
            navigate("/home")
        }
    }



    return(
        <div>
            <h3>YOUR SCORE!</h3>
            <h3>{appState.user.score}</h3>
            <button id="back-button" name="back-button" onClick={handleChange}>GO BACK</button>
            
        </div>
    )

}