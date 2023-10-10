class Solution {
    public boolean isPalindrome(int x) {
        Stack<Character> stack = new Stack<>();
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }
        for (int i = 0; i < ch.length; i++) {
            if (stack.pop() != ch[i]) {
                return false;
            }
        }
        return true;
    }
}