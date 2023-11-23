package interviewQuestions06;
/*
(ENG) Create a code that prints characters with an odd number index.
(TR)  Indexi tek sayi olan karakterleri yazdiran bir code create ediniz.

 */
public class Q03_OddIndexNumber {
    public static void main (String[] args) {
        String str = "Hello, world!";
        for(int i = 1;i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}
