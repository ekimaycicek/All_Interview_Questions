package interviewQuestions05;

import java.util.Scanner;

/*
(ENG)  Type java code by using while loop,
       Write a program to count the factors of an integer which is entered by user.

(TR) Java kodunu while döngüsünü kullanarak yazın,
     Kullanıcı tarafından girilen bir tam sayının çarpanlarını bulan programı yazınız.

       Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
       Factors of 8  = 1, 2, 4, 8 ==> 4
 */
public class Q03_CountFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println("Girdiğiniz sayının " + count + " tane çarpanı vardır.");
    }
    }
