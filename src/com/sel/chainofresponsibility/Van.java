package com.sel.chainofresponsibility;

public class Van extends CarrierHandler {
	
    @Override
    protected boolean canHandleRequest(String request) {
        return request.equals("between 500 kg and 1000 kg");
    }

    @Override
    protected void handle(String request) {
        System.out.println("Van handled the request: I can carry load " + request);
    }
}