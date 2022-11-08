/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

/**
 *
 * @author castdani
 */
public class DarkTheme implements IFactory{
    public DarkTheme (){
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
        WhiteFont wf = new WhiteFont();
        return wf.createProductB();
    };
    

}
