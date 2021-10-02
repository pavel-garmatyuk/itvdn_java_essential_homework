package com.java_essential.starter_garmatyuk;

/**
 * Задание 5 003_Variables
 * Используя IntelliJ IDEA, создайте класс Main.
 * Проверьте, можно ли создать переменные со следующими именами:
 * uberflu? , _Identifier , \u006fIdentifier , &myVar , myVariab1le
 */
public class Main {

    public static void main(String[] args) {
        // Название переменных написано согласно условию.
        // int uberflu? = 0; - нельзя
        // int _Identifier = 0; венгерка, закоминтил
        // double \u006fIdentifier = 0; - нельзя
        // int &myVar = 0; - нельзя
        //String &myVar = ""; - нельзя
        // var myVariab1le = 12; закоминтил, чтобы залить.

        int numA = 10;
        //int numB = 20;
        int sum = 0;
        do {
            if (numA % 2 != 0) {
                sum += numA;
            }
            numA++;


        } while (numA <= 20);
        System.out.println(sum);

    }
}
