// write a function that accept positive no. the function should consol log a pyramid shape with N levels using # character. make sure the pyramid has space on both the left and right hand
// pyramid(3):
//   #
//  ###
// #####

function pyramid(n) {
  const mid = Math.floor((2 * n - 1) / 2);
  for (let row = 0; row < n; row++) {
    let line = "";
    for (let col = 0; col < 2 * n - 1; col++) {
      if (col >= mid - row && col <= mid + row) {
        line += "#";
      } else {
        line += " ";
      }
    }
    console.log(line);
  }
}
pyramid(3);

function practicePyramid(n) {
  const mid = Math.floor((2 * n - 1) / 2);
  for (let row = 0; row < n; row++) {
    let line = "";
    for (let col = 0; col < 2 * n - 1; col++) {
      if (col <= mid + row && col >= mid - row) {
        line += "#";
      } else {
        line += " ";
      }
    }
    console.log(line);
  }
}
practicePyramid(4);
