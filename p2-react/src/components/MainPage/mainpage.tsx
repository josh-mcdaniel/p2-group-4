import React, { useEffect, useState } from "react"
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"

import "./mainpage.css"

export const MainPage: React.FC<any> = () => {

    return(
    <div>
           
    
        <h1>Codalz</h1>
        
        <div>
            <button id="start-button" name="start-button">START</button></div>

        
        <div>
            <button id="score-button" name="score-button">SEE ALL SCORES</button>
        </div>
        

        
        <div>
            <button id="logout-button" name="logout">LOG OUT</button> 
        </div>
    
    
    </div>
        

    )

}