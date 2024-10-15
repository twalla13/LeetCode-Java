import java.util.Arrays;

public class MoveZeros_Array
{
    public static void moveZeroes(int[] nums) {

        int j = 0;
        for(int i =0; i < nums.length; i++ ) {
            if (nums[i] != 0 ) {
                //cannot have currentIndex = pointer to zero index
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
