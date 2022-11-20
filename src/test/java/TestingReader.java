import org.junit.jupiter.api.Test;
import solution.Reader;
import solution.Solution;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestingReader {
    @Test
    void TestFile() {
        assertThrows(NullPointerException.class, () -> {
            Reader reader = new Reader();
            String nullPath = null;
            reader.reader("src/main/java/solution/text.txt", nullPath);
        });

    }

    @Test
    void TestFile2() {
        assertThrows(NullPointerException.class, () -> {
            Reader reader = new Reader();
            String nullPath = null;
            reader.reader(nullPath, "src/main/java/solution/solution.txt");
        });

    }

    @Test
    void TestFile4() {
        assertThrows(NullPointerException.class, () -> {
            Reader reader = new Reader();
            String nullPath = null;
            reader.reader(nullPath, nullPath);
        });

    }

}
