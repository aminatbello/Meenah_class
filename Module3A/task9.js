const myArray =['first element', 'second element', true, 1234, 'third element'];


for(let start = 0; myArray.length>0; start = start+1 ){
    myArray.pop()

}

console.log(myArray)


function calculateAreaOfRectangle (length,width){
    const product = length * width;
    console.log (product)
    
}

calculateAreaOfRectangle (10,2)
