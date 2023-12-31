package interviewQuestions04;

import java.util.HashMap;
import java.util.Map;

/*
(EN) Write a method(method name hackerlanguage) that translates the text written by the user into
     the spoken language of 'hackers'.
     Hackers can write by converting some letters to numbers. The letters they usually translate are as follows:

(TR) Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
     Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
        Test data
        hackerDili("java ile hersey guzel")
        j4v4 1l3 h3r53y guz3l
        İpucu harfleri değiştirin ve ekrana yazdırın.

 */
public class Q03_HackerLanguage {
    public static String hackerlanguage(String text) {
        Map<Character, Integer> translations = new HashMap<>();
        translations.put('a', 4);
        translations.put('e', 3);
        translations.put('i', 1);
        translations.put('o', 0);
        StringBuilder hackerText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (translations.containsKey(c)) {
                hackerText.append(translations.get(c));
            } else {
                hackerText.append(c);
            }
        }
        return hackerText.toString();
    }
    public static void main(String[] args) {
        String text = "Java ile çöz";
        String hackerText = hackerlanguage(text);
        System.out.println("The translated text is: " + hackerText);


    }
}
