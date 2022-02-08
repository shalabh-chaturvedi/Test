package com.example.test.designPatterns.chainOfResponsibility;

public class AddNumbers implements Chain{

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperationType().equals("add")) {
            System.out.println(request.getNum1() + request.getNum2());
        } else {
            nextInChain.calculate(request);
        }
    }
}
