import React from "react"


export const WordDisplay: React.FC<any> = (props) => {

    return(
        <div>
            <h3>{props.word.word}</h3>
          
        </div>
    )
}