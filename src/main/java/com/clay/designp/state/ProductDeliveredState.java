package com.clay.designp.state;

public class ProductDeliveredState implements VendingMachineState {
    private VendingMachine vendingMachine;
    
    public ProductDeliveredState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Please collect your product first");
    }

    @Override
    public void selectProduct() {
        System.out.println("Please collect your product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect your product first");
    }
}