import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length(); i++){
            char cur=s.charAt(i);
            if(cur=='(' || cur=='[' || cur=='{'){
                st.push(i);
            }
            else if(!st.isEmpty() && s.charAt(st.peek())=='(' && cur==')'){
                st.pop();
            }
            else if(!st.isEmpty() && s.charAt(st.peek())=='[' && cur==']'){
                st.pop();
            }
            else if(!st.isEmpty() && s.charAt(st.peek())=='{' && cur=='}'){
                st.pop();
            }
            else return false;
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}