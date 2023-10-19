class Solution {
    public int missingNumber(int[] nums) {
        int sum = (0 + (nums.length + 1)) * (nums.length + 1 - 1) / 2;
        System.out.println(sum);
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }
        System.out.println(sum2);
        return sum - sum2;
    }
}