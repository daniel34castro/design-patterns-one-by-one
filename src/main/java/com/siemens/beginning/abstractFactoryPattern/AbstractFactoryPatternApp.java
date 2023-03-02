/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

import com.siemens.beginning.factoryPattern.IAnimal;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author castdani
 */
public class AbstractFactoryPatternApp {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // Boring Way to test it
//        DarkTheme dt = new DarkTheme();
//        NormalTheme nt = new NormalTheme();
//        HighContrastTheme hct = new HighContrastTheme();

        // Fun Way using reflection :o
        List<String> classesList = new ArrayList<String>();
        classesList.add("DarkTheme");
        classesList.add("NormalTheme");
        classesList.add("NormalTheme");
        for (String className : classesList) {
            System.out.println("i = " + className);
            Class<?> clazz = Class.forName("com.siemens.beginning.abstractFactoryPattern." + className);
            Constructor<?> constructor = clazz.getConstructor();
            Object instance = constructor.newInstance();
            System.out.println("instance " + instance);
        }

    }
}
