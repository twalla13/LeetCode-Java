import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    // Check under String & Arrays in LeetCode Notes

    public static List<List<Integer>> threeSum(int[] nums) {
        //Sort the Array
        //Fix the first element of triple and compare it to the rest of nums
        //if fixed element, left, right == 0 then add it to the Hashset
        //HashSet prevents duplicates

        if(nums == null || nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);
        HashSet<List<Integer>> triples = new HashSet<>();

        for(int i =0; i < nums.length -2 ;i++){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                //Since the list is sorted, when sum is to small we can increase it by moving the left pointer
                //when sum is to large we can decrease it by moving the right pointer
                if(sum == 0){
                    triples.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum < 0){ //Move left pointer because sum is to small
                    left++;
                }else{ //Move right pointer because sum is to large
                    right--;
                }
            }
        }


     return new ArrayList<>(triples);
    }
}
