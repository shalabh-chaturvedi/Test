package com.example.test.designPatterns.chainOfResponsibility;

public class MultiplyNumbers implements Chain{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperationType().equals("mul")) {
            System.out.println(MultiplyNumbers.class.getSimpleName() + " invoked");
            System.out.println(request.getNum1() * request.getNum2());
        } else {
            nextInChain.calculate(request);
        }
    }
}
