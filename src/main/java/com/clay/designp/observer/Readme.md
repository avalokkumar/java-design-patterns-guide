## Observer design pattern

The Observer design pattern is a behavioral pattern that defines a one-to-many dependency between objects, where one object (called the subject) changes its state and notifies all its dependent objects (called observers) automatically. The observer pattern promotes loose coupling between objects, allowing for better scalability and maintainability of code.

> In the Observer pattern, the subject maintains a list of its observers, and each observer subscribes to the subject to receive updates. When the state of the subject changes, it notifies all the observers by calling their update method, passing in the new state. The observers then perform any necessary actions based on the new state.

### Some common use cases for the Observer pattern include:

#### Notifications: 
* When you need to send notifications to multiple objects about a change in state of a single object, the Observer pattern can be used to simplify the notification process.

#### User interfaces: 
* The Observer pattern is commonly used in user interface programming to keep different parts of the interface synchronized with each other. For example, when the user changes the selected item in a drop-down list, the Observer pattern can be used to update the corresponding data in other parts of the user interface.

#### Logging and error handling: 
* The Observer pattern can be used to notify multiple logging and error-handling objects when an error occurs in the system.

#### Distributed systems: 
* In distributed systems, the Observer pattern can be used to notify different nodes about changes in the state of a single node, or to synchronize the state of different nodes.

#### Event-driven programming: 
* The Observer pattern can be used to handle events in event-driven programming, where multiple objects may need to respond to the same event.


### Example

Let's consider a weather station application that provides real-time weather updates to its subscribers. In this scenario, the weather station acts as the subject, while the subscribers act as the observers.

The WeatherStation class will be the subject, which will have a list of observers that it needs to notify when the weather changes. The WeatherData class will hold the current weather data that the observers will receive.