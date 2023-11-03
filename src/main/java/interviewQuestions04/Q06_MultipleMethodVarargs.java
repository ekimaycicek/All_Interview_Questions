package interviewQuestions04;
/*
(ENG)   Problem definition :
        The average of the written grades of 6, 4, 3 and 5, respectively, of 4 different students.
        Write a parameterized method that prints.

(TR)Problem Tanımı :
	Farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını yazdıran parametreli method yazınız.

*/
public class Q06_MultipleMethodVarargs {
    public static void main(String[] args) {
        int[] grades = {6, 4, 3, 5};
        double average = calculateAverage(grades);
        System.out.println("The average grade is " + average + ".");
    }
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
        }
    }
    }
