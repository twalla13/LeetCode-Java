public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        StringBuilder temp = new StringBuilder();

        if(s.isEmpty()){ //empty subsequence is true
            return true;
        } else if (s.length() > t.length()){
            return false; //if subsequence is larger than string return false
        } else {
            for(int i = 0; i < t.length(); i++){
//            System.out.println("s: " + s.charAt(j));
//            System.out.println("t: " + t.charAt(i));
                if(s.charAt(j) == t.charAt(i)){
//                    temp.append(s.charAt(j));
                    //Check if we are at the end of our subsequence and if so return true
                    // if didnt make it to the end of subsequence then not all letters in s matched in t

                    if(j == (s.length()-1)){
                        return true;
                    }
                    j++;
                }
            }
//        System.out.println("temp: " + temp);
//        System.out.println("s: " + s);

//            return temp.toString().equals(s);
        }
        return false;
    }
}
