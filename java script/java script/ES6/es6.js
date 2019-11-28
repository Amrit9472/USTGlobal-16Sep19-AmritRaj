 const message= new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name:'gajendra ',

            age:27,
        },
        {name:'gajen',
            
            age:27,

        },
       {name:'gajendra ',
            
       age:27,

       } ,
       {name:'gajendra ',
            
       age:27,

       },
    ])
    }else{
        reject('Failed')
    }
})
console.log(message)
message.then(function(data){
    console.log('Success Message ',data)

}).catch(function(error){
    console.log('Failure Message ',error)

})
// closures
 function outerFunction(counter){
     function innerFunction(){
         let count;
         count = count +10
         return count
     }
     return innerFunction
 }
  let innerFunc = outerFunction(20)
  let counter = innerFunc()
  console.log('Counter Value',counter)