class Day34 {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
}