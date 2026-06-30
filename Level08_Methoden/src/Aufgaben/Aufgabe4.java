package Aufgaben;

import java.util.Arrays;

public class Aufgabe4 {


    public static void main(String[] args) {


        int[] arr1 = {3, 7, 2, 9, 4};
        int[] arr2 = {-5, -2, -8, -1};
        int[] arr3 = {-3, 0, 5, -7, 2};

        System.out.println("Max aus [3, 7, 2, 9, 4]: " + findmax(arr1));
        System.out.println("Max aus [-5, -2, -8, -1]: " + findmax(arr2));
        System.out.println("Max aus [-3, 0, 5, -7, 2]: " + findmax(arr3));


}


    //Aufgabe 4: Groesstes Element finden

    static int findmax(int[] arr1) {

        Arrays.sort(arr1);

        return arr1[arr1.length - 1];
    }



    static  double findmax(double[] arr4) {
        double max = arr4[0];

        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }

        return max;
    }



}
