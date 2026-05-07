////////////////////////////////////////////////////////////////////
// Carlo Nardin 2148000
// Cristian Gramegna 2148633
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] VALUES = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    private static final String[] SYMBOLS = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

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
