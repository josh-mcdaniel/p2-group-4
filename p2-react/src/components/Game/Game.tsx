import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"

import CountDownTimer, {ICountdown} from "./CountDownTimer/CountDownTimer"
import { getRandomString } from "../../actions/GameActions"

export const Game: React.FC<any> = (props) => {

    const appState = useSelector<any, any>((state) => state);
    
    
    const dispatch = useDispatch();


    
    const getRS = async () => {

        await dispatch(
            getRandomString(appState.user) as any
        )

        }

    

    useEffect(() => {


    }, [appState] )

   let string: string = appState.ml.mixedLetters 
   console.log(appState.ml)
   console.log("This is our current appstate ^")



    return(
        <div >
            <div className="container">
                <h3>TIME REMAINING</h3>
                <CountDownTimer minutes={1} seconds={60}  />
            </div>
            <div className="container">
                <h3 onClick={getRS}>YOUR RANDOM STRING</h3>
                <div>{string}</div>
                
                
            </div>
            <div className="container">
                <h3>GUESS HERE!</h3>
                <input type="text"  />
            </div>
            <div>
                <div>
                    <h3>YOUR CORRECT GUESSES</h3>
                </div>
                <div>
                    <h3>YOUR LAST GUESS</h3>
                </div>
            </div>
        </div>


    );

}
