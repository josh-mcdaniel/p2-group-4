



//turn evrything to lowercase at some point

function stringGenerator () {
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
       
       // charArray = [vowelOne, vowelTwo, charThree, charFour, charFive, charSix, charSeven, charEight];

            // two needed vowels and the rest can be any of the 25 of the ABC's below
 return(`
        ${vowelCharArray[vowelOne]}
        ${vowelCharArray[vowelTwo]}
        ${readyAlphaCharArray[charThree]}
        ${readyAlphaCharArray[charFour]}
        ${readyAlphaCharArray[charFive]}
        ${readyAlphaCharArray[charSix]}
        ${readyAlphaCharArray[charSeven]}
        ${readyAlphaCharArray[charEight]}`);
};

// shuffle chars button on the interface or shuffle in the background each time?

console.log(stringGenerator());
