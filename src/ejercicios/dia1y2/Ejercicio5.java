
package ejercicios.dia1y2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el número a operar");
        num = read.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        double raizCuad = Math.sqrt(num);
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
        System.out.println("La raiz cuadrada de " + num + " es: " + raizCuad);
    }
}
