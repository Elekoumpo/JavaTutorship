package solution;

class Solution {
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
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] != 0) {
                if (CharCount[i] / wordCount[i] > 0) {
                    count = CharCount[i] / wordCount[i];
                } else {
                    return 0;
                }
            }
        }
        return count;
    }
}
