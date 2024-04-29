package org.example;

import org.example.MacOS.MacOSFactory;
import org.example.Windows.WindowsFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.RenderFactory();
        Client macosClient = new Client(new MacOSFactory());
        macosClient.RenderFactory();
    }

}