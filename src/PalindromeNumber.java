public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        // Did it without using strings
        // To visualize: https://www.youtube.com/watch?v=ltKBtsrlaA0
        int reverseNum = 0;
        int orginalX = x;

        while( orginalX > 0){
            reverseNum = 10 * reverseNum + orginalX % 10;
            orginalX /= 10;
        }
        return x == reverseNum;

    }
}
