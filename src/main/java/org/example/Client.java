package org.example;

public class Client {
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {

        this.factory = factory;
    }
    public void RenderFactory(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

}
