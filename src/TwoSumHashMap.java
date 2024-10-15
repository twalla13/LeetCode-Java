import java.util.HashMap;

public class TwoSumHashMap {
// Leetcode Link: https://leetcode.com/problems/two-sum/description/
    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> h = new HashMap<>();
//
//        for(int i : nums){
//            h.put(i,nums[i]);
//        }
//
//        for(Integer i: nums){
//            int y = target - nums[i];
//
//            if(h.containsValue(y) && (h.get(y) != i) ){
//                int[] toReturn = {i, h.get(y)};
//                return toReturn;
//            }
//        }
//        return null;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};


    }
}
