//const myFavouriteLanguage = 'Javascript';

// let currentScore = 20;

// currentScore = 30;

// console.log(currentScore);

// console.log(myFavouriteLanguage);

//alert(myFavouriteLanguage);

// const age = 30 ;
// const name = 'Aminat' ;
// const sentence = 'My name is ' +name+'. I am ' +age+ ' years old'

// console.log(sentence)

function converter(naira){
    const dollar = naira / 410;
    return dollar;
}

const dollarValue = converter(820);

console.log (dollarValue);

//slicing an array
const months = ['January', 'Feburary', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']

// console.log (Months.slice(2,3));
// console.log (Months.slice(3,9));
// console.log (Months.slice(1,7));
// console.log(Months.slice(3,8));
// console.log(Months.slice(7,13));
//console.log(Months.slice(7,13));
console.log(months.slice(7));

//console.log (months, months.splice (3,2))

//console.log (months, months.splice(0,3))

console.log (months, months.splice(4,'Add me'))
