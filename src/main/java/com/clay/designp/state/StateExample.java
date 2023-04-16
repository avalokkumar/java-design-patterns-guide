package com.clay.designp.state;

public class StateExample {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin();
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        vendingMachine.selectProduct(); // should display "Please insert a coin first"
        vendingMachine.insertCoin();
        vendingMachine.insertCoin(); // should display "You have already inserted a coin"
        vendingMachine.selectProduct();
        vendingMachine.dispenseProduct();
        vendingMachine.insertCoin(); // should display "Please collect your product first"
        vendingMachine.selectProduct(); // should display "Please insert a coin first"
        vendingMachine.dispenseProduct(); // should display "Please insert a coin first"
    }
}
