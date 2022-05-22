import React from "react"

export const CountDisplay: React.FC<any> = (props) =>{

    return(
        <div>
            <h3>{props.score.score}</h3>
        </div>
    )
}