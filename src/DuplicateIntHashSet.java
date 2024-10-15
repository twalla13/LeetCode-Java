import java.util.HashSet;

public class DuplicateIntHashSet {
    public static boolean containsDuplicate(int[] nums) {
        HashSet <Integer> s = new HashSet<Integer>();
        for(int i : nums){
            if(s.contains(i)){
                return true;
            }else{
                s.add(i);
            }
        }
        return false;

    }

    public static boolean containsDuplicateChar(String word) {

        //Lower case and Upper case letters are not the same
        HashSet <Character> s = new HashSet<>();
        for(int i =0; i < word.length(); i++ ){
            if(s.contains(word.charAt(i))){
                return true;
            }else{
                s.add(word.charAt(i));
            }
        }

        return false;

    }
}
