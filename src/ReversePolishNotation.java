import java.util.Stack;

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Stack<Integer> rp = new Stack<>();

        for(String token: tokens){

            if(token.equals("+")){
                int op2 = rp.pop();
                int op1 = rp.pop();
                rp.push(op1+op2);
            } else if(token.equals("-")){
                int op2 = rp.pop();
                int op1 = rp.pop();
                rp.push(op1-op2);
            } else if(token.equals("*")){
                int op2 = rp.pop();
                int op1 = rp.pop();
                rp.push(op1*op2);
            } else if(token.equals("/")){
                int op2 = rp.pop();
                int op1 = rp.pop();
                rp.push(op1/op2);
            } else {
                rp.push(Integer.parseInt(token));
            }
        }

        return rp.pop();
    }
}
