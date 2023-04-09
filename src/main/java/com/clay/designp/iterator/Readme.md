## What is Iterator design pattern?

The Iterator design pattern is a behavioral pattern that provides a way to access the elements of a collection without exposing the underlying implementation of the collection. The pattern decouples the iteration logic from the collection, allowing the collection to be modified without affecting the iteration logic.

## Use Cases
### Some common use cases for the Iterator pattern include:

* Iterating over the elements of a collection
* Implementing a custom data structure
* Implementing a parser for a programming language or markup language

## Example:

In Java, the Iterator design pattern is implemented through the java.util.Iterator interface and the java.util.Collection interface. The Iterator interface provides methods for iterating over a collection, including hasNext(), which returns true if there are more elements to iterate over, and next(), which returns the next element in the collection. The Collection interface provides a method called iterator(), which returns an Iterator object that can be used to iterate over the elements in the collection.
---
### Library example:

Consider the scenario where we have a collection of books in a library and we want to provide an Iterator to iterate over the books in the collection.

We can define a Book class with properties such as title, author, and publication year. Then we can create a Library class that represents the collection of books and provides an Iterator to iterate over the books in the collection.


