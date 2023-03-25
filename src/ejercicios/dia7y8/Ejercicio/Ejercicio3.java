package ejercicios.dia7y8.Ejercicio;

import java.util.Scanner;

public class Ejercicio3 {
    
    /**Crea una aplicación que a través de una función nos convierta una cantidad 
     * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
     * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
     * moneda a convertir que será una cadena, este no devolverá ningún valor y
     * mostrará un mensaje indicando el cambio (void).
     */

    public static void main(String[] args) {
        double euros = ingresoEuro();
        cambio(euros);
        System.out.println("Gracias por usar este programa");
    }

    public static void cambio(double cantEuros) {
        Scanner read = new Scanner(System.in);
        boolean exit = false;
        int menu;
        while (exit == false) {
            System.out.println("Ingrese a que divisa desea convertir la cantidad de euros ingresada");
            System.out.println("1.Libras");
            System.out.println("2.dolares");
            System.out.println("3.Yenes");
            System.out.println("4.Ingresar otro monto");
            System.out.println("5.Salir");
            menu = read.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(cantEuros + " son " + (cantEuros * 0.86) + " libras.");
                    break;
                case 2:
                    System.out.println(cantEuros + " son " + (cantEuros * 1.28611) + " dolares.");
                    break;
                case 3:
                    System.out.println(cantEuros + " son " + (cantEuros * 129.852) + " yenes.");
                    break;
                case 4:
                    cantEuros = ingresoEuro();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida.");
                    break;
            }
        }
    }

    public static double ingresoEuro() {
        Scanner read = new Scanner(System.in);
        double euros = 0;
        System.out.println("Ingrese la cantidad de euros que desea convertir a otra divisa: ");
        euros = read.nextDouble();
        return euros;
    }
}


