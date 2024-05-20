// write a function that logs the number from 1 to n. but for multiples of three print 'fizz' instead of the number and for the multiples of five print 'buzz'. for number which are multiples of both three and five print 'fizzbuzz'
// ex: fizzBuzz(5)
//1
//2
//fizz
//4
//5

function fizzBuzz(n) {
  for (let i = 1; i <= n; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      console.log("fizzbuzz");
    } else if (i % 3 === 0) {
      console.log("fizz");
    } else if (i % 5 === 0) {
      console.log("buzz");
    } else {
      console.log(i);
    }
  }
}
fizzBuzz(10);
