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

  @Test
  public void testConvertFourteen() {
    int input = 14;
    String result = IntegerToRoman.convert(input);
    assertEquals("XIV", result);
  }

  @Test
  public void testConvertTwenty() {
    int input = 20;
    String result = IntegerToRoman.convert(input);
    assertEquals("XX", result);
  }

  @Test
  public void testConvertForty() {
    int input = 40;
    String result = IntegerToRoman.convert(input);
    assertEquals("XL", result);
  }

  @Test
  public void testConvertFifty() {
    int input = 50;
    String result = IntegerToRoman.convert(input);
    assertEquals("L", result);
  }

  @Test
  public void testConvertNinety() {
    int input = 90;
    String result = IntegerToRoman.convert(input);
    assertEquals("XC", result);
  }

  @Test
  public void testConvertNinetyNine() {
    int input = 99;
    String result = IntegerToRoman.convert(input);
    assertEquals("XCIX", result);
  }

  @Test
  public void testConvertOneHundred() {
    int input = 100;
    String result = IntegerToRoman.convert(input);
    assertEquals("C", result);
  }

  @Test
  public void testConvertFourHundred() {
    int input = 400;
    String result = IntegerToRoman.convert(input);
    assertEquals("CD", result);
  }

  @Test
  public void testConvertFourHundredFortyFour() {
    int input = 444;
    String result = IntegerToRoman.convert(input);
    assertEquals("CDXLIV", result);
  }

  @Test
  public void testConvertFiveHundred() {
    int input = 500;
    String result = IntegerToRoman.convert(input);
    assertEquals("D", result);
  }

  @Test
  public void testConvertNineHundred() {
    int input = 900;
    String result = IntegerToRoman.convert(input);
    assertEquals("CM", result);
  }

  @Test
  public void testConvertNineHundredNinetyNine() {
    int input = 999;
    String result = IntegerToRoman.convert(input);
    assertEquals("CMXCIX", result);
  }

  @Test
  public void testConvertOneThousand() {
    int input = 1000;
    String result = IntegerToRoman.convert(input);
    assertEquals("M", result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConvertZero() {
      int input = 0;
      IntegerToRoman.convert(input);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConvertNegativeNumber() {
      int input = -1;
      IntegerToRoman.convert(input);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConvertTooHighNumber() {
      int input = 1001;
      IntegerToRoman.convert(input);
  }

}
