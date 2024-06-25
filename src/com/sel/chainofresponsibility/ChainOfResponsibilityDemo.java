package com.sel.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
       
        CarrierHandler minivan = new Minivan();
        CarrierHandler van = new Van();
        CarrierHandler truck = new Truck();
        
        minivan.setNextHandler(van);
        van.setNextHandler(truck);
        
        
        minivan.handleRequest("little than 500 kg");
        minivan.handleRequest("between 500 kg and 1000 kg");
        minivan.handleRequest("between 1000 kg and 2500 kg");
        minivan.handleRequest("unknown kilogram");
    }
}