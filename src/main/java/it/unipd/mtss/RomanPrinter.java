////////////////////////////////////////////////////////////////////
// Carlo Nardin 2148000
// Cristian Gramegna 2148633
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    private static final String[] I = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    private static final String[] V = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    };

    private static final String[] X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };

    private static final String[] L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };

    private static final String[] C = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    private static final String[] D = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };

    private static final String[] M = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char currentLetter = romanNumber.charAt(j);
                result.append(getAsciiLine(currentLetter, i));
                
                if (j < romanNumber.length() - 1) {
                    result.append(" ");
                }
            }
            if (i < 5) {
                result.append("\n");
            }
        }
        
        return result.toString();
    }

    private static String getAsciiLine(char letter, int lineIndex) {
        if (letter == 'I') { return I[lineIndex]; }
        if (letter == 'V') { return V[lineIndex]; }
        if (letter == 'X') { return X[lineIndex]; }
        if (letter == 'L') { return L[lineIndex]; }
        if (letter == 'C') { return C[lineIndex]; }
        if (letter == 'D') { return D[lineIndex]; } 
        if (letter == 'M') { return M[lineIndex]; }
        return "";
    }
}
