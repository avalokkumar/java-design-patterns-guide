## Memento Design Pattern
The Memento design pattern is a behavioral design pattern that allows you to save and restore the state of an object without revealing the details of its implementation. It achieves this by capturing and storing the internal state of an object at a particular point in time, and later restoring that state if necessary.

### When to use Memento design pattern:

* When you need to implement undo and redo functionality in your application.
* When you need to save the state of an object so that it can be restored later, for example, when you want to implement checkpoints in a game.
* When you need to keep a history of changes made to an object and be able to revert back to a specific state at any point.

### Use cases:
* In text editors, where the user can undo and redo changes made to the document.
* In games, where the player can save the state of the game at a specific point in time and later restore it if necessary.
* In database transactions, where the system can roll back to a previous state in case of a failure.

### Memento design pattern consists of three main components:
* Originator: the object that has an internal state that needs to be saved and restored.
* Memento: the object that stores the state of the originator.
* Caretaker: the object that is responsible for saving and restoring the state of the originator.

### The process of saving and restoring the state of an object using Memento design pattern involves the following steps:

* The originator creates a memento object that contains its internal state.
* The caretaker stores the memento object.
* The originator can later restore its internal state by requesting the stored memento object from the caretaker.



### Example
Let's say we have a text editor that allows users to write, edit, and save documents. When the user makes changes to the document, they can choose to save their progress by creating a checkpoint or snapshot of the current document state. If the user decides to undo their changes, they can revert back to a previously saved state.

To implement this functionality using the Memento pattern, we can create three classes: the `TextEditor` class (originator), the `TextEditorMemento` class (memento), and the `TextEditorHistory` class (caretaker).

The `TextEditor class` represents the originator and holds the current state of the document. It has methods to allow users to modify the document and create mementos.

The `TextEditorMemento` class represents a snapshot of the document state. It has methods to retrieve and set the saved state.

The TextEditorHistory class acts as a caretaker and keeps track of all the saved mementos in a list. It has methods to add new mementos to the list, retrieve mementos from the list, and undo changes made to the document.