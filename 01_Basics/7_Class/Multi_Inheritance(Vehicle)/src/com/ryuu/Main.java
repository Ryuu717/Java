package com.ryuu;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla(36);

        tesla.steer(45);
        System.out.println("****************************");
        tesla.accelerate(30);
        System.out.println("****************************");
        tesla.accelerate(20);
        System.out.println("****************************");
        tesla.accelerate(-42);

    }
}
