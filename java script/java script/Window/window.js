console.log('Window object',window);
console.log('This Keyword ',this)
console.log(this === window)

// window.alert("Welcome to javaScript class")
// alert("Welcome to shajanpur")

// let confirmDelete=confirm("Are you sure you want to delete")
// console.log('confirm Delete',confirmDelete)

let userName = prompt('What is your name','Amrit')
console.log('User Name',userName)

const person={
    firstName : 'Alia',
    age :24,
    lastName : 'Kapoor',
    getName : function(){
        console.log('This keyword',this)
        return this.firstName +' '+this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName)