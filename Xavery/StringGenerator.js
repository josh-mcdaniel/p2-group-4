// let nouns =  "Actor Gold Painting Advertisement Grass Parrot Afternoon Greece Pencil Airport Guitar Piano Ambulance Hair Pillow Animal Hamburger Pizza Answer Helicopter Planet Apple Helmet Plastic Army Holiday Portugal Australia Honey Potato Balloon Horse Queen Banana Hospital Quill Battery House RainBeach Hydrogen Rainbow Beard Ice Raincoat Bed Insect Refrigerator Belgium Insurance Restaurant Boy Iron River Branch Island Rocket Breakfast Jackal RoomBrother Jelly RoseCamera Jewellery Russia Candle Jordan Sandwich Car Juice School Caravan Kangaroo Scooter Carpet King Shampoo Cartoon Kitchen Shoe China Kite Soccer Church Knife Spoon Crayon Lamp Stone Crowd Lawyer Sugar Daughter Leather Sweden Death Library Teacher Denmark Lighter Telephone Diamond Lion Television Dinner Lizard Tent Disease Lock Thailand Doctor London Tomato Dog Lunch Toothbrush Dream Machine Traffic Dress Magazine Train Easter Magician Truck Egg Manchester Uganda Eggplant Market Umbrella Egypt Match Van Elephant Microphone Vase Energy Monkey Vegetable Engine Morning Vulture England Motorcycle Wall Evening Nail Whale Eye Napkin Window Family Needle Wire Finland Nest Xylophone Fish Nigeria Yacht Flag Night YakFlower Notebook  Zebra Football Ocean Zoo Forest Oil Garden Fountain Orange Gas France Oxygen Girl Furniture Oyster Glass Garage Ghost";
// let verbs = "Knew Believed Understand Doubt Think  Suppose Recognize Forget Remember Imagine Mean Agree Disagree Deny Promise Satisfy Realise Appear Astonish Please Impress Surprise Concern Have Own Possess Lack Consist Involve Include Contain Love Like Dislike Hate Adore Prefer Care for Mind Want Need Desire Wish Hope Appreciate Value Cost Measure Weigh Owe Seem Fit Depend Matter";
let alphaChars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
let vowelChars = "A E I O U";


let alphaCharArray = alphaChars.split(" ");
let vowelCharArray = vowelChars.split(" ");

let readyAlphaCharArray = alphaCharArray;

//turn evrything to lowercase at some point

function stringGenerator () {
  let x = 0;

       vowelOne = Math.floor(Math.random() * vowelCharArray.length);
       vowelTwo = Math.floor(Math.random() * vowelCharArray.length);
       // vowels above
       charThree = Math.floor(Math.random() * readyAlphaCharArray.length);
       charFour = Math.floor(Math.random() * readyAlphaCharArray.length);
       charFive = Math.floor(Math.random() * readyAlphaCharArray.length);

    // The team decided to stay with 5 chars instead of 8 but keeping this here for small-scaleability if
    // --> needed in the future.
    //   charSix = Math.floor(Math.random() * readyAlphaCharArray.length);
    //   charSeven = Math.floor(Math.random() * readyAlphaCharArray.length);
    //   charEight = Math.floor(Math.random() * readyAlphaCharArray.length);


            // two needed vowels and the rest can be any of the 25 of the ABC's) below
 return(`
        ${readyAlphaCharArray[vowelOne]}
        ${readyAlphaCharArray[vowelTwo]}
        ${readyAlphaCharArray[charThree]}
        ${readyAlphaCharArray[charFour]}
        ${readyAlphaCharArray[charFive]}`);
};

// shuffle chars button on the interface or shuffle in the background each time?

console.log(stringGenerator());