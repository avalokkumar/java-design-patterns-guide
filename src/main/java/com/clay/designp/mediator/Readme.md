## Mediator Design Pattern

The Mediator design pattern is a behavioral pattern that defines an object (called mediator) that encapsulates the communication and coordination between multiple objects. It promotes loose coupling between objects and allows them to interact with each other without being tightly coupled. The mediator acts as an intermediary between objects and facilitates their communication by relaying messages between them.

The Mediator pattern is particularly useful in complex systems where there are multiple objects that need to interact with each other in a structured way. It is especially useful when:

* A system contains many objects that need to communicate with each other, and the interactions between them are complex and hard to understand.

* A change in one object requires a change in other objects, and the number of objects that need to change is unknown.

* Objects need to communicate with each other in a way that is decoupled from their implementation.

* The system needs to be organized in a way that is easily extensible.

### Here are some of the use cases where Mediator design pattern can be applied:

#### Chat applications: 
In a chat application, multiple users need to interact with each other. The Mediator pattern can be used to manage the communication between users by acting as a central hub for relaying messages between them.

#### Air traffic control: 
In an air traffic control system, multiple planes need to communicate with each other to avoid collisions. The Mediator pattern can be used to manage the communication between planes by acting as a central hub for relaying messages between them.

#### Online marketplaces: 
In an online marketplace, multiple sellers need to interact with multiple buyers. The Mediator pattern can be used to manage the communication between sellers and buyers by acting as a central hub for relaying messages between them.

#### GUI applications: 
In a GUI application, multiple components may need to interact with each other. The Mediator pattern can be used to manage the communication between components by acting as a central hub for relaying messages between them.

#### Online gaming: 
In an online game, multiple players need to interact with each other. The Mediator pattern can be used to manage the communication between players by acting as a central hub for relaying messages between them.


### Example

Let's say we have a chat application where multiple users can join and send messages to each other. We can implement the Mediator pattern to handle communication between the users without them needing to know about each other's existence.
