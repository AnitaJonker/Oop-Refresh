package com.excercises.employee;

abstract class Human {

    private String name;
    private int age;
    private String location;

    Human(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    Human(Human ref) {
        this.name = ref.name;
        this.age = ref.age;
        this.location = ref.location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
