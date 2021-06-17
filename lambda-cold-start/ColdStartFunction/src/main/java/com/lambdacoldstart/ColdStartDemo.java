package com.lambdacoldstart;

public class ColdStartDemo {
  
  private Double instanceVariable = Math.random();
  private static Double staticInstanceVariable = Math.random();

  public ColdStartDemo() {
    System.out.println("Default constructor invoked !!");
  }

  static {
    System.out.println("Static block initialized !!");
  }

  public void coldStartBasics() {
    Double localVariable = Math.random();
    System.out.printf("instanceVariable: %f, staticInstanceVariable: %f, localVariable: %f", instanceVariable, staticInstanceVariable, localVariable);
  }
}
