package com.currencycloud.pp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for {@link RomanNumeralConverter}.
 */
public final class RomanNumeralConverterTest {
  @Test
  public void convert_i_returns1() {
    assertEquals(1, RomanNumeralConverter.convert("i"));
  }
}