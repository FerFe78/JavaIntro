/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.dia1y2;
import java.util.Scanner;
/**
 *
 * @author lopez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner read5 = new Scanner(System.in);
        int num3;
        System.out.println("Ingrese el número a operar");
        num3 = read5.nextInt();
        int doble = num3 *2;
        int triple = num3 * 3;
        double raizCuad = Math.sqrt(num3);
        System.out.println("El doble de " + num3 + " es: " + doble);
        System.out.println("El triple de " + num3 + " es: " + triple);
        System.out.println("La raiz cuadrada de " + num3 + " es: " + raizCuad);
    }
}
