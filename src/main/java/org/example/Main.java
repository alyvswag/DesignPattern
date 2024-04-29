package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      FactoryMethod car = new FactoryMethod();
      Cars audi = car.createClass("Audi");
        audi.method();
    }
}