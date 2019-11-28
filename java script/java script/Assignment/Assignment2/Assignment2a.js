// Named function is
function factorial(num)
{
    if(num==0)
    {
        return 1;
    }
        return num*factorial(num-1);
}
console.log('Factorial of a Number is ',factorial(8))


// Function Expression  Function 
var factorial = function(num)
{
    if(num==0)
    {
        return 1;
    }
        return num*factorial(num-1);
    
}
console.log('Factorial is ',factorial(6));


// self Invoked Function
(function(num)
{
    if(num==0)
    {
        return 1;}
        return  console.log('Factorial is ',num*factorial(num-1));
        
})(6)


// Fat fumction 
var fact= (x) => {
    
    if(x==0)
    {
        return 1;}
        return x*factorial(x-1);

}
console.log('Factorial is ',fact(4));
console.log('======================================================================')


//Named function
function fibonacci(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
    

}
fibonacci(7);
console.log('======================================================================')


// Function Expression 
var fibonacci = function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 

}
fibonacci(4);


// Self invoked function
(function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
        
})(6)
console.log('======================================================================')


// Fat function 
var fact= (x) => {
    
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<x;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
}
fact(4)

console.log('============================================================')


// Named Function 
function circum(num)
{
var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(10);


// Function Expression 
var circum = function(num)
{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);

}
circum(10);


//Self Invoked Function
(function(num)
    {
        var pi=3.14;
        console.log('Circumfrence number is ',2*pi*num);
    }
)(5)


// Fat Function 
var circum=(num)=>{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(5);
console.log('===============================================================')


// Named Function 
function arrays()
{
var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
}
arrays();


// Function Expression 
var total=function()
{
    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);

}
total();


// Self Invoked Function
(function(){

    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
})()


// Fat Function
var totalarray=()=>
{
    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
}
totalarray()
console.log('=====================================================================')


//Named function
function prime(num)
{
    var flage=0;
if(num==0&&num==1)
{console.log('Not Prime ');}
for( var i=2;i<num/2;i++)
{
    if(num%i==0)
    {
        flage=1;
        break;
    }
   
}
if(flage==0)
{
    console.log('Prime number is ',num);
}
else
{
    console.log('Not A Prime ',num);
}
}
prime(10);


// Function Expression 
var prime = function(num)
{
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
   

}
 prime(10);


 //Self Function
 (function(num)
 {
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
 })(2)


 //Fat Arrow Function
 var prime = (num)=>
 {
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
 }
 prime(5);

 console.log('=======================================================================')

 console.log("Math Random Function on java scrpit");
 console.log(Math.random()*100 +1);

 console.log('Operation on javascript')
 var d=10;
 var c=5;
 var srt= '10';
 console.log('add=',d+srt);
 console.log('sub=',d-srt);
 console.log('mul=',d*c);
 console.log('mod=',d%c);
 console.log('div=',d/c);
 console.log('add=',d==c);
 console.log('boolean=',d!=c);
 console.log('boolean =',d!==srt);