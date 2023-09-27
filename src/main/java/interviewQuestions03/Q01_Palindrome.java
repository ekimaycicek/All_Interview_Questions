package interviewQuestions03;

import java.util.Scanner;



/*
    (ENG)Crteate a program checks if a String is PALINDROME or not.
         If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
         For Example : "madam" or "nursesrun" .

    (TR) Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz.
         Polindrome : Tersten okunuşu da aynı olan ifadelerdir.
         Example : Ey edip Adanada pide ye,  Traş niçin şart
 */
public class Q01_Palindrome {


        public static boolean isPalindrome(String str) {
            StringBuilder reversedString = new StringBuilder(str);
            reversedString.reverse();
            return str.equalsIgnoreCase(reversedString.toString());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter a word: ");
            String str = scanner.nextLine();
            if (isPalindrome(str)) {
                System.out.println("the word is a palindrome");
            } else {
                System.out.println("the ");
            }
        }
    }






