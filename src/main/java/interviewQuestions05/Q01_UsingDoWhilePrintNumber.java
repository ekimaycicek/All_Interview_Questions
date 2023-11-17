package interviewQuestions05;
/*
(ENG)   Create one int
        do while int is less then 100
        print the number
        increment by 5

(TR)    bir int oluştur
        int 100'den küçükken yap
        numarayı yazdır
        5 artırma

        For example: 0   5   10  15  20
 */
public class Q01_UsingDoWhilePrintNumber {
    public static void main(String[] args){
        int i = 0;
        do {
            System.out.println(i);
            i += 5;
        }} while (i < 100);
    }
}
