import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class   DailyTemp_Stack {
// https://www.youtube.com/watch?v=_ZEvmycwXHs&ab_channel=GregHogg

    //Monotonic Stacks ensure that elements inside the stack are arranged in an increasing or decreasing order based on their arrival time
    //Monotonic stacks are a good option when a problem involves comparing the size of numeric elements, with their order being relevant.
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];
        Arrays.fill(answers, 0);

        Stack monoStack = new Stack();

        for(int i = 0; i < temperatures.length; i++){
            int currentTemp = temperatures[i];
            while(!(monoStack.isEmpty()) && temperatures[(int) monoStack.peek()] < currentTemp){
                int prevDay = (int) monoStack.pop();
                answers[prevDay] = i - prevDay;
            }
                monoStack.push(i);
        }

        return answers;
    }
}
