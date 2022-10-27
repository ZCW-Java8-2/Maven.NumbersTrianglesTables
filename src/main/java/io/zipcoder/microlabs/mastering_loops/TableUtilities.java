package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(String.format("%3d", (i*j)));
                System.out.print(" |");
            }
            System.out.println();
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(String.format("%3d",(i*j)));
                System.out.print(" |");
            }
            System.out.println();
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        int size = tableSize;
            for(int i = 1; i <= size; i++) {
                System.out.print("\" ");
                for (int j = 1; j <= size; j++) {
                    System.out.print(String.format("%3d",(j*i)));
                    System.out.print(" |");
                }
                System.out.println();
            }
        return null;
    }
}
