public class MergeTwoSortedArrays {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {

//            1 2 3 | 2 5 6
//
//            for(i; length of num1?)
//            m = num1[i]
//            n= num2[i]
//            num1[i] < num2[i]
//
//            num2[i] insert at index num1[i++]
//            i++
            int r1 = m-1;
            int r2 = n-1;

            for(int w = m + n - 1; w >=0; w--){
                if(r2 < 0) break;

                if(r1 >= 0 && nums1[r1] > nums2[r2]){
                    nums1[w] = nums1[r1];
                    r1--;
                } else {
                    nums1[w] = nums2[r2];
                    r2--;
                }

            }

        }
}
