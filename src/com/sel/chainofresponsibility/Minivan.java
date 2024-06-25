package com.sel.chainofresponsibility;

class Minivan extends CarrierHandler {
	
    @Override
    protected boolean canHandleRequest(String request) {
        return request.equals("little than 500 kg");
    }

    @Override
    protected void handle(String request) {
        System.out.println("Minivan handled the request: I can carry load " + request);
    }
}