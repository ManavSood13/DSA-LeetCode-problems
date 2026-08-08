class Solution {
    public boolean isPalindrome(int x) {
        String str =Integer.toString(x);
        int n=str.length();
        int j=n-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==str.charAt(j)){
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}