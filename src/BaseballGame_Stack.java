import java.util.Stack;

public class BaseballGame_Stack {
// https://leetcode.com/problems/baseball-game/description/
    public static int calPoints(String[] operations) {
        /**
         *
         * Initial thoughts:
         * When a number is given, record
         * When char (+, D, C) are given, update record
         * Using if/else to check input for int or char
         *
         *
         * Data Structure: Stack due to the way the input is given
         * Operations are only done to the previous score
         * Stacks maintain order due to FILO
         */

        Stack<Integer> records = new Stack<Integer>();

        for(String ops : operations){
            if(numcheck(ops)){
                records.push(Integer.parseInt(ops));
            } else if(ops.equals("C")){
                records.pop();
            } else if (ops.equals("D")) {
                int prevScore = records.peek() * 2;
                records.push(prevScore);
            } else if (ops.equals("+")) {

                //Must clone a stack
                Stack<Integer> copy = (Stack<Integer>) records.clone();
                int pop1 = copy.pop();
                int pop2 = copy.pop();
                records.push(pop1 + pop2);
            }
//            System.out.println("Current operation: "+ ops +" ,Current records: " + records);
        }

        int totalSum = 0;

        while(!(records.isEmpty())){
            totalSum += records.pop();
        }

        return totalSum;

    }

    // How to check is numeric because Integer.parseInt will through an exception
    public static boolean numcheck(String ms) {
        try {
            Integer.parseInt(ms);
        }catch(Exception e){
            return false;
        }

        return true;
    }
}
