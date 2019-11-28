console.log('=======Array======')
 
const hobbies =['sleeping','cricket','Eating','Coding','Roming']
console.log(typeof hobbies);

const isArrayorNot=Array.isArray(hobbies)
console.log('Hobbies Array or not',isArrayorNot)

const hasCricket= hobbies.includes('cricket');
console.log('Using includes method',hasCricket)

hobbies.push('Guiter','Volleyball')
console.log('After Push Method',hobbies)

hobbies.pop()
console.log('After Pop method',hobbies)

hobbies.unshift('Numismatics','Singing')
console.log('After Unshift method',hobbies)

hobbies.shift()
console.log('After Shift method ',hobbies)

const hobbies1 = ['Sleeping','Cricket','Eating','Conding','Roaming']

hobbies1.splice(1,2, 'Bird Watching','PUBG')
console.log('After Splice method',hobbies1)

const afterSlice = hobbies1.slice(2,4)
console.log('After Slice method',hobbies1)
console.log('After Slice method',afterSlice)
 
const indexofCoding = hobbies1.indexOf('Coding',1)
console.log('Index of Conding',indexofCoding)
 
const stringHobbies = hobbies1.join('-')
console.log('After join method',stringHobbies)

                 
const numbers =[100,200,300,400]
const nums1 =numbers.map(function(value,index){
    let newValue =value +50
    return newValue
})
console.log('After Map Method',nums1)

const nums2 = numbers.map(value =>value+500)
console.log('After Map arrow Fuction ',nums2)

 const filterNum =
      numbers.filter(function(value,index){
          if(value>200){
              return true
          }else{
              return false
          }
      })

      console.log('After filter method',filterNum)
      const filterNumArrow=
      numbers.filter(value=> value>200)
      console.log('After filter method using arrow',filterNumArrow )












