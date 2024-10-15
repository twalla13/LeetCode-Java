public class ProductofArrayExpectSelf {
    public int[] productExceptSelf(int[] nums) {
        int l = 1;
        int r = 1;

        int n = nums.length;

        int[] left_array = new int[n];
        int[] right_array = new int[n];
        int[] toReturn = new int[n];

        for(int i= 0, j= n-1; i < n && j >= 0; i++, j--){
            left_array[i] = l;
            right_array[j] =  r;
            l *= nums[i];
            r *= nums[j];
        }

        for(int i = 0; i < n; i++){
            toReturn[i]=left_array[i]*right_array[i];
        }

        return toReturn;
    }
}
