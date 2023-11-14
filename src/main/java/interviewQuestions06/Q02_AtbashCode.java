package interviewQuestions06;
/*
(ENG)AtbashCode: A simple method based on the Hebrew alphabet to encrypt or decrypt a text.
                 The first letter of the alphabet is used instead of the last letter.
                 Encrypt the sentence received from the user.
                 "abcdefghijklmnopqrstuvwxyz"; 26 letters
                "zyxwvutsrqponmlkjihgfedcba";
(TR)AtbashCode:   Bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
                  Alfabenin ilk harfi son harfi yerine kullanilmaktadir.
                  Kullanicidan alinan cumleyi sifreleyiniz.
                  "abcdefghijklmnopqrstuvwxyz"; 26 harf
                  "zyxwvutsrqponmlkjihgfedcba";

 */
public class Q02_AtbashCode {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String REVERSED_ALPHABET = new StringBuilder(ALPHABET).reverse().toString();
    public static String encrypt(String sentence) {
        String encryptedSentence = "";
        for (char letter : sentence.toLowerCase().toCharArray()) {
            int index = ALPHABET.indexOf(letter);
            if (index != -1) {
                encryptedSentence += REVERSED_ALPHABET.charAt(index);
            } else {
}
