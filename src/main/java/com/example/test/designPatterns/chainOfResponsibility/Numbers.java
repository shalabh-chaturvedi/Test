package com.example.test.designPatterns.chainOfResponsibility;

public class Numbers {
    private int num1;
    private int num2;

    private String OperationType;

    public Numbers(int num1, int num2, String OperationType) {
        this.num1 = num1;
        this.num2 = num2;
        this.OperationType = OperationType;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperationType() {
        return OperationType;
    }

    public void setOperationType(String operationType) {
        OperationType = operationType;
    }
}
