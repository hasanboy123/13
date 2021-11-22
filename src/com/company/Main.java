package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setPassvord("pass");
        bank.setAmount(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("parolni yozning");
        if (scanner.nextLine().equals(bank.getPassvord())) {
            System.out.println("hush kelibsiz");
            System.out.println("sizga necha pul kerak");
            int take = scanner.nextInt();
            if (take <= bank.getAmount()) {
                bank.setAmount(bank.getAmount() - take);
                System.out.println("sizni hisobingizda" + " " + bank.getAmount() + " " + "pul bor");
            } else {
                System.out.println("sizni hisobingizda uncha pul yoq");
            }

        } else {
            System.out.println("notogri parol");


        }
    }
}