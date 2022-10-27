package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumber = "";
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                    String tempNumber = Integer.toString(i);
                    evenNumber += tempNumber;
            }
        }
        return evenNumber;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumber = "";
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 1) {
                String tempNumber = Integer.toString(i);
                oddNumber += tempNumber;
            }
        }
        return oddNumber;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumber = "";
        for (int i = start; i <= stop; i+=step) {
            int squared = (i * i);
            String tempNumber = Integer.toString(squared);
            squareNumber += tempNumber;
        }
        return squareNumber;
    }

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i <= stop; i++) {
            String temp = String.valueOf(i);
            result += temp;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i <= stop; i++) {
            String temp = Integer.toString(i);
            result += temp;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i <= stop; i+=step) {
            String temp = Integer.toString(i);
            result += temp;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for(int i = start; i <= stop; i+=step) {
            int pow = exponent;
            int temp = (int) Math.pow(i, pow);
            result += temp;
        }
        return result;
    }
}
