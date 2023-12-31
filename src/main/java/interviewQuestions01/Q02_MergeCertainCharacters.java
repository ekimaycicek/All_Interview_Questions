package interviewQuestions01;

import java.util.Scanner;

/*
    (ENG) Write a method that returns the first and last letter of a String received from the user
          as much as the number received from the user.
    (TR)  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden method yaziniz.
     *
     * Examp:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
 */
import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a text:");
        String text = scan.nextLine();

        System.out.println("enter a number:");
        int number = scan.nextInt();

        String conclusion = firstLastLetter(text, number);
        System.out.println("Conclusion: " + conclusion);
    }

    private static String firstLastLetter(String text, int number) {
        String str = text.substring(0, 1) + text.substring(text.length() - 1);
        String conclusion = "";

        for (int i = 1; i <= number; i++) {
            conclusion += str;
        }

        return conclusion;
    }
}




