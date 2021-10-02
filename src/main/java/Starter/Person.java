package com.java_essential.starter_garmatyuk;
/** Создайте класс Person (без метода main)
 Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
 Проинициализируйте их какими-то значениями
 Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java*/
public class Person {
    String gender = "male";
    String name = "Pavel";
    double height = 1.82;
    int weightBody = 120;
    int age = 35;

    boolean learnJava() {
        return true;
    }

    void move() {
        System.out.println("moving");
    }

    void sit() {
        System.out.println("sit down");
    }

    void run() {
        System.out.println("to run");
    }

    void speak() {
        System.out.println("to speak");
    }
}
