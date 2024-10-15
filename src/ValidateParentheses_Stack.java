import java.util.HashMap;
import java.util.Stack;

public class ValidateParentheses_Stack {

    // https://www.youtube.com/watch?v=7-_V-ufnF4c&ab_channel=GregHogg
    public boolean isValid(String s) {
        HashMap<Character, Character> pairs = new HashMap<Character, Character>();
        // Store the key as the closing bracket and the value as the closing bracket
        pairs.put(')','(');
        pairs.put(']','[');
        pairs.put('}','{');

        Stack<Character> stack = new Stack<Character>();
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(!(pairs.containsKey(c))){ // The current char is an open bracket
                stack.push(c); // Want to push chars onto stack

            } else { //It's a closing bracket

                if(stack.isEmpty()){ // Closing bracket with no corresponding open bracket
                    return false;
                }else{
                    char popped = stack.pop();
                    if(popped != pairs.get(c)){ // The popped char must equal the value of pairs with key c (current char)
                        // Ensuring that open bracket has corresponding closing bracket
                        return false;
                    }
                }
            }
        }

        // If stack is not empty then open brackets left over with no closing brackets => false
        return stack.isEmpty();
    }
}
