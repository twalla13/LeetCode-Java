import java.util.HashSet;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) return "";
        //Common index i
        //Just compare them to the first string and return the substring once they are not equal

        for(int i =0; i < strs.length; i++){
            char c = strs[0].charAt(i);
            for(int j= 1 ; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];

    }

}
