
export interface IUser {
    id:number,
    username:string,
    password:string,
    email:string
    score:number,
    gamesPlayed:number
}

export interface ILeaderboard {
    id:number,
    score:number,
    uId:number
}

export interface IWords {
    id:number,
    word:string,
    mlId:number
}

export interface IMixedLetters {
    id:number,
    mixedLetters:string
}

export interface Iword {

    word: string,
    Notword: string,
    isValid: boolean
 
} 



export type AppState = {
    user:IUser,
    leaderboard:ILeaderboard[],
    words:IWords,
    mixedLetters:IMixedLetters,
    word:Iword

}