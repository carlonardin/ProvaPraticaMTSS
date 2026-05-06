////////////////////////////////////////////////////////////////////
// Carlo Nardin 2148000
// Cristian Gramegna 2148633
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] VALUES = {1};
    private static final String[] SYMBOLS = {"I"};

    public static String convert(int number) {
        StringBuilder roman = new StringBuilder();
        int tmpNumber = number;

        for (int i = 0; i < VALUES.length && tmpNumber > 0; i++) {
            while (tmpNumber >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                tmpNumber -= VALUES[i];
            }
        }
        return roman.toString();
    }
}