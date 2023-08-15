package com.currencycloud.pp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link RomanNumeralConverter}.
 */
public final class RomanNumeralConverterTest {

  @Test
  public void convert_blank_returns0() {
    assertEquals(0, RomanNumeralConverter.convert(""));
  }

  @Test
  public void convert_i_returns1() {
    assertEquals(1, RomanNumeralConverter.convert("I"));
  }

  @Test
  public void convert_ii_returns2() {
    assertEquals(2, RomanNumeralConverter.convert("II"));
  }

  @Test
  public void convert_ii_returns3() {
    assertEquals(3, RomanNumeralConverter.convert("III"));
  }

  @Test
  public void convert_iv_returns4() {
    assertEquals(4, RomanNumeralConverter.convert("IV"));
  }

  @Test
  public void convert_v_returns5() {
    assertEquals(5, RomanNumeralConverter.convert("V"));
  }

  @Test
  public void convert_xiv_returns14() {
    assertEquals(14, RomanNumeralConverter.convert("XIV"));
  }

  @Test
  public void convert_xv_returns15() {
    assertEquals(15, RomanNumeralConverter.convert("XV"));
  }

  @Test
  public void convert_vi_returns6() {
    assertEquals(6, RomanNumeralConverter.convert("VI"));
  }

  @Test
  public void convert_vii_returns7() {
    assertEquals(7, RomanNumeralConverter.convert("VII"));
  }

  @Test
  public void convert_ix_returns9() {
    assertEquals(9, RomanNumeralConverter.convert("IX"));
  }

  @Test
  public void convert_xvii_returns17() {
    assertEquals(17, RomanNumeralConverter.convert("XVII"));
  }

  @Test
  public void convert_xxii_returns22() {
    assertEquals(22, RomanNumeralConverter.convert("XXII"));
  }

  @Test
  public void convert_xxiv_returns24() {
    assertEquals(24, RomanNumeralConverter.convert("XXIV"));
  }

  @Test
  public void convert_xlv_returns45() {
    assertEquals(45, RomanNumeralConverter.convert("XLV"));
  }

  @Test
  public void convert_xc_returns90() {
    assertEquals(90, RomanNumeralConverter.convert("XC"));
  }

  @Test
  public void convert_xcvii_returns97() {
    assertEquals(97, RomanNumeralConverter.convert("XCVII"));
  }
  @Test
  public void convert_xcix_returns99() {
    assertEquals(99, RomanNumeralConverter.convert("XCIX"));
  }
  @Test
  public void convert_xliv_returns44() {
    assertEquals(44, RomanNumeralConverter.convert("XLIV"));
  }

}