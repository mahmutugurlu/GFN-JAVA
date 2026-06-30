package Aufgaben;

public class Aufgabe5 {

    public static void main(String[] args) {




        int[][] zahlenMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        System.out.println("Vorher:");
        for (int i = 0; i < zahlenMatrix.length; i++) {
            for (int j = 0; j < zahlenMatrix[i].length; j++) {
                System.out.print(zahlenMatrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Nachher:");
        for (int i = 0; i < zahlenMatrix.length; i++) {
            for (int j = 0; j < zahlenMatrix[i].length; j++) {
                System.out.print(zahlenMatrix[j][i] + " ");
            }
            System.out.println();
        }




    }
}
