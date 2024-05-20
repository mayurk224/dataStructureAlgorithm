// Given an integer, return an integer that is in reverse
// Ex: reverseInt(12) === 21
// logic int to string convert, then split reverse join, then return parseInt with variable * math.sign with int

function reverseInt(n) {
  const reversed = n.toString().split("").reverse().join("");
  
  return parseInt(reversed) * Math.sign(n);
}
console.log(reverseInt(-154));


function practice(n){
  const reverse = n.toString().split('').reverse().join('')
  return parseInt(reverse) * Math.sign(n)
}
console.log(practice(1234))
