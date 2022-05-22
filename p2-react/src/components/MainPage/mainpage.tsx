import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"

import "./mainpage.css"

export const MainPage: React.FC<any> = () => {

    useNavigate


    return(
        <div>


            <h1>Codalz</h1>

            <div>
                <button id="start-button" name="start-button">START</button></div>
            <div>
                .

            </div>

            <div>
                <button id="score-button" name="score-button">SEE ALL SCORES</button>
            </div>

            <div>
                .
            </div>

            <div><button id="register-button" name="register" onClick={register}>SIGN UP</button></div>
            <div><button id="logout-button" name="logout" onClick={logout}>LOG OUT</button></div>

        </div>


    )

}