class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        answer[0]=1;
        for(int j=1;j<answer.length;j++){
            answer[j]=answer[j-1]*nums[j-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
           answer[i]*=right;
           right*=nums[i];
        }
        return answer;
    }
}