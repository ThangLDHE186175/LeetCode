class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack1.isEmpty() && c == '#') {
                stack1.pop();
            }
            else if (stack1.isEmpty() && c == '#') {
                continue;
            }
            else stack1.push(c);
        }
        for (char c : t.toCharArray()) {
            if (!stack2.isEmpty() && c == '#') {
                stack2.pop();
            }
            else if (stack2.isEmpty() && c == '#') {
                continue;
            }
            else stack2.push(c);
        }
        while (!stack1.isEmpty()) {
            sb1.append(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            sb2.append(stack2.pop());
        }
        System.out.println(sb1);
        System.out.println(sb2);
        return (sb1.toString()).equals(sb2.toString());
    }
}