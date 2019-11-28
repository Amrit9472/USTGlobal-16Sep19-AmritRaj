const fruits =['Mango','Orange','Coconut','Banana']
console.log(typeof fruits)

//  Array.isArray(obj)
// The isArray() method determines whether an object is an array.
// This function returns true if the object is an array, and false if not.
const isArrayOrNot=Array.isArray(fruits)
console.log('Fruits is or not =',isArrayOrNot)

//string.includes(searchvalue, start)
//The includes() method determines whether a string contains the characters of a specified string.
//This method returns true if the string contains the characters, and false if not.
const hasOrange= fruits.includes('Orange');
console.log('includes method =',hasOrange)

// push()
//The push() method adds new items to the end of an array, and returns the new length.
fruits.push('kiwi','grapes')
console.log('push =',fruits)

//pop()
//The pop() method removes the last element from an array:
fruits.pop()
console.log('After pop of elements =',fruits)

//shift()
//The shift() method removes the first item of an array.
fruits.shift()
console.log('After shif method =',fruits)

//unshift
//The unshift() method adds new items to the beginning of an array, and returns the new length.
//This method changes the length of an array.
fruits.unshift('jackfruits','Guava')
console.log('After unshift =',fruits)

//The splice() method adds/removes items to/from an array, and returns the removed item(s).
//This method changes the original array.
fruits.splice(1,2, 'Orange','Coconut')
console.log('After Splice method',fruits)

//The slice() method returns the selected elements in an array, as a new array object.
//The slice() method selects the elements starting at the given start argument, and ends at, but does not include, the given end argument.
const afterSlice = fruits.slice(2,4)
console.log('After Slice method',fruits)
console.log('After Slice method',afterSlice)

//The indexOf() method returns the position of the first occurrence of a specified value in a string.
//This method returns -1 if the value to search for never occurs.
 
const indexofCoding = fruits.indexOf('Orange',1)
console.log('Index of Conding',indexofCoding)


const stringFurits = fruits.join('-')
console.log('After join method',stringFurits)

console.log('=======Array======')
 
const Mobile =['Apples','Vivo','Oppo','Sumsung','jio']
console.log(typeof MObile);

console.log('=======Array======')

const isArrayorNot=Array.isArray(Mobile)
console.log('Mobile Array or not',isArrayorNot)
 
console.log('=======Array======')

const hasOnePluse= Mobile.includes('onePluse');
console.log('Using includes method',hasOnePluse)

console.log('=======Array======')

Mobile.push('Micromax','Karbon')
console.log('After Push Method',Mobile)

console.log('=======Array======')

Mobile.pop()
console.log('After Pop method',Mobile)

console.log('=======Array======')

Mobile.unshift('Blackberry','Mi')
console.log('After Unshift method',Mobile)

console.log('=======Array======')

Mobile.shift()
console.log('After Shift method ',Mobile)

console.log('=======Array======')


Mobile.splice(1,2, 'Apples','Vivo')
console.log('After Splice method',Mobile)

console.log('=======Array======')

const afterSlice2 = fruits.slice(2,4)
console.log('After Slice method',afterSlice2)
console.log('After Slice method',afterSlice2)

console.log('=======Array======')

 
const indexofSumsung = Mobile.indexOf('Sumsung',1)
console.log('Index of Conding',indexofSumsung)

console.log('=======Array======')

const stringMobile = Mobile.join('-')
console.log('After join method',stringMobile)


console.log('=======Array2======')
 
const Books =['Hindi','Math','Science','Gk','sst']
console.log(typeof Books);

console.log('=======Array2======')

const isArrayorNot2=Array.isArray(Books)
console.log('Mobile Array or not',isArrayorNot2)
 
console.log('=======Array2======')

const hasGame= Books.includes('Game');
console.log('Using includes method',hasGame)


console.log('=======Array2======')

Books.push('Color','Cursive')
console.log('After Push Method',Books)

console.log('=======Array2======')

Books.pop()
console.log('After Pop method',Books)

console.log('=======Array2======')

Books.unshift('Garammer','Biology')
console.log('After Unshift method',Books)

console.log('=======Array2======')

Books.shift()
console.log('After Shift method ',Books)

console.log('=======Array2======')


Books.splice(1,2, 'Hindi','Math')
console.log('After Splice method',Mobile)

console.log('=======Array2======')

const afterSlice3 = Books.slice(2,4)
console.log('After Slice method',afterSlice3)
console.log('After Slice method',afterSlice3)

console.log('=======Array2======')

 
const indexOfHindi = Mobile.indexOf('Hindi',1)
console.log('Index of Conding',indexOfHindi)

console.log('=======Array2======')

const stringBooks = Books.join('-')
console.log('After join method',stringBooks)



console.log('=======Array3======')
 
const City =['Chennai','bangaloru','Delhi','Lakhnow','gaya']
console.log(typeof City);

console.log('=======Array3======')

const cityIsArrayOrNot=Array.isArray(City)
console.log('City Array or not',cityIsArrayOrNot)
 
console.log('=======Array3======')

const hasCity= City.includes('gaya');
console.log('Using includes method',hasCity)

console.log('=======Array3======')

City.push('Varanashi','Aurangabad')
console.log('After Push Method',City)

console.log('=======Array3======')
 
City.pop()
console.log('After Pop method',City)

console.log('=======Array3======')

City.unshift('Vishakhapatnam','Madurai')
console.log('After Unshift method',City)

console.log('=======Array3======')

City.shift()
console.log('After Shift method ',City)

console.log('=======Array3======')


City.splice(2,0, 'Pune','Patna')
console.log('After Splice method',City)

console.log('=======Array3======')

const afterSliceCity = City.slice(2,4)
console.log('After Slice method',afterSliceCity)
console.log('After Slice method',afterSliceCity)

console.log('=======Array3======')

 
const indexofDelhi= City.indexOf('Delhi',1)
console.log('Index of Conding',indexofDelhi)

console.log('=======Array3======')

const stringCity = City.join('00')
console.log('After join method',stringCity)

console.log('=======Array4======')
 
const Color =['Greem','Red','Black','Blue','white']
console.log(typeof Color);

console.log('=======Array4======')

const colorisArrayorNot=Array.isArray(Color)
console.log('Color Array or not',colorisArrayorNot)
 
console.log('=======Array4======')

const hascolor= Color.includes('Black');
console.log('Using includes method',hascolor)

console.log('=======Array4======')

Color.push('Pink','yellow')
console.log('After Push Method',Color)

console.log('=======Array4======')

Color.pop()
console.log('After Pop method',Color)

console.log('=======Array4======')

Color.unshift('Brown','Perpul')
console.log('After Unshift method',Color)

console.log('=======Array4======')

Color.shift()
console.log('Color After Shift method ',Color)

console.log('=======Array4======')


Color.splice(1,2, 'Black','white')
console.log('Color After Splice method',Color)

console.log('=======Array4======')

const colorAfterSlice = Color.slice(2,4)
console.log('After Slice method',colorAfterSlice)
console.log('After Slice method',colorAfterSlice)

console.log('=======Array4======')

 
const indexofWhite = Color.indexOf('White',1)
console.log('Index of Conding',indexofWhite)

console.log('=======Array4======')

const stringColor = Color.join('$')
console.log('After join method',stringColor)








