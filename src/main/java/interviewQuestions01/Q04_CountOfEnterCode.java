package interviewQuestions01;

import java.util.Scanner;

/*
    (ENG)   Write a code that checks your "PIN" code as a String. Block more than 3 wrong entries.
    (TR)    String olan "PIN" kodunuzu kontrol eden bir kod yazınız. 3'den fazla yanlis girislerde bloke koyunuz.
    **Scanner oluştur.
    **sout mesajını ver
    **variable olustur
    **if blogunda

 */
public class Q04_CountOfEnterCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen PIN kodunuzu giriniz:");
        String pin = scanner.nextLine();
        int girisSayisi = 0;
        while (true) {
            if (girisSayisi > 3) {
                System.out.println("3'ten fazla yanlış giriş yaptınız. Hesabınız bloke edildi.");
                break;
            }
            if (pin.equals("1234")) {
                System.out.println("PIN kodu doğru.");
                break;
            } else {
                System.out.println("PIN kodu yanlış. Tekrar deneyiniz:");
                girisSayisi++;
            }
            pin = scanner.nextLine();
        }


        }
}
