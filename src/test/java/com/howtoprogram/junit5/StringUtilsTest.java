package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StringUtilsTestUnit5 {

  @Test
  public void testConcatWithNullInput() {
    String st1 = "Hello";
    String st2 = "World";
    String st3 = null;
    
    String expect = st1 + st2;
    String actual = StringUtils.concat(st1, st2, st3);
    assertEquals(expect, actual);
  }
  
}
