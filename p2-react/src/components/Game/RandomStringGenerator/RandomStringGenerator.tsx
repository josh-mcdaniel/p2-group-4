import React from 'react'



export function shuffle(array: string[]) {
    let currentIndex = array.length,  randomIndex;
  
    // While there remain elements to shuffle.
    while (currentIndex != 0) {
  
      // Pick a remaining element.
      randomIndex = Math.floor(Math.random() * currentIndex);
      currentIndex--;
  
      // And swap it with the current element.
      [array[currentIndex], array[randomIndex]] = [
        array[randomIndex], array[currentIndex]];
    }
  
    return array;
  }



export function stringGenerator () {

    let arrayOfChars = [];
    let x = 0;
    let alphaChars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
    let vowelChars = "A E I O U";
    let alphaCharArray = alphaChars.split(" ");
    let vowelCharArray = vowelChars.split(" ");
    let readyAlphaCharArray = alphaCharArray;
    
    
        let vowelOne = Math.floor(Math.random() * vowelCharArray.length);
        let vowelTwo = Math.floor(Math.random() * vowelCharArray.length);
         // vowels above
        let charThree = Math.floor(Math.random() * readyAlphaCharArray.length);
        let charFour = Math.floor(Math.random() * readyAlphaCharArray.length);
        let charFive = Math.floor(Math.random() * readyAlphaCharArray.length);
        let charSix = Math.floor(Math.random() * readyAlphaCharArray.length);
        let charSeven = Math.floor(Math.random() * readyAlphaCharArray.length);
        let charEight = Math.floor(Math.random() * readyAlphaCharArray.length);
      
        let shuffledArray = [vowelCharArray[vowelOne], vowelCharArray[vowelTwo], readyAlphaCharArray[charThree], 
        readyAlphaCharArray[charFour], readyAlphaCharArray[charFive], readyAlphaCharArray[charSix], 
        readyAlphaCharArray[charSeven], readyAlphaCharArray[charEight]];
        
        shuffle(shuffledArray);
        // we can use shuffledArray as the parameter for a shuffle function 
        // see: console.log(toShuffleArray);
  
        arrayOfChars.push(vowelCharArray[vowelOne], vowelCharArray[vowelTwo], readyAlphaCharArray[charThree],
          readyAlphaCharArray[charFour], readyAlphaCharArray[charFive], readyAlphaCharArray[charSix], 
          readyAlphaCharArray[charSeven], readyAlphaCharArray[charEight]);
        
        console.log(arrayOfChars);
  
  
         return(`
         ${vowelCharArray[vowelOne]}
         ${vowelCharArray[vowelTwo]}
         ${readyAlphaCharArray[charThree]}
         ${readyAlphaCharArray[charFour]}
         ${readyAlphaCharArray[charFive]}
         ${readyAlphaCharArray[charSix]}
         ${readyAlphaCharArray[charSeven]}
         ${readyAlphaCharArray[charEight]}`);
  
  
  
          // after returning the chars, we may want to shuffle them using a shuffle function 
          // If we have time, this function can also be turned into a button for the user when looking through their letter choices
  }