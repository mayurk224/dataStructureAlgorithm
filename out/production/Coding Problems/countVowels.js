// write a function that returns the count of vowels present inside the string. Vowels are the characters 'a','e','i','o','u'
//Ex: vowels('how are you') -> 3

function vowels(str) {
  const matches = str.match(/[aeiou]/gi);
  return matches ? matches.length : 0;
}
console.log(vowels("how are you"));

function vowels2(str) {
  const vowelCheck = ["a", "e", "i", "o", "u"];
  let count = 0;
  for (let char of str.toLowerCase()) {
    if (vowelCheck.includes(char)) {
      count++;
    }
  }
  return count;
}
console.log(vowels2("how are you"));

function practice2(str) {
  const vowelCheck = ["a", "e", "i", "o", "u"];
  let count = 0;
  for (let char of str.toLowerCase()) {
    if (vowelCheck.includes(char)) count++;
  }
  return count;
}
console.log(practice2("hello there"));
