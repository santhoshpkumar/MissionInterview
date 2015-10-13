package org.santhoshkumar.Backtracking;

/**
 * Created by santhoshkumar on 13/10/15.
 */
public class PrintAllPermutations {
    char[] input;
    public void print(String data){
        input = data.toCharArray();
        permutation(0, input.length);
    }

    private void permutation(int index, int size){
        if(index == size) {
            for(char ch: input){
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int i = index; i < size; i++){
            swap(index, i);
            permutation(index+1, size);
            swap(index, i);
        }
    }

    private void swap(int i, int j){
        char temp = input[i];
        input[i]=input[j];
        input[j] = temp;
    }
}
