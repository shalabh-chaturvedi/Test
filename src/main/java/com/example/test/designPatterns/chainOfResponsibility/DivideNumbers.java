package com.example.test.designPatterns.chainOfResponsibility;

public class DivideNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperationType().equals("div")) {
            System.out.println(request.getNum1() / request.getNum2());
        } else {
            System.out.println("Invalid Input");
        }
    }
}
