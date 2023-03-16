package com.guerrero.behavioral.observer.example1;

import com.guerrero.behavioral.observer.example1.editor.Editor;
import com.guerrero.behavioral.observer.example1.listeners.EmailNotificationListener;
import com.guerrero.behavioral.observer.example1.listeners.LogOpenListener;

public class MainObserverExample1 {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
