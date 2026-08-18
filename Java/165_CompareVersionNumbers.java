class Solution {
    public int compareVersion(String version1, String version2) {
        int v1=version1.length();
        int v2=version2.length();

        int i=0;
        int j=0;
        
        while(i<v1 || j<v2){
            int num1=0;
            while(i<v1 && version1.charAt(i)!='.'){
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            int num2=0;
            while(j<v2 && version2.charAt(j)!='.'){
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            if(num1<num2){
                return -1;
            }
            if(num1>num2){
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}