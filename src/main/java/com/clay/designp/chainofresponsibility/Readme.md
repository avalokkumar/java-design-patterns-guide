## What is the Chain of Responsibility design pattern?
* The Chain of Responsibility is a behavioral design pattern that chains a series of processing objects together to handle a request.
* Each processing object in the chain has the ability to handle the request or pass it on to the next processing object.
* The request is passed down the chain until one of the processing objects handles it, or the end of the chain is reached.

## When to use the Chain of Responsibility design pattern?
* The Chain of Responsibility pattern is used when you have a set of processing objects that can handle a request in different ways, and the client doesn't know which object will handle the request.
* It provides a way to decouple the sender of a request from its receiver, allowing multiple objects to handle the request without the client needing to know which object is actually handling it.
* It is useful when you have a complex workflow of processing objects that need to be applied to a request, where the objects can be added, removed, or modified dynamically.

## What type of problem does the Chain of Responsibility design pattern solve?
* The Chain of Responsibility pattern solves the problem of coupling the sender of a request to its receiver, by providing a way to pass the request through a chain of processing objects.
* It allows the objects to be decoupled from each other and allows for dynamic modification of the chain at runtime.
* It also allows for multiple objects to handle the request in different ways, without the client needing to know which object is actually handling it.

## Example:

Suppose you have a customer support system where customers can submit tickets to report issues they are experiencing with a product. The tickets can be categorized into three types: general inquiries, technical issues, and billing issues. Each ticket type is handled by a different team in the support department, with different levels of expertise. The teams are as follows:

* The general inquiries team handles tickets related to general questions about the product.
* The technical support team handles tickets related to technical issues with the product.
* The billing support team handles tickets related to billing issues, such as payment processing errors.

> Each team has a different level of expertise and should handle the ticket according to their level of responsibility. If a team cannot handle the ticket, it should be escalated to the next team in the chain until it is resolved.

