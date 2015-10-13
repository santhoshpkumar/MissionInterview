package org.santhoshkumar.Arrays;

import java.util.Arrays;

/**
 * Created by santhoshkumar on 13/10/15.
 */
public class WordsAreAngrams {
    //Sort the String and check for equality
    public boolean check(String one, String two){
        char[] first = one.toCharArray();
        Arrays.sort(first);
        char[] second = two.toCharArray();
        Arrays.sort(second);

        if(String.valueOf(first) == String.valueOf(second)){
            return true;
        }
        return false;
    }
}
