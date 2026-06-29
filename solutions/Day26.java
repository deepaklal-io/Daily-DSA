class Day26 {
    public int[] searchRange(int[] nums, int target) {
        int[] output={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(output[0]==-1){
                    output[0]=i;

                }
                output[1]=i;
            }
            
        }
        return output;
        
    }
}