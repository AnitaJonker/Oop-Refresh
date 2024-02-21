package com.excercises.employee;

import java.lang.*;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Human emp = new Employee("David", 25, "Cpt");
        Employee security = new Employee(emp);
        security.setSalary(500);
        System.out.println("Name :" + security.getName() + "Current salary: " + security.getSalary());

        boolean value = true;
        String[] response = (value ? new String[]{"yes"} : new String[]{"no"});

    }
}
