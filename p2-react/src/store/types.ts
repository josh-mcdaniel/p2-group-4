export interface IUser {
    id:0,
    username:"",
    password:"",
    email:""
    score: 0
}

export interface ILeaderboard {
    id:0,
    score:0,
    uId:0
}

export interface IWords {
    id:0,
    word:"",
    mlId:0
}

export interface IMixedLetters {
    id:0,
    mixedLetters:""
}

export type AppState = {
    user:IUser,
    leaderboard:ILeaderboard[],
    words:IWords,
    mixedLetters:IMixedLetters
}