package com.example;

import java.lang.*;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Employee emp = new Employee();
        Employee emp2 = new Employee("David", 25, 3000, "Cpt");
        emp.raiseSalary(1500.00);
        System.out.println(emp.getSalary());
        System.out.println(emp2.getSalary());
        boolean value = true;
        String[] response = (value ? new String[] { "yes" } : new String[] { "no" });
 
    }
}