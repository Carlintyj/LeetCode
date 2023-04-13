import java.util.Stack;
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popped_count = 0;
        int count = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[popped_count]) {
                stack.pop();
                popped_count++;
            }
        }
        return stack.isEmpty();
    }
}
