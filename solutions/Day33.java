class Day33 {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int totalsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rightsum=totalsum-leftsum-nums[j];
            if(rightsum==leftsum){
                return j;
            }else{
                leftsum+=nums[j];
            }


        }
        return -1;
    }
}