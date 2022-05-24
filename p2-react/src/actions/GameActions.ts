import axios from "axios";
import {IMixedLetters, IUser, Iword, IWords} from "../store/types"
import {ADD_MIXED_LETTERS, GET_MIXED_LETTERS, GET_WORD} from "./actionTypes"

interface newRandomString {
    mixedLetters: string
}





export const addRandomString = (RandomString: newRandomString) => async (dispatch:any) => {

    let RandomStringAdded: IMixedLetters;

    try {

        const response = await axios.post('http://localhost:5000/addML', RandomString)

        if (response.status === 201) {

            console.log(response);

            RandomStringAdded = {
                id: response.data.mixed_letters_id,
                mixedLetters: response.data.jumbled_letters
            }

            return dispatch({
                type: ADD_MIXED_LETTERS,
                payload: RandomStringAdded
            })


        }

    } catch (e) {
        console.log("RANDOM STRING INSERTION FAILED")
    }

}

export const getRandomString = (user:IUser) => async (dispatch:any) => {
    console.log("GET RANDOM STRING")
    let randomString: IMixedLetters
    try {



        const response = await axios.post('http://localhost:5000/getML', user)

        if (response.status === 202) {

            console.log(response)
            console.log("^this is our response")

            randomString = {
                id: response.data.mixed_letters_id,
                mixedLetters: response.data.jumbled_letters
            }
            console.log(randomString)

            return dispatch({
                type: GET_MIXED_LETTERS,
                payload: randomString
            })

        } else {
            console.log(response.status)
        }

        console.log("now we should get a new appState")

    } catch (e) {
        console.log("FAILURE")
    }

}

export const getWord =(userWord:string) => async (dispatch:any) => {


    let incomingWord: Iword

    let url: string = "https://api.dictionaryapi.dev/api/v2/entries/en/"

    let urlComplete = url + userWord;

    console.log(urlComplete)
    try{

        const response = await axios.get(urlComplete)
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