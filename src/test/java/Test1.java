import solution.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void isWordInputtedContainingNumbers() {
        // given
        String word = "wordwordwordwordw";
        String line = "word";

        Solution solution = new Solution();

        // when
        int underTest = solution.solution(word, line);

        // then
        Assertions.assertEquals(4, underTest);
    }
}
