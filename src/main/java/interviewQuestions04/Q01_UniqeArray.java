package interviewQuestions04;
/*
(EN) Delete the repeating numbers in the given array, except the first one,
     Write a program that returns an array of non-repeated numbers.

(TR) Verilen array deki tekrar eden sayilari, ilki haric silip,
     tekrarsiz sayilardan olusan bir array haline getiren bir program yaziniz.

      INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
      OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
 */
public class Q01_UniqeArray {
    public static int[] deleteRepeatingNumbers(int[] array) {
        int[] result = new int[array.length];
        int uniqueElementsIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                result[uniqueElementsIndex++] = array[i];

    }
    }
        return Arrays.copyOf(result, uniqueElementsIndex);
    }