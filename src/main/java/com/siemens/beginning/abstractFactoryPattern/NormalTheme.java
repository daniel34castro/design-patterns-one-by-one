/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.abstractFactoryPattern;

/**
 *
 * @author castdani
 */
public class NormalTheme implements IFactory{
    public NormalTheme (){
        System.out.println("Creating... " + this.getClass().getSimpleName());
        this.getBackroundColor();
        this.getFontColor();
    }
    @Override
    public String getBackroundColor(){
        WhiteBackround wb = new WhiteBackround();
        return wb.createProductA();
    };
    @Override
    public String getFontColor(){
        BlackFont wf = new BlackFont();
        return wf.createProductB();
    };
    
}

