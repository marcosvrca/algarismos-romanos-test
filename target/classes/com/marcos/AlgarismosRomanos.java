import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverter {

    private static final int[] DECIMAL_VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String decimalToRoman(int decimal) {
        if (decimal <= 0 || decimal > 3999) {
            return "Não é possível converter o número decimal informado para algarismos romanos.";
        }

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < DECIMAL_VALUES.length; i++) {
            while (decimal >= DECIMAL_VALUES[i]) {
                roman.append(ROMAN_SYMBOLS[i]);
                decimal -= DECIMAL_VALUES[i];
            }
        }

        return roman.toString();
    }

    public static int romanToDecimal(String roman) {
        int decimal = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = getValueOfRomanSymbol(c);

            if (value < 0) {
                return -1; // Valor romano inválido
            }

            if (value < prevValue) {
                decimal -= value;
            } else {
                decimal += value;
            }

            prevValue = value;
        }

        return decimal;
    }

    private static int getValueOfRomanSymbol(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1; // Símbolo romano inválido
        }
    }
}
