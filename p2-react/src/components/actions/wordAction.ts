import axios from "axios"
import { Icount, Iword} from "../store/types"
import { GET_WORD } from "./actionType"



export const getWord =(userWord:string) => async (dispatch:any) => {

   
    let incomingWord: Iword

   
    try{

        const response = await axios.get("https://api.dictionaryapi.dev/api/v2/entries/en/" + userWord)
        console.log(response)

        if(response.status === 404){
            console.log("404 in the action getWord")

        }else{

            incomingWord = {
                word: response.data[0].word,
                Notword: "",
                isValid: true
    
            }

        return dispatch ({
            type: GET_WORD,
            payload: incomingWord
        })

        }



    }catch (e){
        console.log(userWord)
        console.log("get word function failed")
        incomingWord = {
            word: "",
            Notword: userWord,
            isValid: false
        }


        
    return dispatch ({
        type: GET_WORD,
        payload: incomingWord
    })
    }
}