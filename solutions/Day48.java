class Day48 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] temp=new int[n];
        for(int i=0;i<nums1.length;i++){
            temp[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            temp[nums1.length+i]=nums2[i];
        }
        Arrays.sort(temp);
        if(temp.length%2==0){
            return (temp[n/2 - 1] + temp[n/2]) / 2.0;
        }else{
            return temp[n/2];
        }

    }
}