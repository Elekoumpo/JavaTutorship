package solution;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Scanner;

@Slf4j
public class Reader {
    public void reader(String fileToRead, String fileToWrite) {
        int i = 0;
        int j = 0;
        FileWriter outs = null;
        BufferedReader reader;

        Scanner myObj = new Scanner(System.in); //koristim da bi od usera primio input, kreiram kao neki skener
        log.info("Scanner created");
        try {
            reader = new BufferedReader(new FileReader(
                    fileToRead));

            File outfile = new File(fileToWrite);
            FileOutputStream outstretch = new FileOutputStream(outfile);
            String line = reader.readLine();
            String word = myObj.nextLine();
            log.info("Word is: " + word);
            checkWord(word);
            while (line != null) {
                Solution rjesenje = new Solution();
                //read next line
                i = rjesenje.solution(line, word);
                log.info("Solution for the word ", j, " is: ", i);
                j++;
                outstretch.write(("Number of moves for the word number " + j + " is: " + i + "\n").getBytes()); //upisivanje broja poteza u fajl

                line = reader.readLine();
            }
            reader.close();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            log.error("Uppercase not allowed");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException b) {
            log.error(b.message);
        }
    }

    public void checkWord(String word) throws MyException {
        if (word.matches(".*\\d.*")) {
            throw new MyException("Numbers are not allowed");
        }
    }
}