package com.company;

public class Person {

    private String  name;
    private String age;

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" + "name='" + getName() + '\'' + ", age='" + getAge() + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
