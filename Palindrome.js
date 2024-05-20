// Check the given string is palindrome or not
// Ex: nayan === nayan
//logic : split reverse join then match the original input with the new one if its true then its palindrome

//two pointer technic

function isPalindrome(str) {
  const reversed = str.split("").reverse().join("");
  if (str === reversed) {
    return true;
  }
  return false;
}

console.log(isPalindrome("mayur"));


function isPalindrome2(str){
    const reversed = str.split("").reverse().join("");
    return str === reversed;
}
console.log(isPalindrome2("nayan"));

function practice(str){
  const reverse = str.split('').reverse().join('')
  if(reverse === str){
    return true
  }
  return false
}
console.log(practice("Nayan"))
