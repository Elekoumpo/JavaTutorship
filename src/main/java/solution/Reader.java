package solution;
import java.io.*;
import java.util.Scanner;

public class Reader {
    public void reader() {
        int i = 0;
        int j = 0;
        FileWriter outs = null;
        BufferedReader reader;

        Scanner myObj = new Scanner(System.in); //koristim da bi od usera primio input, kreiram kao neki skener
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\text.txt"));

            File outputfile = new File("C:\\Users\\ejubm\\Desktop\\Java_Week1_Ejub\\src\\main\\java\\solution\\solution.txt");
            FileOutputStream outputstream = new FileOutputStream(outputfile);
            String line = reader.readLine();
            String word = myObj.nextLine();
            System.out.println("Word is: " + word);
            checkWord(word);
            while (line != null) {
                Solution rjesenje = new Solution();
                //read next line
                i = rjesenje.solution(line, word);
                j++;
                outputstream.write(("Number of moves for the word number " + j + " is: " + i + "\n").getBytes());

                line = reader.readLine();
            }
            reader.close();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Uppercase not allowed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (MyException b) {
            System.out.println(b);
        }
    }
    public void checkWord(String word) throws MyException {
        if (word.matches(".*\\d.*")) {
            throw new MyException("Numbers are not allowed");
        }
    }
}