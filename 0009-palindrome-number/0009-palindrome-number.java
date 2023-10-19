class Solution {
    public boolean isPalindrome(int x) {
        return isPalindromeHelper(Integer.toString(x));
    }
    public boolean isPalindromeHelper(String x) {
        System.out.println(x);
        if (x == null) {
            return true;
        }
        if (x.length() <= 1) {
            return true;
        }
        if (x.charAt(0) != x.charAt(x.length() - 1)) {
            return false;
        }
        return isPalindromeHelper(x.substring(1, x.length() - 1));
    }
}