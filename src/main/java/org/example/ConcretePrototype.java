package org.example;

public class ConcretePrototype implements Prototype {

    private String name;
    private String surname;
    private int age;

    public ConcretePrototype(ConcretePrototype prototype) {
        this.name = prototype.name;
        this.surname = prototype.surname;
        this.age = prototype.age;
    }

    public ConcretePrototype(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}
