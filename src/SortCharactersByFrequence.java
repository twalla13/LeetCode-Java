import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortCharactersByFrequence {

    public static String frequencySort(String s) {

        if (s == null || s.isEmpty()) return s;

        ArrayList<String> charStrs = new ArrayList<>();

        StringBuilder currentString = new StringBuilder();

        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        currentString.append(charArray[0]);
        for(int i=1; i < charArray.length; i++){

//           This doesnt work because we only append to the currentString if the              chars arent equal. Since currentString doesn't include the current                character (charArray[i]) before it resets, the current character is               lost.
//            for(int i = 0; i < charArray.length - 1; i++) {
//                if(charArray[i] == charArray[i + 1]) {
//                    currentString.append(charArray[i]);
//                } else {
//                    charStrs.add(String.valueOf(currentString));
//                    currentString = new StringBuilder();
//                }
//            }

            if( charArray[i] != charArray[i-1] ){
                charStrs.add(String.valueOf(currentString));
                currentString = new StringBuilder();
            }

            // Must have append after the if so we dont add non-identical chars in the same string
            currentString.append(charArray[i]);

        }
        charStrs.add(currentString.toString());
        System.out.println("Unsorted charStrings: " + charStrs);

        // Sorting using Collections.sort with a custom comparator
        // Sorting a list of Strings by length

//        Collections.sort(charStrs, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        });

        // Our comparator is (a, b) -> b.length() - a.length().
        // If a is longer than b, then a negative number will be returned
        // telling the sort algorithm to place a first. Otherwise, a positive
        // number will be returned, telling it to place a second.
        // This results in a longest to shortest sorted list of the strings.
        Collections.sort(charStrs, (a, b) -> b.length() - a.length());

        StringBuilder toReturn= new StringBuilder();
        // Printing the sorted list
        for (String x : charStrs) {
            toReturn.append(x);
        }

        return toReturn.toString();
    }
}
