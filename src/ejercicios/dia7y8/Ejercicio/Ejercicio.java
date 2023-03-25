package ejercicios.dia7y8.Ejercicio;

import java.util.Scanner;


public class Ejercicio {

    public static class ejercicio1 {

        public static void main(String[] args) {
            int num1, num2, opcion;
            System.out.println("Ingrese dos numeros");
            Scanner leer = new Scanner(System.in);
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("Ingrese una de las opciones: ");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(suma(num1, num2));
                    break;
                case 2:
                    System.out.println(resta(num1, num2));
                    break;
                case 3:
                    System.out.println(divide(num1, num2));
                    break;
                case 4:
                    System.out.println(multiplica(num1, num2));
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        public static int suma(int num1, int num2) {
            int suma = num1 + num2;
            return suma;
        }
        public static int resta(int num1, int num2) {
            int resta = num1 - num2;
            return resta;
        }
        public static double divide(int num1, int num2) {
            double divide = num1 / num2;
            return divide;
        }
        public static int multiplica(int num1, int num2) {
            int multiplica = num1 * num2;
            return multiplica;
        }
    }
    public static class ejercicio2 {

        public static void main(String[] args) {
            int edad;
            String nombre, opc;
            boolean resp = true;
            Scanner leer = new Scanner(System.in);
            do {
                System.out.println("Ingrese el nombre");
                nombre = leer.next();
                System.out.println("Ingrese la edad");
                edad = leer.nextInt();
                mas18(nombre,edad);
                System.out.println("Desea ingresar mas datos (S/N?");
                opc = leer.next();
                if (opc.equalsIgnoreCase("N")) {
                    resp = false;
                }

            } while (resp);
        }

        public static void mas18(String nombre, int edad) {
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");

            } else {
                System.out.println(nombre + " es menor de edad");

            }
        }
    }
}

    
    
    


