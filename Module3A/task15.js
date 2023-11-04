const myBooks = [
    {
        title: 'Javascript for Dummies',
        description : 'This is a javascript book for beginners',
        numberOfPages : 300 ,
        author : 'Aminat Bello',
        reading :false,
    },
    {
        title: 'Javascript for Intermediate',
        description : 'This is a javascript book for proficient users',
        numberOfPages : 400 ,
        author : 'Amina Bell',
        reading :true,
    },
    {
        title: 'Javascript for Experts',
        description : 'This is a javascript book for experts',
        numberOfPages : 500 ,
        author : 'Amin Bel',
        reading :false,
    }

]

for (let check = 0; check <= myBooks.length ; check = check+1){
    if (myBooks[check] && myBooks[check].reading === true) {
        console.log(myBooks[check]);
    }
}