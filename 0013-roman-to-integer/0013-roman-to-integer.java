class Solution {
    public int romanToInt(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == 'V' && stack.peek() == 'I') {
                stack.pop();
                result += 4;
            }
            else if (!stack.isEmpty() && c == 'X' && stack.peek() == 'I') {
                stack.pop();
                result += 9;
            }
            else if (!stack.isEmpty() && c == 'L' && stack.peek() == 'X') {
                stack.pop();
                result += 40;
            }
            else if (!stack.isEmpty() && c == 'C' && stack.peek() == 'X') {
                stack.pop();
                result += 90;
            }
            else if (!stack.isEmpty() && c == 'D' && stack.peek() == 'C') {
                stack.pop();
                result += 400;
            }
            else if (!stack.isEmpty() && c == 'M' && stack.peek() == 'C') {
                stack.pop();
                result += 900;
            }
            else stack.push(c);
        }
        while (!stack.isEmpty()) {
            int val = map.get(stack.pop());
            result += val;
        }
        return result;
    }
}