import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        // Sort array with lambda functions
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

//        int[][] merge = new int[intervals.length][2]; cant check if array is empty

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            } else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return  merged.toArray(new int[merged.size()][]);

    }
}
