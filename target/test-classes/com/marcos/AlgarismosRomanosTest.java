import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConverterTest {

    @Test
    public void testDecimalToRoman() {
        assertEquals("III", RomanConverter.decimalToRoman(3));
        assertEquals("IV", RomanConverter.decimalToRoman(4));
        assertEquals("IX", RomanConverter.decimalToRoman(9));
        assertEquals("LVIII", RomanConverter.decimalToRoman(58));
        assertEquals("MCMXCIV", RomanConverter.decimalToRoman(1994));
    }

    @Test
    public void testInvalidDecimalToRoman() {
        assertEquals("Não é possível converter o número decimal informado para algarismos romanos.", RomanConverter.decimalToRoman(0));
        assertEquals("Não é possível converter o número decimal informado para algarismos romanos.", RomanConverter.decimalToRoman(4000));
    }

    @Test
    public void testRomanToDecimal() {
        assertEquals(3, RomanConverter.romanToDecimal("III"));
        assertEquals(4, RomanConverter.romanToDecimal("IV"));
        assertEquals(9, RomanConverter.romanToDecimal("IX"));
        assertEquals(58, RomanConverter.romanToDecimal("LVIII"));
        assertEquals(1994, RomanConverter.romanToDecimal("MCMXCIV"));
    }

    @Test
    public void testInvalidRomanToDecimal() {
        assertEquals(-1, RomanConverter.romanToDecimal("IIII")); // Símbolo romano inválido
        assertEquals(-1, RomanConverter.romanToDecimal("XVX")); // Símbolo romano inválido
    }

    @Test
public void testDecimalToRomanAdditional() {
    assertEquals("V", RomanConverter.decimalToRoman(5));
    assertEquals("XII", RomanConverter.decimalToRoman(12));
    assertEquals("XX", RomanConverter.decimalToRoman(20));
    assertEquals("XLV", RomanConverter.decimalToRoman(45));
    assertEquals("CL", RomanConverter.decimalToRoman(150));
    assertEquals("DCCC", RomanConverter.decimalToRoman(800));
    assertEquals("MMM", RomanConverter.decimalToRoman(3000));
}

@Test
public void testRomanToDecimalAdditional() {
    assertEquals(5, RomanConverter.romanToDecimal("V"));
    assertEquals(12, RomanConverter.romanToDecimal("XII"));
    assertEquals(20, RomanConverter.romanToDecimal("XX"));
    assertEquals(45, RomanConverter.romanToDecimal("XLV"));
    assertEquals(150, RomanConverter.romanToDecimal("CL"));
    assertEquals(800, RomanConverter.romanToDecimal("DCCC"));
    assertEquals(3000, RomanConverter.romanToDecimal("MMM"));
}

@Test
public void testInvalidRomanToDecimalAdditional() {
    assertEquals(-1, RomanConverter.romanToDecimal("IIII")); // Símbolo romano inválido
    assertEquals(-1, RomanConverter.romanToDecimal("XVX")); // Símbolo romano inválido
    assertEquals(-1, RomanConverter.romanToDecimal("ABC")); // Símbolo romano inválido
    assertEquals(-1, RomanConverter.romanToDecimal("XIIII")); // Símbolo romano inválido
}

@Test
public void testDecimalToRomanAdditionalTeste() {
    assertEquals("V", RomanConverter.decimalToRoman(5));
    assertEquals("XII", RomanConverter.decimalToRoman(12));
    assertEquals("XX", RomanConverter.decimalToRoman(20));
    assertEquals("XLV", RomanConverter.decimalToRoman(45));
    assertEquals("CL", RomanConverter.decimalToRoman(150));
    assertEquals("DCCC", RomanConverter.decimalToRoman(800));
    assertEquals("MMM", RomanConverter.decimalToRoman(3000));
    assertEquals("CDXC", RomanConverter.decimalToRoman(490));
    assertEquals("CMXLIV", RomanConverter.decimalToRoman(944));
    assertEquals("MMXIX", RomanConverter.decimalToRoman(2019));
}

@Test
public void testRomanToDecimalAdditionalTest() {
    assertEquals(5, RomanConverter.romanToDecimal("V"));
    assertEquals(12, RomanConverter.romanToDecimal("XII"));
    assertEquals(20, RomanConverter.romanToDecimal("XX"));
    assertEquals(45, RomanConverter.romanToDecimal("XLV"));
    assertEquals(150, RomanConverter.romanToDecimal("CL"));
    assertEquals(800, RomanConverter.romanToDecimal("DCCC"));
    assertEquals(3000, RomanConverter.romanToDecimal("MMM"));
    assertEquals(490, RomanConverter.romanToDecimal("CDXC"));
    assertEquals(944, RomanConverter.romanToDecimal("CMXLIV"));
    assertEquals(2019, RomanConverter.romanToDecimal("MMXIX"));
}


}
