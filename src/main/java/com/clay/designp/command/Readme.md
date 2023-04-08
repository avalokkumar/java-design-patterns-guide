## What is the Command Pattern?

The Command design pattern is a behavioral design pattern that encapsulates a request as an object, allowing the request to be treated as a first-class citizen and passed as a parameter to other methods or objects.

* It separates the request for an action from the actual execution of that action.
* A Command object encapsulates a request as an object, allowing it to be passed around as a parameter to other methods or objects.
* The Command pattern promotes loose coupling between the object that requests the action and the object that performs the action.
* The Command pattern allows for greater flexibility in the system's design, by allowing commands to be executed immediately, queued up for later execution, or sent over a network to be executed on a remote machine.


## When to use the Command design pattern?

* When you want to decouple the object that sends a request from the object that actually performs the action. The Command pattern encapsulates a request as an object, allowing it to be passed around and executed by different objects without the sender needing to know anything about the receiver.

* When you want to allow for flexible and extensible systems. By encapsulating commands as objects, the Command pattern allows for commands to be executed immediately, queued up for later execution, or even sent over a network to be executed on a remote machine. This makes it easier to design systems that can be easily extended and adapted to new requirements.

* When you want to implement advanced features like logging, undo-redo functionality, or transactional behavior. By keeping track of the commands that have been executed, the Command pattern makes it possible to implement features like logging or undo-redo functionality. It also allows you to group multiple commands together as a single transaction, so that they can be executed atomically.

* When you want to simplify complex conditional logic. By encapsulating different branches of code in separate command objects, the Command pattern can help simplify complex conditional logic. This can make the code easier to read and understand, and also easier to modify and maintain.

* When you want to implement user interfaces or other systems that perform actions. The Command pattern is commonly used in user interfaces to implement menus, toolbars, or other elements that perform actions. It can also be used to implement macro recording and playback systems, or remote procedure call systems.

## Example
Let's say we're building a home automation system that allows users to control various appliances and devices in their home. We want to implement a system that allows users to create custom "scenes" that can turn multiple devices on or off with a single command. For example, a user might want to create a "Movie Night" scene that turns off the lights, turns on the TV, and dims the volume of the sound system.




