class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && (c - stack.peek() == 32 || stack.peek() - c == 32)) {
                stack.pop();
            }
            else stack.push(c);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        // for (int i = 0; i < s.length() - 1; i++) {
        //     stack.push(s.charAt(i));
        //     while (s.charAt(i) == Character.toUpperCase(s.charAt(i + 1))) {
        //         stack.pop();
        //     }
        //     sb.append(stack.peek());
        // }
        return sb.reverse().toString();
    }
}