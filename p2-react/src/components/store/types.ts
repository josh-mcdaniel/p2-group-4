


export interface Iword {
    word: string ;
    Notword: string ;
    isValid: boolean;
 
} 

export interface Icount {
    score: number;
}




export type AppState = {
    word: Iword,
    score: Icount
    
}