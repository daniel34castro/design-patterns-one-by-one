/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.siemens.beginning;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

// Design Patterns
//https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=2
@SpringBootApplication()
public class Beginning {

    public static void main(String[] args) {
        System.out.println("Design patterns study");


        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

//        messages.forEach(word -> System.out.println(StringUtils.capitalize(word)));
messages.forEach(StringUtils::capitalize);
//        System.out.println(messages);

    }
}
