package com.clay.designp.state;

public class NoCoinState implements VendingMachineState {
    private VendingMachine vendingMachine;
    
    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        vendingMachine.setCurrentState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert a coin first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert a coin first");
    }
}