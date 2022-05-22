import React, { useEffect, useState } from "react"
import { useSelector, useDispatch } from "react-redux"
import { getWord } from "../actions/wordAction"


import { WordDisplay } from "./WordDisplay"






export const Game: React.FC<any> = () => {

    //we need useSelector to access the store
    //we set it so that it can take <any state, and access any store>
    //our state object is set to chanage to whatever (state is in the store)
    const appState =useSelector<any, any>((state) => state)

    //we need useDispatch to dispatch information to our action
    const dispatch = useDispatch()

    let [word, setWord] = useState('')
    let [count, setCount] = useState(0)

    const handleChange = (e:any) => {
        if(e.target.name === "WordSearch"){
            console.log(word)
            console.log(appState)
            setWord(e.target.value)
        }
    }

    const loadWord = async () => {
        await dispatch(
            getWord(word) as any 
        )
    }

    useEffect(()=>{
        if(appState.word.isValid === true){
            setCount(count+1)

        }

    },[appState.word.word])


    return(
        <div className="home-page">
            <h3>Score: {count}</h3>
          
            <WordDisplay word={appState.word}/>
            <div className="home-container">
                <input type="text" name="WordSearch" onChange={handleChange}/>
                <button className="wordButton" onClick={loadWord}>Word Button</button>
            </div>
            <div className="table-div">
            <table>
                <tbody>
                    <tr>
                        <th>Its a word</th>
                    </tr>
                    <tr>
                        <td>
                        {appState.word.word}
                        </td>
                    </tr>
                </tbody>
            </table>
            <table>
                <tbody>
                <tr>
                    <th>Not a word</th>
                </tr>
                <tr>
                    <td>
                        {appState.word.Notword}              
                    </td>
                </tr>
                </tbody>
            </table>
            </div>

        </div>
    );
}