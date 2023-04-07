package MediumLevel;

import java.util.*;;

public class MajorityElementII {
    public static List<Integer> majorityElement(int []nums){
        List <Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) > nums.length/3){
                set.add(nums[i]);
            }
        }

        for(int val : set){
            res.add(val);
        }
        
        return res;
    }
       
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,3,1,2};
        // int n = nums.length;
        List<Integer> res = majorityElement(nums);
        System.out.println(res);
    }
}
