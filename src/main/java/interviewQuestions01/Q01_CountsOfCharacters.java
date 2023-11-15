package interviewQuestions01;

import java.util.Scanner;

/*
    (ENG)Get a String from the user.
    Print the number of each character in the String to the screen.

    (TR)Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.

    Example: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa ==> a = 3, b=1
 */
public class Q01_CountsOfCharacters {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter a word ");

        String input = scan.nextLine();

        String conclusion = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (conclusion.indexOf(ch) == -1) {
                int counter = 0;
                for (int a = i; a < input.length(); a++) {
                    if (ch == input.charAt(a)) {
                        counter++;
                    }
                }
                conclusion += ch + " = " + counter + " ";
            }
        }

        System.out.println(conclusion.substring(0, conclusion.length() - 1));
    }
}




