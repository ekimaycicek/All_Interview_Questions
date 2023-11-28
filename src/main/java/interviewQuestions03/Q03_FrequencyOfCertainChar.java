package interviewQuestions03;

import java.util.Scanner;

public class Q03_FrequencyOfCertainChar {
/*
    (EN) Ask the user to enter a name and character, then check how many times the character is repeated.
    (TR) Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Counter = 3
            **COZULDU!!

*/
    public static void main(String[] args) {






        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        int count =0;

        for (int i = 0; i <name.length(); i++) {
            if (name.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The number of repetitions: "+count);


    }
}

