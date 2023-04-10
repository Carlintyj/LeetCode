import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char popped = stack.pop();
                    if (bracket == ')' && popped != '(' ||
                            bracket == '}' && popped != '{' ||
                            bracket == ']' && popped != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
