package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        String result;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el numero a evaluar: ");
        number = keyboard.nextInt();

        if (number >= 0) {
            result = "Positivo";
        } else {
            result = "Negativo";
        }

        System.out.println("El numero es: " + result);
    }
}
