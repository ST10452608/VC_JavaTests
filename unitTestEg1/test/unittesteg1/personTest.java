/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unittesteg1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class personTest {
    
    public personTest() {
    }

    @Test
    public void testName() {
        //arrange
        String expected = "Migyle";
        
        //Act
        Person p = new Person();
        String actual = p.getName();
        
        //Assert
        assertEquals(expected, actual);
        
    }
    @Test
    public void testSum(){
        //arrange
        int expected = 8;
        
        //act
        Person p = new Person();
        int actual = p.calcSum(5,3);
        
        //assert
        assertEquals(expected, actual);
        
    }
    @Test
    public void testStatus(){
        //act
        Person p = new Person();
        boolean actual = p.checkStatus(12);
        
        //assert
        assertFalse(actual);
    }
    
}
