package org.santhoshkumar.Sorting;

/**
 * Created by santhoshkumar on 23/10/15.
 */
public class CountingSort {
    public int[] input;

    public void sort(){
        //create a temp count array
        int[] count = new int[input.length];
        for (int i = 0; i <input.length; i++ ){
            count[i]= 0;
        }

        for (int i = 0 ; i <input.length; i++){
            count[input[i]] += 1;
        }

        for (int i = 1 ; i <input.length; i++){
            count[i] = count[i]+count[i-1];
        }

        int[] result = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            result[count[input[i]]-1] = input[i];
            count[input[i]] = count[input[i]]-1;
        }
        print(result);

    }

    public void print(int[] a){
        for (int i = 0; i <a.length; i++){
            System.out.print(a[i]);
        }
    }

}
