/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siemens.beginning;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author castdani
 */
public class ExtendableBean {
    public String name;
    private Map<String, String> properties = new HashMap<String, String>();

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void add(String a1, String a2) {
        this.properties.put(a1,a2);
    }

    
    @Test
  public static void main(String[] args) 
    throws JsonProcessingException {
 
    ExtendableBean bean = new ExtendableBean();
    bean.add("attr1", "val1");
    bean.add("attr2", "val2");
    System.out.println(bean.getProperties());

    String result = new ObjectMapper().writeValueAsString(bean);
    System.out.println(result);
    
    assertThat(result, containsString("attr1"));
    assertThat(result, containsString("val1"));
}
    
    
}
