package com.currencycloud.pp;

import java.util.HashMap;
import java.util.Map;

/**
 * Converter to convert to and from Roman numerals. 
 */
public final class RomanNumeralConverter {
  static Map<Character, Integer> charValues;
  static {
     charValues = new HashMap<>();
     charValues.put('I',1);
     charValues.put('V',5);
     charValues.put('X',10);
     charValues.put('L',50);
     charValues.put('C',100);
  }

  /**
   * Convert a Roman numeral into the integer equivalent.
   * @param value Value to convert.
   * @return      The integer value.
   */
  public static int convert(final String value) {
    //If the value of the symbol on the right is smaller, add it, otherwise if the value on the right is higher, subtract it
    int result = 0;

    if (value == null) {
      return -1; //TODO
    }
    for (int ii = 0; ii< value.length(); ii++) {
      char ch = value.charAt(ii);

      Integer intValue;
      if (charValues.containsKey(ch)) {
        intValue = charValues.get(ch);
      } else {
        return -1; //TODO;
      }
      Integer intValueNext = -1;
      char nextCh;
      if (ii < (value.length() - 1)) {
        nextCh = value.charAt(ii + 1);
        if (charValues.containsKey(nextCh)) {
          intValueNext = charValues.get(nextCh);
        } else {
          return -1; //TODO;
        }
      }
      //determine if character to the right is of greater value than the current character (if so decrement, otherwise increment)
      if ((intValueNext != -1) && (intValueNext > intValue)) {
        result -= intValue;
      } else {
        result += intValue;
      }
    }
    return result;
  }
}