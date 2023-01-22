package com.ryuu;

public class Main {

    public static void main(String[] args) {
	    Account ryuusAccount = new Account("ryuu");
        ryuusAccount.deposit(1000);
        ryuusAccount.withdraw(500);
        ryuusAccount.withdraw(-200);
        ryuusAccount.deposit(-20);
        ryuusAccount.calculateBalance();
        ryuusAccount.balance = 5000;     //-->private(can not access)

        System.out.println("Balance on account is " + ryuusAccount.getBalance());
        ryuusAccount.transactions.add(4500);
        ryuusAccount.calculateBalance();
    }
}
