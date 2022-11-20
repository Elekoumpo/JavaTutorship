package solution;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Start of main");
        System.out.println("Enter the word: ");
        Reader cita= new Reader();
        log.info("Calling reader");
        String readingPath = "C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt";
        String writingPath = "C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\solution.txt";
        cita.reader(readingPath,writingPath);
        log.info("Program complete");
    }
}