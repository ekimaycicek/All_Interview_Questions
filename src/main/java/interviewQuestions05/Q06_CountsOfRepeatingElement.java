package interviewQuestions05;
/*
(ENG) How many times a given number is repeated in a sequence
      Create the Java program that finds it.

(TR)  Belirli bir sayının bir dizide kaç kez tekrarlandığıni bulan Java programını oluşturun.
*/
public class Q06_CountsOfRepeatingElement {

    public static int countRepetitions(int[] sequence, int number) {
        int count = 0;
        for (int element : sequence) {
            if (element == number) {
                count++;
            }
            }
        return count;
