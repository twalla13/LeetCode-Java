import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfArray {
    public static int[] arrayRankTransform(int[] arr) {

        int[] toReturn = new int [arr.length];

        //Must us copy of method or else it will sort original arr
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        // Loop over the sorted array and assign ranks to each number
        for (int num : temp) {
            // If the number hasn't been assigned a rank yet, map it to the current rank
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }


        // Now assign the rank from the map to the corresponding elements in the original array
        for (int i = 0; i < arr.length; i++) {
            toReturn[i] = rankMap.get(arr[i]);
        }

        return toReturn;

    }
}
