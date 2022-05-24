import React from "react"
import { Iword } from "../../store/types"


export const WordDisplay: React.FC<any> = (w:Iword) => {

    return(
        <td>{w.word}</td>
    )
}

export const WrongWordDisplay: React.FC<any> = (w:Iword) => {

    return(
        <div>
            <td>{w.Notword}</td>
        </div>
    )
}