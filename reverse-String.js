// Given a string, return a new string with the reversed order of characters
// Ex: reverse('Hello') = 'olleH'
//login : split reverse then join

function reverse1(str) {
  let reversed = "";
  for (let i = 0; i < str.length; i++) {
    reversed = str[i] + reversed;
  }
  return reversed;
}
console.log(reverse1("Welcome"));


function reverse2(str) {
  let reversed = "";
  for (let char of str) {
    reversed = char + reversed;
  }
  return reversed;
}
console.log(reverse2("Welcome"));


function reverse3(str) {
  const strtoArray = str.split("");
  strtoArray.reverse();
  return strtoArray.join("");
}
console.log(reverse3("Welcome"));


function reverse4(str) {
  return str.split('').reverse().join('');
}
console.log(reverse4("Welcome"));



function practice3(str){
  const strtoArray = str.split("")
  strtoArray.reverse();
  return strtoArray.join("")
}
console.log(practice3("Hello"))





function practice4(str){
  return str.split('').reverse().join('')
}
console.log(practice4("Mayur"))
