package com.excercises.employee;

/* Quick recap on inheritance and encapsulation */
public class Employee extends Human {

    private double salary;

    Employee(String name, int age, String location) {
        super(name, age, location);
    }

    Employee(Human ref) {
        super(ref);
    }

    void raiseSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
