package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CharacterTest {

    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
    @Test
    public void InitializationCreatesResults() {
        
        Character testObj = new Character("");
        assertEquals( "Default",testObj.name);

        assertNotNull(testObj.name != null);

    }
    @Test
    public void testCase1() {
        
        Character testObj = new Character("Sue");
        assertEquals("Sue",testObj.name);

       }

    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    } 
}
