class Day20 {
    public int largestAltitude(int[] gain) {
        int[] finalpoint=new int[gain.length+1];
        finalpoint[0]=0;
        for(int i=0;i<gain.length;i++){
            int sum=gain[i]+finalpoint[i];
            finalpoint[i+1]=sum;
        }
        int greatest=0;
        for(int i=0;i<finalpoint.length;i++){
            if(finalpoint[i]>greatest){
                greatest=finalpoint[i];
            }
           
        }
         return greatest;
    }
}