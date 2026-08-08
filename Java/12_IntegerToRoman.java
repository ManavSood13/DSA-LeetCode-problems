import java.util.*;
class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
       StringBuilder res=new StringBuilder();
       ArrayList<Integer> keys=new ArrayList<>(map.keySet());
       Collections.sort(keys,Collections.reverseOrder());
       for(int key:keys){
        while(num>=key){
            res.append(map.get(key));
            num-=key;
        }
       } 
       return res.toString();
    }
}

