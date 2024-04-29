package org.example.MacOS;

import org.example.AbstractFactory;
import org.example.Button;
import org.example.Checkbox;

public class MacOSFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
