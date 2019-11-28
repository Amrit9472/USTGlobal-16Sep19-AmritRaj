// console.log('=======================')
// function first(){
//     setTimeout(function(){
//     console.log('First Function Execution')
// },0)
// }

// function second(){
//     console.log('Second function Executed')
// }

// first()
// second()


// console.log('=======================')
// function first(){
//     setTimeout(function(){
//     console.log('First Function Execution')
// },0)
// console.log('Executed')
// }

// function second(){
//     console.log('Second function Executed')
// }

// first()
// second()

function first(callback){
    setTimeout(function(){
    console.log('First Function Execution')
  callback();
},0)
}

function second(){
    console.log('Second function Executed')
}

first(second)





