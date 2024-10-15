public class ReverseInt {

    public static int reverse(int x) {

        //Must handle sign, if you dont string will be 210-
        int sign = 1;
        if(x < 0){
            sign = -1;
            x= x*-1;

        }


        StringBuilder reverse = new StringBuilder(Integer.toString(x));
        System.out.println(x);

        //Can also used reverse.toString().spilt(') to spilt int

        reverse.reverse();

        int reverseInt = 0;

        if(x < (Integer.MIN_VALUE + 1) || Integer.parseInt(String.valueOf(reverse)) > (Integer.MAX_VALUE-1) ){
            return reverseInt;
        } else {
            reverseInt = Integer.parseInt(String.valueOf(reverse));
        }

        return reverseInt * sign;
    }
}
