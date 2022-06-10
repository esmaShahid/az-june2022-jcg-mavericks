package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;

public class PositionTest {
    
    @Before  
        public void setUp() throws Exception {  
            System.out.println("before");  
        }  
        @Test
        public void InitializationCreatesResults() {
            
            Position testObj = new Position();
            assertEquals( 0,testObj.startPositionX);
            assertEquals( 0,testObj.startPositionY);

            //Confused on what an end position is? If you're testing initailization...
            //Also, 0 and 9 are "magic constants"
            assertEquals( 9,testObj.endPositionX);
            assertEquals( 9,testObj.endPositionY);
        } 

    
        @After  
        public void tearDown() throws Exception {  
            System.out.println("after");  
        } 

    }
