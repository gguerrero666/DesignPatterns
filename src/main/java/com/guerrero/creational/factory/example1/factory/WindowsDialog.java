package com.guerrero.creational.factory.example1.factory;

import com.guerrero.creational.factory.example1.buttons.Button;
import com.guerrero.creational.factory.example1.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}