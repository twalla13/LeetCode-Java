import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        //Anagrams must be the same length since it says "using all the original letters exactly once."
        if(s.length() != t.length()) return false;


        //If you sort both strings for then to be an anagram
        //they have to be equal when alphabetized (sorted)
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);

// This is using an array of size 26 where the indices correlate to the alphabet
// Do we need two counters for comparison? Actually no, because we can increment the count for each letter in s and decrement the count for each letter in t, and then check if the count for every character is zero.
// This case doesnt acount for if there was unixcode
//        int[] counter = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            counter[s.charAt(i) - 'a']++;
//            counter[t.charAt(i) - 'a']--;
//        }
//        for (int count : counter) {
//            if (count != 0) {
//                return false;
//            }
//        }
//        return true;
    }

//    Time complexity: O(nlogn).
//    Assume that n is the length of s, sorting costs O(nlogn) and comparing two strings costs O(n). Sorting time dominates and the overall time complexity is O(nlogn).
//
//    Space complexity: O(1).
//    Space depends on the sorting implementation which, usually, costs O(1) auxiliary space if heapsort is used. Note that in Java, toCharArray() makes a copy of the string so it costs O(n) extra space, but we ignore this for complexity analysis because:
//
//    It is a language dependent detail.
//    It depends on how the function is designed. For example, the function parameter types can be changed to char[].

}
