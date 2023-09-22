class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        Queue<Character> charList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        
        char peek = charList.peek();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == peek) {
                charList.poll();
                if (charList.peek() == null) {
                    return true;
                }
                peek = charList.peek();
            }
        }
        return charList.isEmpty();
    }
}