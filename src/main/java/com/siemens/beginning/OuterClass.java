/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning;

/**
 *
 * @author castdani
 */
public class OuterClass {


      int x = 10;

  public static class InnerClass {
    int y = 5;
    private int innerNum;
    public InnerClass (int num){
        this.innerNum =  num ;
    }
    
    public int getInnerNum(){
        return innerNum;
    }
  }
}
