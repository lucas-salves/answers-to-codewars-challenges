package com.mycompany.codewars;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ReversedWords {


    public static void main(String[] args) {
//       ReversedWords.exampleCases();
        System.out.println( ReversedWords.reverseWords("The quick brown fox jumps over the lazy dog.") );
    }
    
    public static void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReversedWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReversedWords.reverseWords("apple"));
        assertEquals("a b c d", ReversedWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReversedWords.reverseWords("double  spaced  words"));
    }
    
    public static String reverseWords(final String original){
        
        if( original.isBlank() ){
            return original.replaceAll(" ", " ");
        }
        
        String splittedString[] = original.split(" ");
        
        int index = 0;
        for( String word : splittedString ){
            splittedString[index] = new StringBuilder(word).reverse().toString();
            index++;
        }
        return String.join(" ", splittedString);
    }
    
}
