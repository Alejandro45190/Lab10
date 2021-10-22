package com.mycompany.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostfixNotationTest {
    
    @Test
    void multiplyAdd() {
        PostfixNotation pfn = new PostfixNotation("234*+");       
        int result = pfn.evalPostfix();
        assertEquals(10, result);
    }
    
    @Test
    void divideSubtract() {
        PostfixNotation pfn = new PostfixNotation("821/-");       
        int result = pfn.evalPostfix();
        assertEquals(3, result);
    }
    
    @Test
    void addMinus() {
        PostfixNotation pfn = new PostfixNotation("312-+");       
        int result = pfn.evalPostfix();
        assertEquals(4, result);
    }
    
    @Test
    void multiplyDivide() {
        PostfixNotation pfn = new PostfixNotation("432*/");       
        int result = pfn.evalPostfix();
        assertEquals(6, result);
    }
}