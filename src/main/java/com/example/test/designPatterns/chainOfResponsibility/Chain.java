package com.example.test.designPatterns.chainOfResponsibility;

public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);
}
