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
                    System.out.println(sayi + " is asal sayıdır.");
                } else {
                    System.out.println(sayi + " bir asal sayı değildir.");
                }

                scanner.close();
            }

            public static boolean isAsal(int sayi) {
                if (sayi <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }











