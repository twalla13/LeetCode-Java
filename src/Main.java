import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println( RomanToInt.romanToInt("MCMXCIV"));

        System.out.println( JewelsStonesHashset.numJewelsInStones("aA", "aAAbbb"));

        int[] nums = {1,2,2,3};
        System.out.println(DuplicateIntHashSet.containsDuplicate(nums));
        System.out.println(DuplicateIntHashSet.containsDuplicateChar("TonIi"));

        int[] nums2 = {1,2,2,3};
        System.out.println(Arrays.toString(TwoSumHashMap.twoSum(nums, 4)));

        System.out.println( IsSubsequence.isSubsequence("abc", "ahbgdc"));

        System.out.println( IsSubsequence.isSubsequence("acb", "ahbgdc"));

        int[] prices = {7,6,4,3,1};
        System.out.println( BestTimeToBuyNSellStock.maxProfit(prices));

//        String[] words = {"apple", "app"};
//        String order = "abcdefghijklmnopqrstuvwxyz";
//
//        System.out.println(VerfiyingAlienLanguage_Permutation.isAlienSorted(words, order));
//
//        String[] words1 = {"word","world","row"};
//        String order1 = "worldabcefghijkmnpqstuvxyz";
//
//        System.out.println(VerfiyingAlienLanguage_Permutation.isAlienSorted(words1, order1));

        System.out.println(ReverseInt.reverse(-2147483648));

//        System.out.println(AddStrings.addStrings("999", "999" ));

        int[] array = {0,1,0,3,12};
        MoveZeros_Array.moveZeroes(array);

        int[] array1 = {1};
        MoveZeros_Array.moveZeroes(array1);
        int[] array10= {2,1};
        MoveZeros_Array.moveZeroes(array10);

        int[] array110= {1,2,3,1};
        MoveZeros_Array.moveZeroes(array110);

//        MinStack minStack = new MinStack();
//        minStack.push(0);
//        minStack.push(1);
//        minStack.push(0);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin()); // return -2

//        MinStack minStack2 = new MinStack();
//        minStack2.push(-2);
//        minStack2.push(0);
//        System.out.println(minStack2.getM
//        minStack2.push(-3);in());
//        minStack2.pop();
//        System.out.println(minStack2.getMin()); // return -2

//        String[] ops = {"5","2","C","D","+"};
//        System.out.println(BaseballGame_Stack.calPoints(ops));
//
//        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
//        System.out.println("subdomain: "+SubdomainVisitCount.subdomainVisits(cpdomains).toString());

        System.out.println(SortCharactersByFrequence.frequencySort("tree"));
        System.out.println(SortCharactersByFrequence.frequencySort("cccaaa"));
        System.out.println(SortCharactersByFrequence.frequencySort("Aabb"));


        String[] strs = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "practice";
        System.out.println(ShortestDistance.shortestDistance(strs, word1, word2));

        int[] x = {0,2,3,4,6,8,9};

        System.out.println(SummaryRanges.summaryRanges(x));

        int [] y ={37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(RankTransformOfArray.arrayRankTransform(y)));

    }
}