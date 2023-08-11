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

 Question-2: (ENG)  Write a program that shows whether each integer is an armstrong number from 1 to the entered number.
             (TR)   Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
                    gösteren program yazınız.
 */
public class Q01_ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi =Math.abs(scan.nextInt());

        int sayi1 = sayi / 100;
        int sayi2 = (sayi / 10) % 10;
        int sayi3 = sayi % 10;

        double result = Math.pow(sayi1,3)+ Math.pow(sayi2,3) + Math.pow(sayi3,3);

        if (sayi<100 && sayi2>999){
            System.out.println("Lutfen 3 basamakli sayi giriniz");
        } else if (sayi==result) {
            System.out.println("Armstrong sayidir");

        }else {
            System.out.println("Armstrong sayi degildir");
        }
    }
}
