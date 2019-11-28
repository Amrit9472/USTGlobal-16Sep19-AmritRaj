var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('For of loop')
for(var element of brands){
    console.log('Brand=',element);
}
console.log('====================')
console.log('For in loop')
for(var index in brands){
    console.log('Bands =',brands[index])
}
console.log('=====================')
console.log('For in loop')
var person ={
    name : 'Sundari',
    age : 33,
    color: 'white'
}
for(var key in person){
    console.log('value =',person[key])
}
console.log('=======================');
console.log('for Each Method of Array')
var movies =['sholey','mayabazar','jurassic','Titanic']
movies.forEach(function(value,index){
    console.log('Movie =',value)
})

console.log('For Each for items')
var items =[{
            item :'bangale',
            id : 1,
            price :100

            },
            {
             item :'eyeliner',
             id : 2,
             price :200,

            },
            {
            item :'shoes',
            id : 3,
            price :1200

            },
            {
            item :'watch',
            id : 4,
              price :1000

}]
items.forEach(function(item,index){
    console.log('item =',item);
    console.log('index of items =',index );
})
console.lo