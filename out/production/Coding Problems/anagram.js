// check to see if two provided strings are anagrams of each other in the same quantity, only consider characters, not spaces or punctuation. consider capital letter to be the same as lower case
//Ex : anagrams('coding money','money coding') -> True
//Ex : anagrams('Hi there', 'Bye there') -> False
//logic: build char map for stringA, then build char map for stringB, then compare each character in the both the char maps

function charMap(str) {
  const charmap = {};
  str = str.toLowerCase().replace(/[\W]/g, "");
  for (let char of str) {
    charmap[char] = ++charmap[char] || 1;
  }
  return charmap;
}

function anagram(stringA, stringB) {
  const charmapA = charMap(stringA);
  const charmapB = charMap(stringB);
  if (Object.keys(charmapA).length !== Object.keys(charmapB).length) {
    return false;
  }
  for (let key in charmapA) {
    if (charmapA[key] !== charmapB[key]) {
      return false;
    }
  }
  return true;
}
console.log(anagram("RAIL! SAFETY!", "fairy tales"));

function practiceMap(str) {
  const charmap = {};
  str = str.toLowerCase().replace(/[\W]/g, "");
  for (let char of str) {
    charmap[char] = ++charmap[char] || 1;
  }
  return charmap;
}

function practice(stringA, stringB) {
  const charmapA = practiceMap(stringA);
  const charmapB = practiceMap(stringB);
  if (Object.keys(charmapA).length !== Object.keys(charmapB).length)
    return false;
  for (let key in charmapA) {
    if (charmapA[key] !== charmapB[key]) {
      return false;
    }
  }
  return true;
}
console.log(practice("hello there", "hello hello"));

function cleanStr(str) {
  return str.toLowerCase().replace(/[\W]/g, "").split("").sort().join("");
}
function anagram2(stringA, stringB) {
  return cleanStr(stringA) === cleanStr(stringB);
}
console.log(anagram2("hello there", "there hello"));

function practiceCleanStr(str) {
  return str.toLowerCase().replace(/[\W]/g, "").split("").sort().join("");
}
function practice2(stringA, stringB) {
  return practiceCleanStr(stringA) === practiceCleanStr(stringB);
}
console.log(practice2("hello there", "there hello"));
