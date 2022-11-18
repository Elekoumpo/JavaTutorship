import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.MyException;
import solution.Reader;
import solution.Solution;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TestingExceptions {
    @Test
    void TestException() {
        assertThrows(MyException.class, () -> {
            Reader reader = new Reader();
            String word = "ball55";
            reader.checkWord(word);
        });
    }

    @Test
    void TestException2() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Solution solution = new Solution();
            String word = "BALL";
            String input = "ballbalbalbalba";
            solution.solution(word, input);

        });
    }

    @Test
    void TestException3() {
            Solution solution = new Solution();
            String word = "ball";
            String input = "ballbalbalbalba";
            int result = solution.solution(input, word);
            assertEquals(2,result);


    }
}
