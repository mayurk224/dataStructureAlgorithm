//Given an array and chunk size, divide the array into many subarray where each subarray is of length size
// ex: chunk([1,2,3,4,5],2) ---> [[1,2],[3,4],[5]]
// ex: chunk([1,2,3,4],2) ---> [[1,2],[3,4]]

function chunk(array, size) {
  let result = [];
  let index = 0;
  while (index < array.length) {
    result.push(array.slice(index, index + size));
    index += size;
  }
  return result;
}
console.log(chunk([1, 2, 3, 4, 5], 3));

function chunk2(array, size) {
  let result = [];
  let index = 0;
  while (index < array.length) {
    result.push(array.slice(index, index + size));
    index += size;
  }
  return result;
}
console.log(chunk2([1, 2, 3, 4, 5], 4));

function chunk3(array, size) {
  let result = [];
  for (let i = 0; i < array.length; i += size) {
    result.push(array.slice(i, i + size));
  }
  return result;
}
console.log(chunk3([1, 2, 3, 4, 5, 6], 2));

function practice3(array, size) {
  let result = [];
  for (let i = 0; i < array.length; i += size) {
    result.push(array.slice(i, i + size));
  }
  return result;
}
console.log(practice3([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], 3));
