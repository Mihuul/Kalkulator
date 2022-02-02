package com.kalkulator;

public class Calculator {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double substracting(double a, double b) {
        return a - b;
    }

    public double addition(double a, double b){
        return a + b;
    }
}
