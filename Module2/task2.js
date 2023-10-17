// program to find the largest among three numbers
const prompt = require ("prompt-sync")({sigint: true})
// take input from the user
const num1 = 3;
const num2 = 5;
const num3 = 1;
let largest;
// check the condition
if(num1 >= num2 && num1 >= num3) {
    largest = num1;
}
else if (num2 >= num1 && num2 >= num3) {
    largest = num2;
}
else {
    largest = num3;
}
// display the result
console.log("The largest number is " + largest);

console.log('hello world');

console.log('A new world');