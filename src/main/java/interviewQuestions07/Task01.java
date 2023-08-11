package interviewQuestions07;

import java.util.Scanner;

public class Task01 {
    /*
    Question-2: (ENG)  Write a program that shows whether each integer is an armstrong number from 1 to the entered number.
            (TR)   Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
    gösteren program yazınız.
 */

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = Math.abs(scan.nextInt());
        int sum =0;
        int temp=sayi;

        while (temp>0){
            int digit = temp%10;
            sum += digit*digit*digit;
            temp/=10;
        }
        if (sum==sayi){
            System.out.println("Armstrong sayidir");
        }else {
            System.out.println("Armstrong sayisi degildir");
        }

         */


                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir sayı girin: ");
                int maxNumber = scanner.nextInt();

                for (int num = 1; num <= maxNumber; num++) {
                    int numDigits = (int) Math.log10(num) + 1;
                    int sum = 0;

                    int divisor = 1;
                    for (int i = 0; i < numDigits; i++) {
                        int digit = (num / divisor) % 10;
                        sum += Math.pow(digit, numDigits);
                        divisor *= 10;
                    }

                    if (sum == num) {
                        System.out.println(num + " bir Armstrong sayısıdır.");
                    }
                }
            }
        }


