package solution;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Solution {
    public int solution(String inputtext, String inputword) {
        log.info("Start of the solution");
        int count = 0;
        int[] CharCount = new int[26];
        int[] wordCount = new int[26];

        for (int i = 0; i < inputtext.length(); i++) {
            if (CharCount[inputtext.charAt(i) - 'a'] > 25 || CharCount[inputtext.charAt(i) - 'a'] < 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                CharCount[inputtext.charAt(i) - 'a']++;
            }

        }
        for (int i = 0; i < inputword.length(); i++) {
            if (wordCount[inputword.charAt(i) - 'a'] > 25 || wordCount[inputword.charAt(i) - 'a'] < 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                wordCount[inputword.charAt(i) - 'a']++;
            }
        }
        boolean isTrue = true;
        while (isTrue) {
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] != 0) {
                    log.info(String.valueOf(CharCount[i]));
                    if (CharCount[i] - wordCount[i] >= 0) {
                        CharCount[i] = CharCount[i] - wordCount[i];
                    } else {
                        isTrue = false;
                        break;
                    }
                }
                if (i == 25) {
                    count++;
                    log.info("Count is now: ", count);
                }
            }

        }
        return count;
    }
}
