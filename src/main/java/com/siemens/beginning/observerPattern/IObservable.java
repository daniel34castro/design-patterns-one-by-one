/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.observerPattern;

/**
 *
 * @author castdani
 */
public interface IObservable {
    public void add (IObserver observer);
    public void notifyObservers ();
    
}
