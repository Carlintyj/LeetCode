import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String answer = "";
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            answer = stack.pop() + answer;
        }
        return answer;
    }
}

