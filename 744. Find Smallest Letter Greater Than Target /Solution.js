/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    for (var i = 0; i < letters.length; i++) {
        if (letters[i] == target && letters[i] != letters[i+1]) {
            return i == letters.length-1 ? letters[0] : letters[i+1];
        } else if (letters[i] > target) {
            return letters[i];
        }
    }
    return letters[0];
};