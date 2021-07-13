package com.foxminded.countUniqeChar.logicForCountUniqueChar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.foxminded.task5.charcounter.CountUniqueChar;

class CountUniqueCharMakerTest {

    CountUniqueChar countUniqueCharMaker = new CountUniqueChar(new HashMap<>());
    
    @Test
    public void methodGetCountUniqueSymbols_ThrowsIllegalArgumentException_IfInputEqualsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            countUniqueCharMaker.getCountUniqueSymbols(null);
        });
    }

    @Test
    public void methodGetCountUniqueSymbols_ThrowsIllegalArgumentException_IfInputEqualsEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            countUniqueCharMaker.getCountUniqueSymbols("");
        });
    }
    
    @Test
    public void methodGetCountUniqueSymbols_shouldReturnOneGap_IfInputEqualsOneGap () {
        String expected ="\" \" - 1"+"\n"; 
                         
        String actual = countUniqueCharMaker.getCountUniqueSymbols(" ");
        assertEquals(expected, actual);
    }
    
    @Test
    public void methodGetCountUniqueSymbols_shouldReturnTenGap_IfInputEqualsTenGaps () {
        String expected ="\" \" - 10"+"\n"; 
                         
        String actual = countUniqueCharMaker.getCountUniqueSymbols("          ");
        assertEquals(expected, actual);
    }
    
    @Test
    public void methodGetCountUniqueSymbols_shouldReturnSameSymblosUpperAndLowerCase_IfInputEqualsSameSymblos () {
        String expected ="\"S\" - 5"+"\n"+
                         "\"s\" - 5"+"\n";
                         
        String actual = countUniqueCharMaker.getCountUniqueSymbols("SSSSSsssss");
        assertEquals(expected, actual);
    }
  
    @Test
    public void methodGetCountUniqueSymbols_shouldReturnSameSymblos_IfInputEqualsDifferentSymbols () {
        String expected ="\"a\" - 1"+"\n"+ 
                         "\"s\" - 1"+"\n"+ 
                         "\"d\" - 1"+"\n"+
                         "\"f\" - 1"+"\n"+
                         "\"g\" - 1"+"\n"+
                         "\"h\" - 1"+"\n";

        String actual = countUniqueCharMaker.getCountUniqueSymbols("asdfgh");
        assertEquals(expected, actual);
    }
     
    @Test
    public void methodGetCountUniqueSymbols_ShouldReturSpecialCharacters_IfInputEqualsSpecialCharacters () {
        String expected ="\"!\" - 2"+"\n"+ 
                         "\"@\" - 1"+"\n"+ 
                         "\"#\" - 1"+"\n"+
                         "\"$\" - 1"+"\n"+
                         "\"%\" - 1"+"\n"+
                         "\"^\" - 2"+"\n"+
                         "\"&\" - 2"+"\n"+
                         "\"*\" - 4"+"\n"+
                         "\"(\" - 1"+"\n"+
                         "\")\" - 1"+"\n";
                         
                         
        String actual = countUniqueCharMaker.getCountUniqueSymbols("!@#$%^&****()!&^");
        assertEquals(expected, actual);
    }
    
    @Test
    public void methodGetCountUniqueSymbols_ShouldReturnNumbers_IfInputEqualsDifferentAndSameNumbers () {
        String expected ="\"1\" - 1"+"\n"+ 
                         "\"2\" - 1"+"\n"+ 
                         "\"3\" - 1"+"\n"+
                         "\" \" - 2"+"\n"+
                         "\"4\" - 1"+"\n"+
                         "\"5\" - 1"+"\n"+
                         "\"6\" - 1"+"\n"+
                         "\"7\" - 1"+"\n"+
                         "\"8\" - 1"+"\n"+
                         "\"9\" - 1"+"\n"+
                         "\"0\" - 3"+"\n";
                                                 
        String actual = countUniqueCharMaker.getCountUniqueSymbols("123 456 789000");
        assertEquals(expected, actual);
    }
    
    @Test 
    public void methodGetCountUniqueSymbols_ShouldReturnSymbolsNumbersAndSpecialCharacters_IfInputEqualsSymbolsNumbersAndSpecialCharacters () {
        String expected ="\"h\" - 1"+"\n"+ 
                         "\"e\" - 1"+"\n"+ 
                         "\"l\" - 3"+"\n"+
                         "\"o\" - 2"+"\n"+
                         "\" \" - 3"+"\n"+
                         "\"w\" - 1"+"\n"+
                         "\"r\" - 1"+"\n"+
                         "\"d\" - 1"+"\n"+
                         "\"1\" - 3"+"\n"+
                         "\"2\" - 2"+"\n"+
                         "\"3\" - 1"+"\n"+
                         "\"%\" - 1"+"\n"+
                         "\"^\" - 1"+"\n"+
                         "\"&\" - 1"+"\n";
                         
                                                
        String actual = countUniqueCharMaker.getCountUniqueSymbols("hello world 111223 %^&");
        assertEquals(expected, actual);
    }
}
