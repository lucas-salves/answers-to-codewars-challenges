/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.codewars;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class NewMain {

    
    public static void main(String[] args) {
        NewMain.FixedTests();
//        System.out.println( isIsogram("Dermatoglyphics") );
    }
    
   
    public static void FixedTests() {
        assertEquals(true,isIsogram("Dermatoglyphics"));
        assertEquals(true, isIsogram("isogram"));
        assertEquals(false, isIsogram("moose"));
        assertEquals(false, isIsogram("isIsogram"));
        assertEquals(false, isIsogram("aba"));
        assertEquals(false, isIsogram("moOse"));
        assertEquals(true, isIsogram("thumbscrewjapingly"));
        assertEquals(true, isIsogram("")); 
    }
    
    public static boolean  isIsogram(String str) {
       
        if( str.isEmpty() ){
            
            return true;
            
        }
        
        char[] chars = str.toCharArray();
        
        Map<Character, Integer> charsMap = new HashMap<>();
        
        int index = 0;
        for( char character : chars ){
            char lowerChar = Character.toLowerCase(character);
            if( charsMap.containsKey( lowerChar ) ){
                return false;
            }else{
                charsMap.put(character, index);
            }
            index++;
        }
        return true;
    } 
    
}
