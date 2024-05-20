function twoSum(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        console.log([i, j]);
      }
      if (nums[nums.length - 1 - i] + nums[j] === target) {
        console.log([nums.length - 1 - i, j]);
      }
    }
  }
}
twoSum([2, 7, 11, 15], 9);

function twoSum2(nums, target) {
  const numIndicesMap = {};

  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];

    if (numIndicesMap[complement] !== undefined) {
      // Return the indices of the two numbers
      return [numIndicesMap[complement], i];
    }

    // Store the index of the current number
    numIndicesMap[nums[i]] = i;
  }

  // If no solution is found, return an empty array
  return [];
}

const nums = [2, 7, 11, 15];
const target = 9;
console.log(twoSum2(nums, target)); // Output: [0, 1] (because nums[0] + nums[1] = 2 + 7 = 9)
