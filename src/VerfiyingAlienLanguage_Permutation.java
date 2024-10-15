public class VerfiyingAlienLanguage_Permutation {
    public static boolean isAlienSorted(String[] words, String order) {
        char letter1;
        char letter2;

        //Want to make sure we are not going out of bounds
        //Because we are comparing i and i+1, want to break the for loop two indices before the end of it
        for(int i = 0; i < (words.length-1); i++){
            System.out.println("Words[" + i +"] length: "+words[i].length());
            System.out.println("Words[" + (i+1) +"] length: "+words[i+1].length());


            for (int j = 0; j < words[i].length(); j++) {
                //if we reach the length of the second word but still in bound of the first word's length,
                //then the second word is shorter than the first and this returns false!!
                System.out.println("j: " + j);
                if(words[i+1].length() == j){
                    return false;
                }


                letter1 = words[i].charAt(j);
                letter2 = words[i + 1].charAt(j);
                System.out.println("Letter 1: " + letter1);
                System.out.println("Letter 2: " + letter2);

                System.out.println("Order of Letter 1: " + order.indexOf(letter1));
                System.out.println("Order or Letter 2: " + order.indexOf(letter2));

                //Think like you are sorting alphabetically
                //When sorting apple and america, we check what letters are the same
                //and then the first two letters that arent the same determines which one comes first no need to continue looking at the rest of the letters
                if(letter1 != letter2){
                    if (order.indexOf(letter1) > order.indexOf(letter2)) {
                        return false;
                    }else{
                        break;
                    }
                }
            }
        }
        return true;
    }
}
