package interviewQuestions01;

import java.util.Scanner;

/*
    (ENG) Write a method that returns the first and last letter of a String received from the user
          as much as the number received from the user.
    (TR)  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden method yaziniz.
     *
     * Examp:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
 */
import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a text:");
        String mtn = scan.nextLine();

        System.out.println("Bir sayı giriniz:");
        int sayi = scan.nextInt();

        String sonuc = ilkSonHarf(mtn, sayi);
        System.out.println("Sonuç: " + sonuc);
    }

    private static String ilkSonHarf(String mtn, int sayi) {
        String str = mtn.substring(0, 1) + mtn.substring(mtn.length() - 1);
        String sonuc = "";

        for (int i = 1; i <= sayi; i++) {
            sonuc += str;
        }

        return sonuc;
    }
}




