/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let str = ""
    for (let i = 0; i < word1.length; i++) {
        if (word2.charAt(i) == null) {
            break;
        }
        str+=word1.charAt(i) + word2.charAt(i);
    }
    if (word1.length < word2.length) {
        for (let j = word1.length; j < word2.length; j++) {
            str+=word2.charAt(j);
        }
    }
    return str;
};