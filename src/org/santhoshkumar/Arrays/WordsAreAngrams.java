package org.santhoshkumar.Arrays;

import java.util.Arrays;

/**
 * Created by santhoshkumar on 13/10/15.
 */
public class WordsAreAngrams {
    //Sort the String and check for equality
    public boolean check(String one, String two){
        if(one.length() != two.length()){
            return false;
        }

        char[] first = one.toCharArray();
        Arrays.sort(first);
        char[] second = two.toCharArray();
        Arrays.sort(second);
        one = String.valueOf(first);
        two = String.valueOf(second);

        if(one.equals(two)){
            return true;
        }
        return false;
    }
}
