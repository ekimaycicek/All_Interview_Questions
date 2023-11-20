package interviewQuestions02;
/*
(EN) Write a Java Program to reverse the string.
        Way 1: Using StringBuilder(),
        Way 2: Using the String Class,
        Way 3: Create a method, then call the method from the main method.

(TR) Stringi ters cevirmek icin bir Java Programi yazin.
		1.Yol: StringBuilder () kullanarak,
		2.Yol: String Classini kullanarak,
		3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin.
 */
public class Q05_ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

    }
