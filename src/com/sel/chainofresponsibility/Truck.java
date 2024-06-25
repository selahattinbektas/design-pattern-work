package com.sel.chainofresponsibility;

public class Truck extends CarrierHandler {
	
    @Override
    protected boolean canHandleRequest(String request) {
        return request.equals("between 1000 kg and 2500 kg");
    }

    @Override
    protected void handle(String request) {
        System.out.println("Truck handled the request: I can carry load " + request);
    }
}