class Day45 {
    public int findKthLargest(int[] nums, int k) {
     Arrays.sort(nums);
     return nums[nums.length-k];
    }
}