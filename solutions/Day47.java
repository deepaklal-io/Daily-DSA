class Day47 {
    public int findPeakElement(int[] nums) {
        int largest=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(largest==nums[i]){
                return i;
            }


        }
        return -1;
    }
}