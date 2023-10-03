package interviewQuestions01;

import java.util.Scanner;

/*
        (ENG) Get a sentence and a letter from the user,
              * How many times the letter in the sentence find used and print.

        (TR)  Kullanicidan bir cumle ve bir harf alin,
              * Cumlede harfin kac kere kullanildigini bulup, yazdirin.

               EXAMPLE:
               INPUT : Sentence: It's great to learn Java. letter :e
               OUTPUT : The letter "e" is used 3 times in the sentence you entered.
 */
public class Q05_ForFlashBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        int count = countLetters(sentence, letter);

        System.out.println("In the sentence you" + letter + "' harfi " + count + " kez kullanılmıştır.");
    }

    private static int countLetters(String sentence, char letter) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
