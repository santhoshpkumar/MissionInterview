package org.santhoshkumar.Misc;

/**
 * Created by santhoshkumar on 18/10/15.
 */
public class CatalanNumber {

    public static void print(){
        int n = 7;
        System.out.println("\nCatalan Number");
        int[] a = new int[n+1];
        a[0]= a[1] = 1;

        for(int i = 2; i <= n ; i++){
            for( int j = 0; j < i; j++){
                a[i] += a[j]*a[i-j-1];
            }
        }

        for(int v:a){
            System.out.print(v+" ");
        }
        System.out.println();
    }
}
