import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import solution.Solution;

public class TestingAlgorithm {
    @Test
    public void testSolution() {
        Solution mysolution = new Solution();
        assertEquals(1, mysolution.solution("a", "a"));
        assertEquals(0, mysolution.solution("a", "b"));
        assertEquals(0, mysolution.solution("a", "ab"));
        assertEquals(2, mysolution.solution("catastrophic", "cat"));
        assertEquals(1, mysolution.solution("cbaltbla", "cat"));
        assertEquals(0, mysolution.solution("rgrrgrgrrr", "cat"));
        assertEquals(0, mysolution.solution("golevagolvegolv", "cat"));
}}


