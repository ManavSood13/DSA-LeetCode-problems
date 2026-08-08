class Solution {
    public int myAtoi(String s) {
        long result = 0;
        int i=0; //index

        //Step 1:removing white spaces
        s=s.trim();
        //Step 1.1: check after removing whit space is the string empty
        if(s.length()==0){
            return (int) result;
        }
        //Step 2: check the sign
        int sign=1;
        if(s.charAt(i)=='+'){
            i++;
        }
        else if(s.charAt(i)=='-'){
            sign*=-1;
            i++;
        }

        //Step 3: treverse the string to get the numbers
        //loop will not start or will end i<length 
        //and character is not a digit
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            result=result*10+digit;

        //Step 4: check if the number is exceeding the integer range
            if(sign*result <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if(sign*result >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return (int)result*sign;

    }
}