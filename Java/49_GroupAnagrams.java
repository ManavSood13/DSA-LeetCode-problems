import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result=new HashMap<>();

        for(String str: strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            Arrays.toString(c);
            String word=new String(c);
            if(result.containsKey(word)){
                result.get(word).add(str);
            }
            else{
                result.put(word,new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(result.values());
    }
}