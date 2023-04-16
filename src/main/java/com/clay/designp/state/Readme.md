## State design pattern

The State design pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. It involves creating different states, each representing a different behavior, and allowing the object to transition between these states when its state changes. This pattern is useful when an object needs to change its behavior depending on its internal state, and when a lot of conditional statements are used to manage the object's behavior.

### Some use cases for the State pattern include:

#### Traffic lights: 
* A traffic light has three states - red, yellow, and green. The behavior of the traffic light changes based on the current state.

#### Audio player: 
* An audio player has different states such as playing, paused, and stopped. The behavior of the audio player changes based on the current state.

#### Order processing: 
* An order can have different states such as received, processing, shipped, and delivered. The behavior of the order processing system changes based on the current state.

#### User authentication: 
* A user's authentication status can have different states such as logged in, logged out, or inactive. The behavior of the user's account changes based on the current state.


### Example:

Let's consider an example of a vending machine. A vending machine can have several states, such as 'No coin', 'Coin inserted', 'Product selected', and 'Product delivered'. Depending on the current state of the vending machine, the user can perform different actions, such as inserting a coin, selecting a product, and so on.

We can use the State design pattern to implement the vending machine. First, we create an interface called VendingMachineState, which defines the common methods for all the states. Then, we create concrete classes for each state, which implement the VendingMachineState interface and provide the specific behavior for that state.

