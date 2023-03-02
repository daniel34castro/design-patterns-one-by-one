/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning.testHere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.baeldung.com/java-method-references
public class MethodReference {
    //
    public static void main(String[] args) {
        
        //3. Reference to an Instance Method of a Particular Object
        BicycleComparator bikeFrameSizeComparator = new BicycleComparator();

        Bicycle b1 = new Bicycle("a", 1);
        Bicycle b2 = new Bicycle("a", 2);
        Bicycle b3 = new Bicycle("a", 3);
        List<Bicycle> BicyclesList = new ArrayList<>();
        BicyclesList.add(b2);
        BicyclesList.add(b1);
        BicyclesList.add(b3);
        Stream<Bicycle> stream = BicyclesList.stream()
                .sorted(bikeFrameSizeComparator::compare);
        stream.collect(Collectors.toList()).
                forEach(bike -> System.out.println("bike " + bike.getFrameSize()));

        
        // 5. Reference to a Constructor
        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        
        List<Bicycle> bikeBrandsList =  bikeBrands.stream().map(Bicycle::new).collect(Collectors.toList());
        
        Bicycle[]  bikeBrandsArray =  bikeBrands.stream() 
                .map(Bicycle::new) // Stream
                .toArray(Bicycle[]::new);

        for (Bicycle bike: bikeBrandsArray){
            System.out.println("bikeBrnad  " + bike.getBrand() );
        }
        System.out.println("typeof " + bikeBrandsArray.getClass() );

    }

}
