import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"

import CountDownTimer, {ICountdown} from "../CountDownTimer/CountDownTimer"

export const Game: React.FC<any> = (props) => {

    const appState = useSelector<any, any>((state) => state);

    const dispatch = useDispatch();








    return(
        <div>
            <div className="container">
                <h3>TIME REMAINING</h3>
                <CountDownTimer minutes={1} seconds={60} />
            </div>
            <div className="container">
                <input type="text" aria-label="GUESS HERE!"/>
            </div>
            <div className="container">

            </div>
        </div>


    );

}