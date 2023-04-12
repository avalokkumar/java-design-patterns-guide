package com.clay.designp.memento;

public class MementoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setText("Hello world!");
        System.out.println(editor.getText()); // Output: Hello world!

        EditorMemento memento = editor.save();

        editor.setText("Goodbye world!");
        System.out.println(editor.getText()); // Output: Goodbye world!

        editor.restore(memento);
        System.out.println(editor.getText()); // Output: Hello world!
    }
}
