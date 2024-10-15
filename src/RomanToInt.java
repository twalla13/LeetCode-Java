import java.util.HashMap;

public class RomanToInt {
    public  static int romanToInt(String s) {
        HashMap <Character, Integer> characterIntegerHashMap = new HashMap<Character, Integer>();

        characterIntegerHashMap.put('I', 1);
        characterIntegerHashMap.put('V', 5);
        characterIntegerHashMap.put('X', 10);
        characterIntegerHashMap.put('L', 50);
        characterIntegerHashMap.put('C', 100);
        characterIntegerHashMap.put('D',500);
        characterIntegerHashMap.put('M', 1000);

        int sum = 0;
        int i = 0;
        while( i < s.length()){
            if(!characterIntegerHashMap.containsKey(s.charAt(i))) return -1;
            System.out.println(" s: " + s.charAt(i));
            if(  (i < (s.length() - 1)) && (characterIntegerHashMap.get(s.charAt(i)).compareTo(characterIntegerHashMap.get(s.charAt(i + 1))) < 0  ) ){
                sum += characterIntegerHashMap.get(s.charAt(i + 1)) - characterIntegerHashMap.get(s.charAt(i));
                //if we subtract then we must move over twice
                i+=2;
            } else {
                sum += characterIntegerHashMap.get(s.charAt(i));
                i++;
            }
        }

        return sum;

    }
}
