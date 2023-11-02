package interviewQuestions04;
/*
(EN)Problem Definition:
    Create a method called getSum.
    Its parameter is ArrayList.
    Remove all $s in array and sum all numbers
    The data type we return must be 'int'.
    if the result is less than 0, print -1.

(TR)Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   Return yaptğımız veri tipi 'int' olmalıdır.
   Sonuç 0'dan küçükse, -1 yazdırın.

   Ex-1:
   ArrayList = $13, $15, $20
   Answer    = Must be 48

   Ex-2 :
   ArrayList = $-13, $0, $0
   Answer    = Must be -1
 */
public class Q05_SpecialCharRemoveArray {

    public static int getSum(ArrayList<Integer> list) {
        list.removeIf(element -> element == '$');
        int sum = 0;
        for (int element : list) {
            sum += element;
    }
        return sum >= 0 ? sum : -1;
    }
    public static void main(String[] args) {



























}
