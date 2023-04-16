package com.clay.designp.state;

public class VendingMachine {
    private VendingMachineState currentState;
    private VendingMachineState noCoinState;
    private VendingMachineState coinInsertedState;
    private VendingMachineState productSelectedState;
    private VendingMachineState productDeliveredState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        productSelectedState = new ProductSelectedState(this);
        productDeliveredState = new ProductDeliveredState(this);

        currentState = noCoinState;
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public VendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public VendingMachineState getCoinInsertedState() {
        return coinInsertedState;
    }

    public VendingMachineState getProductSelectedState() {
        return productSelectedState;
    }

    public VendingMachineState getProductDeliveredState() {
        return productDeliveredState;
    }
}