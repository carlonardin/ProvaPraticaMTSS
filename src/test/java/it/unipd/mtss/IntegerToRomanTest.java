////////////////////////////////////////////////////////////////////
// Carlo Nardin 2148000
// Cristian Gramegna 2148633
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testConvertOne() {
      int input = 1;
      String result = IntegerToRoman.convert(input);
      assertEquals("I", result);
    }
  
    @Test
    public void testConvertTwo() {
      int input = 2;
      String result = IntegerToRoman.convert(input);
      assertEquals("II", result);
    }
  
    @Test
    public void testConvertThree() {
      int input = 3;
      String result = IntegerToRoman.convert(input);
      assertEquals("III", result);
    }

     @Test
    public void testConvertFour() {
      int input = 4;
      String result = IntegerToRoman.convert(input);
      assertEquals("IV", result);
    }

    @Test
    public void testConvertFive() {
      int input = 5;
      String result = IntegerToRoman.convert(input);
      assertEquals("V", result);
    }

    @Test
    public void testConvertSix() {
      int input = 6;
      String result = IntegerToRoman.convert(input);
      assertEquals("VI", result);
    }

    @Test
    public void testConvertNine() {
      int input = 9;
      String result = IntegerToRoman.convert(input);
      assertEquals("IX", result);
    }

    @Test
    public void testConvertTen() {
      int input = 10;
      String result = IntegerToRoman.convert(input);
      assertEquals("X", result);
    }
}
