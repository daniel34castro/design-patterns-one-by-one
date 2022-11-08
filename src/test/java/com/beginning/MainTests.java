/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beginning;

import com.siemens.beginning.factoryPattern.IAnimal;
import com.siemens.beginning.factoryPattern.IAnimalFactory;
import com.siemens.beginning.factoryPattern.RandomFactory;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author castdani
 */
public class MainTests {

    @Test
    public void dummytest() {
//        IAnimalFactory soundFactory = new RandomFactory();
//        IAnimal animal =soundFactory.createAnimal();
        System.out.println("testing.... ");
//        assertEquals(2, 1);
//        assertTrue("2 menor quu 1", 2 < 1);

        try {
            System.out.println("chegou ali ");
            fail("Exception not thrown");
            System.out.println("chegou aqui ");
//            IAnimalFactory soundFactory = new RandomFactory();
//            IAnimal animal =soundFactory.createAnimala();
            
        } catch (Exception e) {
            assertTrue(2<3);
        }
    }
}
