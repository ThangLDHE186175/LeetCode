class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toLowerCase(c));
                sb.append(Character.toLowerCase(c));
            }
        }
        while (!stack.isEmpty()) {
            sb2.append(stack.pop());
        }
        return (sb.toString()).equals(sb2.toString());
    }
}