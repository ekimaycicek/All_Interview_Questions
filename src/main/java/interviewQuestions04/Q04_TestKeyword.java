package interviewQuestions04;
/*
(ENG)   Write the Java code that evaluates the test results of the students using the method.

(TR)    Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz.

    Students' answers
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    Answer key
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    Output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
    Student 1 has 7 correct answers.
    Student 2 has 6 correct answers.
       "           "
       "           "
       "           "
    Student 8 has 7 correct answers.
 */
public class Q04_TestKeyword {
    public static void evaluate(char[][] answers, char[] keys) {
        for (int student = 0; student < answers.length; student++) {
            int correctAnswers = 0;
            for (int question = 0; question < answers[student].length; question++) {
                if (answers[student][question] == keys[question]) {
                    correctAnswers++;
                }
            }
        }

    }
