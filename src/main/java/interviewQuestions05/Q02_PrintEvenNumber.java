package interviewQuestions05;
/*
(ENG) Write a method named isEven that accepts an integer argument.
      The method should return true if the argument is even, or false otherwise.

(TR)  Bir tamsayı bağımsız değişkenini kabul eden isEven adında bir yöntem yazın.
      Argüman çift ise yöntem true, aksi takdirde false döndürmelidir.
 */
public class Q02_PrintEvenNumber {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static void main(String[] args) {
        int number = 10;
        boolean isEven = isEven(number);
    }