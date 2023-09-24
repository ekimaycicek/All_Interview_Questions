package interviewQuestions02;

import java.util.Scanner;

/*
       Question-1:(ENG)Write the code that checks whether the integer number entered is an Amostrong number.
       Armstrong number: The sum of the cubes of any 3-digit number,
       If it gives that number, the number is said to be an Armstrong number.

       (TR) Girilen tam sayının Armstrong sayısı olup olmadığını kontrol eden kodu yazınız.
       Armstrong sayi: Herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami,
       o sayiyi veriyorsa sayiya Armstrong sayidir denir.

            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

 */
public class Q01_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 3 digit number");
        int number =Math.abs(scan.nextInt());

        int number1 = number / 100;
        int number2 = (number / 10) % 10;
        int sayi3 = number % 10;

        double result = Math.pow(number1,3)+ Math.pow(number2,3) + Math.pow(sayi3,3);

        if (number<100 && number2>999){
            System.out.println("Lutfen 3 basamakli sayi giriniz");
        } else if (number==result) {
            System.out.println("Armstrong sayidir");

        }else {
            System.out.println("Armstrong sayi degildir");
        }
    }
}
