/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning;

/**
 *
 * @author castdani
 */
// Java Program to Illustrate Component class

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Annotation
@Configuration
public class ComponentDemo {

	// Method
        @Bean
	public void demoFunction()
	{

		// Print statement when method is called
		System.out.println("Hello GeeksForGeeks");
	}
}

