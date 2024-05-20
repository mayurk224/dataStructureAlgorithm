//write a function that accepts a string. the function should capitalize the first letter of each words in the string then return the capitalize string
// Ex: capitalize('this is mayur kamble learning javascript questions') -> 'This Is Mayur Kamble Learning Javascript Questions'

function capitalize(str) {
  let words = str.split(" ");
  let result = [];
  for (let word of words) {
    result.push(word[0].toUpperCase() + word.slice(1));
  }
  return result.join(" ");
}
console.log(capitalize("this is mayur kamble learing javascript questions"));

function practice(str) {
  let words = str.split(" ");
  let result = [];
  for (let word of words) {
    result.push(word[0].toUpperCase() + word.slice(1));
  }
  return result.join(" ");
}
console.log(practice("hello mayur how are you ?"));

function capitalize2(str) {
  let words = str.split(" ");
  return words.map((word) => word[0].toUpperCase() + word.slice(1)).join(" ");
}
console.log(capitalize2("happy birthday shruti"));

function practice2(str) {
  let words = str.split(" ");
  return words.map((word) => word[0].toUpperCase() + word.slice(1)).join(" ");
}
console.log(practice2("im hungry very much"));
