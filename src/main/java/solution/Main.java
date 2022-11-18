package solution;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Start of main");
        Reader cita= new Reader();
        System.out.println("Input word that you want to search for:");
        log.info("Calling reader");
        cita.reader();
        System.out.println("Program complete");
        log.info("Program complete");
    }
}