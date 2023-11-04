const books = {
    title: 'Javascript for Dummies',
    description : 'This is a javascript book for beginners',
    numberOfPages : 300 ,
    author : 'Aminat Bello',
    reading :true,

    toggleReadingStatus: function(){
      if (books.reading === true) {
        books.reading = false
      }else{
        books.reading = true
      }

    }
}

books.toggleReadingStatus();

console.log (books.reading)

console.log (books)