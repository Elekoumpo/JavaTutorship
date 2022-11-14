import java.util.Scanner;

class Solution {
    public int solution(String S){
        int b=0, a=0, l=0, o=0, n=0;
        int l1=0, o1=0;
        char letter;

        for (int i=0;i<S.length();i++){
            letter=S.charAt(i);
            if (letter=='b') b++;
            if (letter=='a') a++;
            if (letter=='l') l++;
            if (letter=='o') o++;
            if (letter=='n') n++;
        }
         l1 = l / 2;
         o1 = o / 2;
         return Math.min(b, Math.min(a, Math.min(l1, Math.min(o1 , n))));
    };
}

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the word");

        String word = myObj.nextLine();
        System.out.println("Word is: " + word);


        Solution rjesenje=new Solution();
        int i=rjesenje.solution(word);
        System.out.println("Number of moves for this word is: " + i);
    }
}