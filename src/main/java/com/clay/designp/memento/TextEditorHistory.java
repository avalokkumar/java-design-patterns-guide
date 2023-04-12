package com.clay.designp.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class TextEditorHistory {
    private final List<TextEditorMemento> mementos = new ArrayList<>();

    public void addMemento(TextEditorMemento memento) {
        mementos.add(memento);
    }

    public TextEditorMemento getMemento(int index) {
        return mementos.get(index);
    }

  /*  public void undo(TextEditor editor) {
        if (mementos.isEmpty()) {
            return;
        }
        TextEditorMemento lastMemento = mementos.remove(mementos.size() - 1);
        editor.restore(lastMemento);
    }*/
}