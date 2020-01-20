package com.example.demo.context;

import lombok.Data;

@Data
public class Person {

  private String id;
  private String value;

  public Person(String id, String value){
    this.id = id;
    this.value = value;
  }

}
