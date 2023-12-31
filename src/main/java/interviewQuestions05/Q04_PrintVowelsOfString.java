package interviewQuestions05;

import java.util.Scanner;

/*
(ENG) Get String from user and print just vowels(aeiou) inside String on the console.

(TR)  Kullanıcıdan String'i alın ve konsoldaki String'in içine sadece sesli harfleri (aeiou) yazdırın
 */
public class Q04_PrintVowelsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String string = scanner.nextLine();
        char[] characters = string.toCharArray();
        for (char character : characters) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.print(character);
            }
        }

    }
}
