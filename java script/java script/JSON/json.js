const person = {
             name : 'Amrit',
             age : 23,
             color : 'white',
             address : {
                     city : 'Aurangabad',
                     state : 'bihar',
                     pincode :824101,

             },
             hobbies :['Coding ','Singing','watching Bird']
             }
   console.log('javaScript person object=',person)
   const jsonOject = JSON.stringify(person)
   console.log('JSON person object',jsonOject)
    
   const javaScriptPersonOject =JSON.parse(jsonOject)
   console.log('JavaScript person Objecct After perse',javaScriptPersonOject )
   
   localStorage.setItem('email','billgates@gmail.com')
   const emailID =localStorage.getItem('email')
   console.log('Email ID',emailID)
   localStorage.clear();
   