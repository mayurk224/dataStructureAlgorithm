// Given a string, return the character that is most commonly used in the string
// maxChar("abbcccc") === "c"
// maxChar("apple 1111222323344444") === "4"
//logic : need 3 variable one to count max as int, one for max char as string, and last one to store all this count. then need a for loop max count of each as key and value. then in another for loop use that previous for loop key and value and get the exact value

function maxChar(str) {
  let charCount = {};
  for (let i = 0; i < str.length; i++) {
    charCount[str[i]] = charCount[str[i]] ? charCount[str[i]] + 1 : 1;
  }
  let maxChar = "";
  let maxCount = 0;
  for (let key in charCount) {
    if (charCount[key] > maxCount) {
      maxChar = key;
      maxCount = charCount[key];
    }
  }
  return maxChar;
}

console.log(maxChar("abbcccc"));

function maxChar2(str) {
  let max = 0;
  let maxChar = "";
  const charMap = {};

  for (let char of str) {
    if (charMap[char]) {
      charMap[char]++;
    } else {
      charMap[char] = 1;
    }
  }

  // for (const [key, value] of Object.entries(charMap)) {
  //   if (value > max) {
  //     max = value;
  //     maxChar = key;
  //   }
  // }

  for (let key in charMap) {
    if (charMap[key] > max) {
      max = charMap[key];
      maxChar = key;
    }
  }

  return maxChar; // Return both maxChar and its frequency
}

console.log(maxChar2("aabbcccccddddeddssssss"));

function maxChar3(str) {
  let max = 0;
  let maxChar = ''
  let charMap = {}
  for (let char of str){
    charMap[char] = ++charMap[char] || 1
  }
  for (let key in charMap){
    if (charMap[key]>max){
      max = charMap[key]
      maxChar = key
    }
  }
  return maxChar
}
console.log(maxChar3("abbcccdddd"));



// 1. Initialize variables `max` and `maxChar` to keep track of the maximum frequency and the corresponding character.
// 2. Create an empty object `charMap` to store the frequency of each character in the input string.
// 3. Iterate over each character `char` in the input string `str`.
//     - If `charMap[char]` exists, increment its value by 1 (`++charMap[char]`), otherwise, set it to 1 (`|| 1` ensures a default value of 1).
// 4. After populating `charMap`, iterate over each key in `charMap`.
//     - If the frequency of the current character (`charMap[key]`) is greater than the current maximum frequency (`max`), update `max` and `maxChar` accordingly.
// 5. Return the character with the maximum frequency (`maxChar`).


function practice3(str){
  let max = 0
  let maxChar = ''
  let charMap = {};
  for(let char of str){
    charMap[char] = ++charMap[char] || 1 
  }
  for(let key in charMap){
    if(charMap[key]>max){
      max = charMap[key]
      maxChar = key
    }
  }
  return maxChar
}
console.log(practice3("hello"))
