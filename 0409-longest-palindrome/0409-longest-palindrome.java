class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        int non_pld = 0;
        for (int value : map.values()) {
            if (value != 1) {
                if (value % 2 == 0) {
                    result += value;
                }
                else {
                    result += (value - 1);
                    non_pld++;
                }
            }
            else non_pld++;
        }
        if (non_pld == 0) {
            return result;
        }
        else return result + 1;
    }
}