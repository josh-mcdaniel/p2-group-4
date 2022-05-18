
//the casing doesn't matter in this instance as it will be uniformed later. will replace this with more details if need be.

function stringGenerator () {

  let arrayOfChars = [];
  let x = 0;
  let alphaChars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
  let vowelChars = "A E I O U";
  let alphaCharArray = alphaChars.split(" ");
  let vowelCharArray = vowelChars.split(" ");
  let readyAlphaCharArray = alphaCharArray;
  
  
       vowelOne = Math.floor(Math.random() * vowelCharArray.length);
       vowelTwo = Math.floor(Math.random() * vowelCharArray.length);
       // vowels above
       charThree = Math.floor(Math.random() * readyAlphaCharArray.length);
       charFour = Math.floor(Math.random() * readyAlphaCharArray.length);
       charFive = Math.floor(Math.random() * readyAlphaCharArray.length);
       charSix = Math.floor(Math.random() * readyAlphaCharArray.length);
       charSeven = Math.floor(Math.random() * readyAlphaCharArray.length);
       charEight = Math.floor(Math.random() * readyAlphaCharArray.length);
    
      // shuffledArray = shuffle(shuffledArray);
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
};

console.log(stringGenerator());

// console.log(shuffledArray);
