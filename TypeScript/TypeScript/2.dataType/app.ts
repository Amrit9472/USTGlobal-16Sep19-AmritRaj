let myName : string ="Amrit Raj Singh";

console.log(myName , typeof myName)

let age : number;
 
console.log(age , typeof age);

let mobileNumber = 9302972832;

console.log(mobileNumber ,typeof mobileNumber);

let address;
 
address = " ram raj"

address = 67889;

console.log(address , typeof address)

let calAge = function() : void{
    console.log("age is 26")
    
}
calAge();
  

class Person{
    constructor(public name : string, public age : number){


    }
}
 let person1 = new Person("Amrit",24)
 console.log(person1);

class student extends Person{

    constructor(name : string , age : number , public rollNo : number){
        super(name , age)

    }

} 

 let student1 = new student("Prem ", 34 ,123)
console.log(student1)



