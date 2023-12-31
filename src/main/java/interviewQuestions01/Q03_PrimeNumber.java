package interviewQuestions01;

import java.util.Scanner;

/*
    (ENG)   Ask user enter a positive number and check if it is prime or not.
    (TR)    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin.
 */
public class Q03_PrimeNumber {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Positive enter a number: ");
                int sayi = scanner.nextInt();

                if (sayi <= 0) {
                    System.out.println("Please positive enter a number.");
                } else if (isAsal(sayi)) {
                    System.out.println(sayi + " is a prime number.");
                } else {
                    System.out.println(sayi + " is not a prime number.");
                }

                scanner.close();
            }

            public static boolean isAsal(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }











