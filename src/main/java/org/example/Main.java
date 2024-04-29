package org.example;

public class Main {
    public static void main(String[] args) {
        Db db = Db.getInstance("alyvh", "qw2","link.com");
        Db db1 = Db.getInstance("alyvh1", "qw2","link.com");
        System.out.println(db==db1);
        System.out.println(db);
        System.out.println(db1);
    }
}