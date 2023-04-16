package com.clay.designp.state;

public class CoinInsertedState implements VendingMachineState {
    private VendingMachine vendingMachine;
    
    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("You have already inserted a coin");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected");
        vendingMachine.setCurrentState(vendingMachine.getProductSelectedState());
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select a product first");
    }
}