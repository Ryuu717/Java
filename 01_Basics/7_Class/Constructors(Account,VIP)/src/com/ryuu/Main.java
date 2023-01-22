package com.ryuu;

public class Main {

    public static void main(String[] args) {
        //1. Without user info
        System.out.println("********************************************");
        VipPerson vip1 = new VipPerson();
        System.out.println(vip1.getName());
        System.out.println(vip1.getEmailAddress());

        //2. With name & creditlimit
        System.out.println("********************************************");
        VipPerson vip2 = new VipPerson("Bob", 25000.00);
        System.out.println(vip2.getName());

        //3. With name & creditlimit & email
        System.out.println("********************************************");
        VipPerson vip3 = new VipPerson("Ryuu", 100.00, "ryuu@email.com");
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmailAddress());




    }
}
