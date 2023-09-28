package interviewQuestions03;

import java.util.Scanner;

public class Q02_WhileCountSum {
/*      (EN)Ask the user for numbers to be collected,
              1- If the number of numbers exceeds 10 or if the total exceeds 500, this number is sufficient,
              2- Print ".. you have entered a number of numbers, the sum is...".
              **RESOLVED!!

        (TR)Kullanicidan toplanmak uzere sayilar isteyin,
              1- Sayi adedi 10'u gecerse veya toplam 500 'u gecerse bu kadar sayi yeter,
              2- ".. adet sayi girdin, toplami..." yazdirin.
              **COZULDU!!
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adet=0;
        int sayi=0;

        for (int i = 1; i<=10 ; i++) {
            System.out.println("please enter number");
            int num = input.nextInt();
            adet++;
            sayi = sayi+num;
            if (adet<=10 || sayi<=500){

            }

        }
        System.out.println(adet+" you entered a number of numbers, the  : "+sayi);




    }

}
