package interviewQuestions06;
/*

(ENG) Write a METHOD that finds and prints the frequency (repetitions) of the letters in a given text.(Interview question)
   Test data:
   Input  = AAABBCDD
   Output = A3B2C1D2
 */
public class Q01_FrequencyOfGivenCharacters {
    public static void main(String[] args) {

        String text = "AAABBCDD";
        int[] frequency = new int[26];






        for (char c : text.toCharArray()) {
            int index = (int) c - 'A';
            frequency[index]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.print((char) (i + 'A') + " " + frequency[i] + " ");
            }
        }

    }
}
