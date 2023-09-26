package interviewQuestions02;

import java.util.Scanner;

/*
(ENG)Create a function that takes an array and the difference between the largest and the smallest numbers.
     Ask user to enter array elements.
(TR)Kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının  farkını bulan bir method create ediniz.
 */
public class Q04_DifferenceBetweenArray_LargestAndSmallestElements {

        public static int arrayDizi(int[] array) {
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return max - min;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter array size");
            int dizi = scanner.nextInt();


            int[] array = new int[dizi];
            for (int i = 0; i < dizi; i++) {
                System.out.println("of the series" + (i + 1) + ". elemanını giriniz: ");
                array[i] = scanner.nextInt();
            }


            int method = arrayDizi(array);
            System.out.println("Difference of: " + method);
        }
    }


