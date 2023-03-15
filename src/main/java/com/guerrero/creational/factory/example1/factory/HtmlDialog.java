package com.guerrero.creational.factory.example1.factory;

import com.guerrero.creational.factory.example1.buttons.Button;
import com.guerrero.creational.factory.example1.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}