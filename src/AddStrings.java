public class AddStrings {

    // Solution: https://www.youtube.com/watch?v=q1RR8gk47Cg&ab_channel=CrackingFAANG

    public static String addStrings(String num1, String num2) {

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        //Want to have two pointers, both starting at the end of each string
        int i = num1.length() -1;
        int j = num2.length() -1;



        int carry = 0; // this will be used for the addition of each digit

        StringBuilder result = new StringBuilder();

        while(i >=0 || j>=0){
            int current_i = 0;
            int current_j = 0;

            if( i>=0) {
                //How to convert a char to int
                current_i = num1.charAt(i) - '0';
            } else { //at the beginning of num1 so add leading zeros
                current_i =0;
            }

            if( j>=0) {
                current_j = num2.charAt(j) - '0';
            } else {//at the beginning of num2 so add leading zeros
                current_j =0;
            }

            System.out.println("i: " + i + "  current_i: " + current_i);
            System.out.println("j: " + j + "  current_j: " + current_j);


            int current_sum = carry + current_i + current_j;
            System.out.println("currentSum: " + current_sum);

            // But after that the carry variable will be updated with the tens place of whatever the current sum is
            // Think :
//                     1
//                    456
//                   + 77
//                   ~~~~~
//                       3
            // 6+7= 13 we want to append the ones place to the result
            // 13 % 10 gives the ones place
            // 13 / 10 gives the tens place we need to carry
            result.append((current_sum % 10));
            System.out.println("result: " + result);

            // current_sum divide by 10 will give you the tens place
            carry = current_sum / 10;
            System.out.println("carry: " + carry);


            i --;
            j --;
        }

        //carry could be left over like 999 + 999
        if(carry != 0) result.append(carry);

        //result was appended to so the num is backwards
        return result.reverse().toString();

    }

    //T: O(N +M) (length of num 1 + length of num2)
    //S: O(N +M)

}
