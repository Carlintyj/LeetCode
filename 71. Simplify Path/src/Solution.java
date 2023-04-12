import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        String output = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!arr[i].equals("") && !arr[i].equals(".")) {
                stack.push(arr[i]);
            }
        }

        int n = stack.size();
        for (int i = 0; i < n; i++) {
            output = "/" + stack.pop() + output;
        }
        return n == 0 ? "/" : output;
    }
}
