package interviewQuestions04;

import java.util.ArrayList;
import java.util.Random;

/*
(ENG)
Create an int array list with 10 elements,
      Create a void method named add random and its parameter is int array list.
      This method assign values from 0 to 20 in array list.
      If he throws an even number, let him write 111 instead of that element,
      If there is no even number, it will give the message that there is no even number.

(TR) 10 elemanlı int array list oluşturun,
     Random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
     Bu metod array list içinde 0' dan 20 ye kadar değer atasın.
     Eğer çift sayı atarsa o elemanının yerine 111 yazsın,
     Eğer çift sayı yoksa çift sayı yoktur mesajını versin.
 */
public class Q02_CreateRandomList_SetList {
    static void addRandom(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(21);
            if (number % 2 == 0) {
                list.set(i, 111);
            } else {
                list.add(i, number);
            }
        }


        if (!list.contains(111)) {
            System.out.println("There is no even number in the list.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addRandom(list);

        System.out.println("The list is: ");

        for (Integer element : list) {
            System.out.println(element);
        }
    }
}