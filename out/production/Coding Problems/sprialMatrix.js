// write a function that acceps an integer n and return a NxN spiral matrix
// ex: matrix(2)
// [[1,2],
//  [4,3]]

function matrix(n) {
  let result = [];
  let counter = 1,
    startRow = 0,
    startCol = 0,
    endRow = n - 1,
    endCol = n - 1;
  for (let i = 0; i < n; i++) {
    result.push([]);
  }
  while (startRow <= endRow && startCol <= endCol) {
    //top
    for (let i = startCol; i <= endCol; i++) {
      result[startRow][i] = counter;
      counter++;
    }
    startRow++;
    //right
    for (let i = startRow; i <= endRow; i++) {
      result[i][endCol] = counter;
      counter++;
    }
    endCol--;
    //bottom
    for (let i = endCol; i >= startCol; i--) {
      result[endRow][i] = counter;
      counter++;
    }
    endRow--;
    //left
    for (let i = endRow; i >= startRow; i--) {
      result[i][startCol] = counter;
      counter++;
    }
    startCol++;
  }
  return result;
}
console.log(matrix(4));

function practiceMatrix(n) {
  const result = [];
  let startRow = 0,
    endRow = n - 1,
    endCol = n - 1,
    startCol = 0;
  let count = 1;
  for (let i = 0; i < n; i++) {
    result.push([]);
  }
  while (startRow <= endRow && startCol <= endCol) {
    for (let i = startCol; i <= endCol; i++) {
      result[startRow][i] = count;
      count++;
    }
    startRow++;
    for (let i = startRow; i <= endRow; i++) {
      result[i][endCol] = count;
      count++;
    }
    endCol--;
    for (let i = endCol; i >= startCol; i--) {
      result[endRow][i] = count;
      count++;
    }
    endRow--;
    for (let i = endRow; i >= startRow; i--) {
      result[i][startCol] = count;
      count++;
    }
    startCol++;
  }
  console.log(result);
}
practiceMatrix(4);

function practiceSpiralMatrix(n) {
  const result = [];
  let startRow = 0,
    endRow = n - 1,
    startCol = 0,
    endCol = n - 1;
  let count = 1;
  for (let i = 0; i < n; i++) {
    result.push([]);
  }
  while (startCol <= endCol && startRow <= endRow) {
    for (let i = startCol; i <= endCol; i++) {
      result[startRow][i] = count;
      count++;
    }
    startRow++;
    for (let i = startRow; i <= endRow; i++) {
      result[i][endCol] = count;
      count++;
    }
    endCol--;
    for (let i = endCol; i >= startCol; i--) {
      result[endRow][i] = count;
      count++;
    }
    endRow--;
    for (let i = endRow; i >= startRow; i--) {
      result[i][startCol] = count;
      count++;
    }
    startCol++;
  }
  console.log(result);
}
practiceSpiralMatrix(5);
