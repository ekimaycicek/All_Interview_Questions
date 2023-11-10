package interviewQuestions05;
/*
(ENG) Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise tell user "Lost!"

(TR) Kullanıcıdan bir tamsayı girmesini isteyin.
     Tamsayı 100'den küçükse, kullanıcıya "Kazandı!" deyin.
     Aksi takdirde kullanıcıya "Kayıp!" deyin.
 */
public class Q05_UsingDoWhileWithCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        if (number < 100) {
            System.out.println("Won!");
        }else
}
