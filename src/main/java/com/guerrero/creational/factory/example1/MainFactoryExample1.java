package com.guerrero.creational.factory.example1;

import com.guerrero.creational.factory.example1.factory.Dialog;
import com.guerrero.creational.factory.example1.factory.HtmlDialog;
import com.guerrero.creational.factory.example1.factory.WindowsDialog;

public class MainFactoryExample1 {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        String os = System.getProperty("os.name");

        if (os.equals("Windows 10") || os.equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}