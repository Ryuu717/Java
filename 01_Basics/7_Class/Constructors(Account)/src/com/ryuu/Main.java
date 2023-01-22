package com.ryuu;

public class Main {

    public static void main(String[] args) {
        Account user1 = new Account();

        System.out.println("********************************************");
        System.out.println("User Number: " + user1.getNumber());
        System.out.println("User Balance: " + user1.getBalance());
        System.out.println("********************************************");

        user1.withdrawal(100.0);
        System.out.println("********************************************");

        user1.deposit(50.0);
        user1.withdrawal(100.0);
        System.out.println("********************************************");

        user1.deposit(50.0);
        user1.withdrawal(100.0);
    }
}
