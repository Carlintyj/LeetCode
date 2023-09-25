class Solution {
    public char findTheDifference(String s, String t) {
        int s_ascii = 0;
        int t_ascii = t.charAt(t.length()-1);
        for (int i = 0; i < s.length(); i++) {
            s_ascii += s.charAt(i);
            t_ascii += t.charAt(i);
        }
        return (char) (t_ascii - s_ascii);
    }
}