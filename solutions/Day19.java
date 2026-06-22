class Day19 {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){
            boolean check=false;
            for(int i=0;i<sentence.length();i++){
                if(ch==Character.toLowerCase(sentence.charAt(i))){
                    check= true;
                    break;
                }
            }
            if(!check){
                return false;
            }

        }
        return true;
        
    }
}