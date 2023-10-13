class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                list.add(mid);
                int temp = mid - 1;
                while (temp >= 0 && nums[temp] == target) {
                    list.add(temp);
                    temp --;
                }
                temp = mid + 1;
                while (temp < nums.length && nums[temp] == target) {
                    list.add(temp);
                    temp++;
                }
                break;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        Collections.sort(list);
        return list;
    }
}