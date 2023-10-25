package interviewQuestions03;

import java.util.ArrayList;

/*
(ENG)
Part1: Create an arraylist of Strings
       add - "Red", "Green", "Blue", "Yellow" and "Black" inside
       print out all the elements, each element on new line.
Part2: Create a method that accepts a String arraylist and a String as parameters
       method should add the element at the first index of arraylist.
Part3: Create a method that accepts a String arraylist and a String as parameters
       it should add element before last element.

(TR)
Bölüm1: Dizelerden oluşan bir dizi listesi oluşturun
        içine - "Kırmızı", "Yeşil", "Mavi", "Sarı" ve "Siyah" ekleyin
        tüm öğeleri yazdır, her öğe yeni satırda
Part2:  Bir String dizi listesini ve bir String'i parametre olarak kabul eden bir yöntem oluşturun
        yöntem, öğeyi arraylist'in ilk dizinine eklemelidir
Part3:  Bir String dizi listesini ve bir String'i parametre olarak kabul eden bir yöntem oluşturun
        son elemandan önce eleman eklemelidir.
       Ex:  [1, 2, 3]  -> [1, 2, 4, 3]
 */
public class Q04_ArrayListTask {
    public static void main(String[] args) {

        ArrayList<String> renkler = new ArrayList<String>();
        renkler.add("Kırmızı");
        renkler.add("Yeşil");
        renkler.add("Mavi");
        renkler.add("Sarı");
        renkler.add("Siyah");

        for (String renk : renkler) {
            System.out.println(renk);
        }


        String[] dizi = {"Kırmızı", "Yeşil", "Mavi", "Sarı", "Siyah"};
        ekleIlkElemana(renkler, "Turuncu");
        System.out.println("Part 2 Sonucu: " + renkler);

        // Pa
        ekleSonElemanOncesine(renkler, "Pembe", "Yeşil");
        System.out.println("Part 3 Sonucu: " + renkler);
    }

    // Part 2 - İlk elemana eklemek
    public static void ekleIlkElemana(ArrayList<String> liste, String eleman) {
        liste.add(0, eleman);
    }

    // Part 3 - Son elemandan önce eleman eklemek
    public static void ekleSonElemanOncesine(ArrayList<String> liste, String eleman, String oncekiEleman) {
        int indeks = liste.indexOf(oncekiEleman);
        if (indeks != -1) {
            liste.add(indeks, eleman);
        }
    }
}
