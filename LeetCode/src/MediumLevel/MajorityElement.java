package MediumLevel;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = {3,3,4,4};
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);
        int ans = 0; 
        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
            if(ent.getValue() > n /2){
                ans = ent.getKey();
            }
            
        }
        System.out.println(ans);
    }
}
