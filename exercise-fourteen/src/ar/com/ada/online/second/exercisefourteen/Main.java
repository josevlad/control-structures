package ar.com.ada.online.second.exercisefourteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int destinationArea;
        int weight;
        double deliveryCost;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Selecciones la zona de destino");
        System.out.println("[1] America del norte [2] America central [3] America del sur [4] Europa [5] Asia: ");
        destinationArea = keyboard.nextInt();

        System.out.println("Ingrese el peso del paquete (grms)");
        weight = keyboard.nextInt();

        if (weight > 5000) {
            System.out.println("No se puede enviar un paquete mayor a 5 kg");
        } else {
            switch (destinationArea) {
                case 1:
                    deliveryCost = weight * 11;
                    break;
                case 2:
                    deliveryCost = weight * 10;
                    break;
                case 3:
                    deliveryCost = weight * 12;
                    break;
                case 4:
                    deliveryCost = weight * 24;
                    break;
                case 5:
                    deliveryCost = weight * 27;
                    break;
                default:
                    deliveryCost = 0;
                    System.out.println("Nuemro de destino invalido");
            }

            System.out.println("El coste de envio es: " + deliveryCost);
        }

    }
}
