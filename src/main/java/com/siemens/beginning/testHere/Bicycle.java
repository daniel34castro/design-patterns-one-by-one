/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.testHere;

/**
 *
 * @author castdani
 */
public class Bicycle {

    private String brand;
    private Integer frameSize;

    public Bicycle(String brand, Integer frameSize) {
        this.brand = brand;
        this.frameSize = frameSize;
    }

    public Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getFrameSize() {
        return frameSize;
    }

}
