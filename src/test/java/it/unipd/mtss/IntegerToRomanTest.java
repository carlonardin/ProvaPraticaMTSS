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
}