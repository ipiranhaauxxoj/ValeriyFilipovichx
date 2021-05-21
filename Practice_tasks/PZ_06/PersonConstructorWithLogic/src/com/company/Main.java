package com.company;

class Person{

    String name;    // имя
    int age;        // возраст
    Person()
    {
        name = "Undefined";
        age = 18;
    }
    Person(String n)
    {
        name = n;
        age = 18;
    }
    Person(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

public class Main {

    public static void main(String[] args) {
        Person bob = new Person();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}
