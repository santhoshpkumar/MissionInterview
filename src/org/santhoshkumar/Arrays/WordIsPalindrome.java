package org.santhoshkumar.Arrays;

/**
 * Created by santhoshkumar on 13/10/15.
 */
public class WordIsPalindrome {
    public boolean check(String input){
        if(input.length() == 0 || input.length() == 1){
            return true;
        }
        if(input.charAt(0)==input.charAt(input.length()-1)){
            return check(input.substring(1,input.length()-1));
        }
        return false;
    }
}
