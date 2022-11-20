import static junit.framework.Assert.assertEquals;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import solution.Solution;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@Slf4j
public class TestingSolution {
    Solution mySolution = new Solution();
    @Before
    public void setup() {
        mySolution = mock(Solution.class);
        when(mySolution.solution("a", "a")).thenReturn(1);
        mySolution = new Solution();
    }

    @BeforeClass
    public static void BeforeClass() {
        log.info("Starting the App Test, App Test class is initalizing");
    }

    @Test
    public void testSolution() {
        assertEquals(1, mySolution.solution("a", "a"));
    }

    @Test
    public void testSolution2() {
        assertEquals(0, mySolution.solution("a", "b"));
        assertEquals(0, mySolution.solution("a", "ab"));
        assertEquals(2, mySolution.solution("catastrophic", "cat"));
        assertEquals(1, mySolution.solution("cbaltbla", "cat"));
        assertEquals(0, mySolution.solution("rgrrgrgrrr", "cat"));
        assertEquals(0, mySolution.solution("golevagolvegolv", "cat"));
    }

}


