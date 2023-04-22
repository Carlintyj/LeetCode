class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        str = ""
        for i in range(len(strs[0])):
            str += strs[0][i]
            for word in strs:
                if i >= len(word) or word[i] != str[i]:
                    str = str[:-1]
                    return str
        return str
            