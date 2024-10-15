import java.util.HashSet;
public class JewelsStonesHashset {

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<Character>();

        int count = 0;


        for(int i=0; i<jewels.length(); i++){
            jewelsSet.add(jewels.charAt(i));
        }

        for(int i=0; i<stones.length(); i++){
            if(jewelsSet.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;

        //Time Complexity: O(n+m)
    }
}
