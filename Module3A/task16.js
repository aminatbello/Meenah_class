//1. Calculate the sum of numbers within an array.
const sumOfNumbers = [3,4,5,6,7,8];
let sum = 0;
for (let i = 0; i < sumOfNumbers.length; i= i+1){
    let getNumber = sumOfNumbers[i]
    //console.log (getNumber)
    sum = sum + getNumber
}

console.log (sum)

//2. Create a length converter function.
//function to convert centimeter value to meters
function lengthConverter (cmValue){
    if (typeof(cmValue) === 'number'){
        const convertToMeters = cmValue/100
        console.log(cmValue + "cm equals " + convertToMeters + "meters") 
    }
    else{
        console.log ("This is not a number, please input a number")
    }
}

lengthConverter (2000)


//3. Print all even numbers from 0 – 100.

for (let i = 0; i <= 100; i++){
    if(i % 2 == 0){
        console.log (i);
    }
}

//4. Print a table containing multiplication tables.

for(i =0; i<=12; i=i+1){
    const twotimesTable = i * 2;
    console.log ("2 x " + i +" = " + twotimesTable)
}

//5. Create a function that reverses an array.
const nameArray = [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
function reverseArray (){
    const reverseArray = nameArray.reverse()
    console.log (reverseArray)

}

reverseArray()

//6. Sort an array of strings in alphabetical order.
const string = ['ade','shade', 'goke', 'tinu','bisi', 'ola', 'bola']
sortedList = string.sort()
console.log (sortedList)

//7. Sort an array of numbers in descending order.

const age = [31, 24, 75, 36, 7, 18];
age.sort((a, b) => a - b);
age.reverse()
console.log(age)


//8. Return a Boolean if a number is divisible by 10.
function divisibleByTen (number){
    if (number % 10 == 0){
        return true
    }else{
        return false
    }
}

console.log (divisibleByTen(123));
console.log (divisibleByTen(1000));


//9. Return the number of vowels in a string

function getVowelsCount(word){
    const vowels = ['a','e','i','o','u'];
    let getCount = 0;
    for(let eachletter of word ){
        if (vowels.includes(eachletter)){
            getCount ++
        }
    }
    return (getCount)

}
getVowelsCount("nollywood movies")

//10. Create a function that filters out negative numbers.

function removeNegativeNumbers(numbers){
    for(let n = 0; n < numbers.length ; n=n+1){
        if (numbers[n] < 0){
            numbers.splice(n, 1);
        } 
    }
    console.log (numbers)
}
const numbers = [45, 23, 12, -4, 76, 56, 43, -9]
removeNegativeNumbers(numbers)

//const vowels = ['a','e','i','o','u'];
