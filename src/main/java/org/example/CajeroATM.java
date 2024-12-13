package org.example;

import java.util.Scanner;

public class CajeroATM {
    String pin = "1234";
    double balance = 15000.03;

    public void displayMenu() {
        System.out.println("Opciones del ATM:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("Selecciona una opción:");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                this.consultBalance();
                break;
            case 2:
                //depositMoney();
                System.out.println("2. Consultar saldo");
                break;
            case 3:
                //withdrawMoney();
                System.out.println("3. Consultar saldo");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public void consultBalance(){
        System.out.println("Ingrese su PIN:");
        Scanner insertPin = new Scanner(System.in);
        String pinParsed = insertPin.toString();
        boolean isAuthinticated = this.authenticateUser(pinParsed);
        if (isAuthinticated) {
            System.out.println("Tu saldo actual es de: " + this.balance);
        } else {
            System.out.println("Error de autentición");
        }
    }

    public boolean authenticateUser(String inputPin) {
        int attempts = 0;
        while (attempts < 3) {
            if (this.pin.equals(inputPin)) {
                return true;
            } else {
                attempts++;
                System.out.println("PIN incorrecto. Intento " + attempts + " de 3.");
            }
        }
        return false;
    }

}