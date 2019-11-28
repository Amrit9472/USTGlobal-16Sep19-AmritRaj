const Empoloyee = new Promise(function(resolve,reject){
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
Empoloyee.then(function(data){
    console.log('Success Message ',data)

}).catch(function(error){
    console.log('Failure Message ',error)

})