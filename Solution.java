package com.mycompany.codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Solution {
    public static void main(String[] args) {
        Solution.validPins();
        Solution.nonDigitCharacters();
        Solution.invalidLengths();
    }
    
    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}") || pin.matches("[0-9]{6}") ;
    }
 
    @Test
    public static void validPins() {
        assertEquals(true, Solution.validatePin("1234"));
        assertEquals(true, Solution.validatePin("0000"));
        assertEquals(true, Solution.validatePin("1111"));
        assertEquals(true, Solution.validatePin("123456"));
        assertEquals(true, Solution.validatePin("098765"));
        assertEquals(true, Solution.validatePin("000000"));
        assertEquals(true, Solution.validatePin("090909"));
    }
    
    @Test
    public static void nonDigitCharacters() {
        assertEquals(false, Solution.validatePin("a234"));
        assertEquals(false, Solution.validatePin(".234"));
    }
    
    @Test
    public static void invalidLengths() {
        assertEquals(false, Solution.validatePin("1"));
        assertEquals(false, Solution.validatePin("12"));
        assertEquals(false, Solution.validatePin("123"));
        assertEquals(false, Solution.validatePin("12345"));
        assertEquals(false, Solution.validatePin("1234567"));
        assertEquals(false, Solution.validatePin("-1234"));
        assertEquals(false, Solution.validatePin("1.234"));
        assertEquals(false, Solution.validatePin("00000000"));
    }
    
}
