class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder result=new StringBuilder();
        int n=s.length();
        boolean is_space=false;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)== ' '){
                if(!is_space){
                    result.append(s.substring(i+1,n));
                    result.append(" ");
                    is_space=true;
                }
                n=i;
            }
            else{
                is_space=false;
            }
        }
        if (!is_space) {
            result.append(s.substring(0, n));
        }
        return result.toString();
    }
}