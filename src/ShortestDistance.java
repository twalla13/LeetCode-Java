public class ShortestDistance {

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {

        int index1 = -1, index2 = -1;
        int minDistance = wordsDict.length;
        for(int i =0 ; i < wordsDict.length; i++){

            if(wordsDict[i].equals(word1)){
                index1 = i;
            } else if(wordsDict[i].equals(word2)){
                index2 = i;
            }

            if(index1 != -1 && index2 != -1){
//                if(Math.abs(index1 - index2) > distance && i == wordsDict.length-1){
//                   return distance;
//                }
//                distance = Math.abs(index1 - index2)-1;
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }
        return minDistance;
    }
}
