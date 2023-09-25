package interviewQuestions02;

import java.util.Scanner;

/*
    (ENG)   Construct a FIBONACCI sequence up to an integer received from the user.
            The Fibonacci number is a sequence of numbers that begin with 0 and 1,
            in which each number is obtained by the sum of the two preceding numbers.
            The Fibonacci sequence is an infinite sequence and each number is called the Fibonacci number.

    (TR)    Kullanıcıdan alınan bir tam sayıya kadar FIBONACCI dizisi oluşturun.
            Fibonacci sayısı, 0 ve 1 ile başlayan ve her bir sayının kendisinden önce gelen iki sayının
            toplamıyla elde edildiği bir sayı dizisidir.
            Fibonacci dizisi sonsuz bir dizidir ve her bir sayıya Fibonacci sayısı denir.

            Expected Output for 34:
            0-1-1-2-3-5-8-13-21-34....
 */
public class Q02_FibonacciListNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please");
        int num = Math.abs(scan.nextInt());

        int fib=0;
        int fibo=1;
        System.out.print("fibonacci: "+fib+ " - "+fibo);

        while (fibo <= num) {

            int sum = fib+fibo;

            if (sum<=num) {
                System.out.print(" - " + sum);
            }

            //Kac sefer donusturmek istiyorsak fori dongusu
            //Donguyu sinirlamak icin while dongusu
            fib =fibo;
            fibo =sum;

        }


    }



        }




