package Aufgaben;

import java.util.Arrays;

public class Aufgabe5 {

    public static void main(String[] args) {

        int [] a ={1,2,3};
        int [] b ={4,5};
        //int[] kombiniert ={};
        System.out.println(Arrays.toString(kombiniereArrays(a, b)));

    }

    static  int[] kombiniereArrays(int[] a, int[] b)  {
        int[] kombiniert = new int[a.length+b.length];
        int c = 0;
        for (int i = 0; i < a.length ; i++) {

             kombiniert[c] = a[i];
             c++;

        }

        for (int i = 0; i < b.length ; i++) {

            kombiniert[c] = b[i];
            c++;

        }




        return  kombiniert;
    }

}
