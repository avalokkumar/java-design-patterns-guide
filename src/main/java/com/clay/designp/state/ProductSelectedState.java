package com.clay.designp.state;

public class ProductSelectedState implements VendingMachineState {
    private VendingMachine vendingMachine;
    
    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("You have already inserted a coin");
    }

    @Override
    public void selectProduct() {
        System.out.println("You have already selected a product");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product delivered");
        vendingMachine.setCurrentState(vendingMachine.getProductDeliveredState());
    }
}