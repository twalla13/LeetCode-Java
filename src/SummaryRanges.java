import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SummaryRanges {


    //Initial Thoughts:
    // loop through int array
    // sorted so finding ranges
    // so we can assume first element will be first number in range
    // first element smallest, last element largest
    // RANGE MUST BE MADE UP of NUMBERS IN ARRAY
    // Represent range as hashmap ?

    //Sketching:
    // int startIndex = 0
    // int current = num[startIndex];
    // Hashmap range
    // range.put( num[startIndex], current)
    // loop through int array (i = 1 bc of current starting a zero)
        // if(current + 1 == num[i] )
            //sorted in ascending order so only need to update value of hashmap (end value in range)
            // range.put(num[startIndex], num[i]) ***
            // current = num [i];
        //else
            // startIndex = i
            // current = num[i]
            // add new pair to range hashmap -> range.put(num[startIndex], current)

    // Edge cases when start and end numbers are the same not handled

    public static List<String> summaryRanges(int[] nums) {

//        int startIndex = 0;
//        int current = nums[startIndex];
//        List<String> toReturn = new ArrayList<>();
//        HashMap<Integer, Integer> ranges = new HashMap<Integer,Integer>();
//        ranges.put(nums[startIndex], current);
//        for(int i = 1; i < nums.length; ++i){
//            if(current + 1 == nums[i]){
//                ranges.put(nums[startIndex], nums[i]);
//                current = nums[i];
//
//            } else {
//                System.out.println("current: " + current +" nums[i]: " + nums[i]);
//                if(current ==  nums[startIndex]){
//                    toReturn.add(Integer.toString(current));
//                } else {
//                    toReturn.add(nums[startIndex] +"->"+ ranges.get(nums[startIndex]).toString());
//                }
//                startIndex = i;
//                current = nums[i];
//                System.out.println("ADD NEW PAIR: current: " + current +" nums[i]: " + nums[i]);
//                ranges.put(nums[startIndex], current);
//
//                System.out.println("Current string list" + toReturn);
//
//            }
//
//        }
//         if (current + 1 == nums[nums.length-1]) {
//             toReturn.add(nums[current] +"->"+ nums[nums.length-1]);
//         } else {
//             toReturn.add(Integer.toString(current));
//         }
//
//
//        return toReturn;

        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            // Keep iterating until the next element is one more than the current element.
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) { i++;}

            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }

        return ranges;

        // Time complexity: O(n) because iterate i until there is a break in sequence
        // i is not being rest in the inner while loop, i is moving towards the end of the array

    }
}
