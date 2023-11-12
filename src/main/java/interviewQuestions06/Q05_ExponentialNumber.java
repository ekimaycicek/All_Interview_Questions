package interviewQuestions06;
//Get 2 numbers from the user.
//first number base
//second number Top
//Write a code that calculates the prime of a number.
// 2, 3 --> 2^3 = 2*2*2= 8

// 4, 3 --> 4^3= 4*4*4 = 64
public class Q05_ExponentialNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Son sayıyı giriniz: ");
        int top = scanner.nextInt();
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int num = base; num <= top; num++) {

