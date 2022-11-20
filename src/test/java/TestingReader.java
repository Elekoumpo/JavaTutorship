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
            reader.reader("C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt",nullPath);
        });

    }
    @Test
    void TestFile2() {
        assertThrows(NullPointerException.class, () -> {
            Reader reader = new Reader();
            String nullPath = null;
            reader.reader(nullPath,"C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\solution.txt");
        });

    }
 // @Test
  // void TestFile3() {

   //        Reader reader = new Reader();

       //    reader.reader("C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt","C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\solution.txt");

  // }
    @Test
    void TestFile4() {
        assertThrows(NullPointerException.class, () -> {
            Reader reader = new Reader();
            String nullPath = null;
            reader.reader(nullPath,nullPath);
        });

    }

 //   @Test
  //  void TestFile5(){
   //     String writingPath = "C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\solution.txt";
   //     String readingPath = "C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt";
   //     Reader test_reader = new Reader();
   //     Scanner myObj = new Scanner(System.in);
   //     String word = myObj.nextLine();
  //      test_reader.reader(readingPath,writingPath);

 //   }
}
