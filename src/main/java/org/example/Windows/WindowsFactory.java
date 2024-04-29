package org.example.Windows;

import org.example.AbstractFactory;
import org.example.Button;
import org.example.Checkbox;

public class WindowsFactory implements AbstractFactory {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }


}
