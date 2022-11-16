package solution;

public class Solution {
    public int solution(String inputtext, String inputword) {

        int count = 0;
        int[] CharCount = new int[26];
        int[] wordCount = new int[26];
        for (int i = 0; i < inputtext.length(); i++) {
            CharCount[inputtext.charAt(i) - 'a']++;
        }
        for (int i = 0; i < inputword.length(); i++) {
            wordCount[inputword.charAt(i) - 'a']++;
        }
        boolean isTrue=true;
        while(isTrue){
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] != 0) {
                if (CharCount[i] - wordCount[i] >= 0) {
                    CharCount[i] = CharCount[i] - wordCount[i];
                } else {
                    isTrue=false;
                    break;
                }
            }
            if(i==25) count++;
        }

        }
        return count;
    }
}
