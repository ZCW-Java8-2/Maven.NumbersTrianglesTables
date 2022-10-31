package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                result += String.format("%3s |", String.valueOf(i*j));
            }
            result += "\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result += String.format("%3s |", String.valueOf(i*j));
            }
            result += "\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        int size = tableSize;
        String result = "";
            for(int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    result += String.format("%3s |", String.valueOf(i*j));
                }
                result += "\n";
            }
        return result;
    }
}
