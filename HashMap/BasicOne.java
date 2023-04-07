package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicOne {
    public static void main(String[] args) {
        int nums [] = {4,5,7,9,8,4,5};
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            list.add(nums[i] ^ 2);
        }
        System.out.println(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
            System.out.println(ent.getKey() + " " + ent.getValue());
        }
    }
}
