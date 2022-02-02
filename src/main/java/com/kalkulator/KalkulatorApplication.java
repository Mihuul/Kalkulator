package com.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double calAddition = calculator.addition(10, 5);
        double calSubstraction = calculator.substracting(10, 5);
        System.out.println(calAddition);
        System.out.println(calSubstraction);
    }
}
