public class MergeStringsAlt {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();

        for(int i=0; i < Math.max(word1.length(), word2.length()); i++){

            //if increment variable i is larger than the string length then string is empty
            if(i < word1.length()) {
                merged.append(word1.charAt(i));}
            if(i < word2.length()) {
                merged.append(word2.charAt(i));}
        }

        return merged.toString();

        //Time Complexity: O(n)

        //Space Complexity: O(word1 + word2)= O(2n) = O(n)

    }
}
