public class ClosestNumToZero {
    public int findClosestNumber(int[] nums) {
        int closest= nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            }
        }

        if(closest<0 && inArray(nums, closest)){
            return Math.abs(closest);
        } else{
            return closest;
        }

    }

    public boolean inArray(int[] array, int number){

        for (int j : array) {
            if (j == Math.abs((number))) {
                return true;
            }
        }

        return false;
    }
}
