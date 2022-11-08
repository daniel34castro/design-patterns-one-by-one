/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

/**
 *
 * @author castdani
 */
public class HighContrastTheme implements IFactory{
    public HighContrastTheme (){
        System.out.println("Creating... " + this.getClass().getSimpleName());
        this.getBackroundColor();
        this.getFontColor();
    }
    @Override
    public String getBackroundColor(){
        BlackBackround wb = new BlackBackround();
        return wb.createProductA();
    };
    @Override
    public String getFontColor(){
        YellowFont yf = new YellowFont();
        return yf.createProductB();
    };
    
    public void HighContrastTheme (){
        this.getBackroundColor();
        this.getFontColor();
    }
}
