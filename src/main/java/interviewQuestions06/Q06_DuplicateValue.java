package interviewQuestions06;
 /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

import java.util.HashSet;
import java.util.Set;

public class Q06_DuplicateValue {
    public static Set<Character> findDuplicateChars(String str) {
        Set<Character> seenChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seenChars.contains(ch)) {
                duplicateChars.add(ch);
            }else {
                seenChars.add(ch);
            }
            }
        return duplicateChars;
    }
    }
