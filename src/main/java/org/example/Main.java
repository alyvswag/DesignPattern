package org.example;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Talib", "Aliyev", 19);
        ConcretePrototype clone = (ConcretePrototype) original.clone();
        System.out.println(original == clone); // cunnki new obyekt yaradir
    }
}