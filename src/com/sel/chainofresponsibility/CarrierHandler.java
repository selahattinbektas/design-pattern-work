package com.sel.chainofresponsibility;

public abstract class CarrierHandler {

    protected CarrierHandler nextObjectInChain;

    public void setNextHandler(CarrierHandler nextHandler) {
        this.nextObjectInChain = nextHandler;
    }

    public void handleRequest(String request) {
        if (canHandleRequest(request)) {
            handle(request);
        } else if (nextObjectInChain != null) {
        	nextObjectInChain.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    protected abstract boolean canHandleRequest(String request);

    protected abstract void handle(String request);
}
