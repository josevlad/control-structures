package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double dressCost;
        double discountDress;
        double totalPayment;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el coste del traje: ");
        dressCost = keyboard.nextDouble();

        if (dressCost >= 2500) {
            discountDress = dressCost * 0.15;
        } else {
            discountDress = dressCost * 0.08;
        }

        totalPayment = dressCost - discountDress;

        System.out.printf(
                "El presio final es: %.2f\nEl descruento es: %.2f",
                totalPayment,
                discountDress
        );
//        System.out.print("El presio final es: " + totalPayment);
//        System.out.print("El descruento es: " + discountDress);
    }
}