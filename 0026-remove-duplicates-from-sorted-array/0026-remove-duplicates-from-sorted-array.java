class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == true) {
                nums[index++] = nums[i]; 
            }
        }
        return set.size();
    }
}