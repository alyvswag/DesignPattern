package org.example;

public class FactoryMethod {
    public Cars createClass(String method){
        if(method.equalsIgnoreCase("Bmw")){
            return new Bmw();
        } else if (method.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else if (method.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        }
        else{
            return null;
        }
    }

}
