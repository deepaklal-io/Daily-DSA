class Day25 {
    public int[] plusOne(int[] digits) {
        int count=0;
        for(int i=0;i<digits.length;i++){
            count=count*10+digits[i];
        }
        int result=count+1;
        String str=String.valueOf(result);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        return arr;
    }
}