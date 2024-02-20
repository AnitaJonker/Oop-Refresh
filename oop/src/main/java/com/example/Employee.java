package com.example;

public class Employee {

  private String name;
  private int age;
  private double salary;
  private String location;

  Employee() {
    this.name = "Fred";
    this.age = 18;
    this.salary = 20;
    this.location = "Cape Town";

  }

  Employee(String name, int age, double salary, String location) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.location = location;
  }

  void raiseSalary(double salary) {
    this.salary = salary;
  }

  String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}
