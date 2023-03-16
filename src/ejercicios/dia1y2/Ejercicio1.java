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
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num1;
        Scanner read1 = new Scanner(System.in);
        int num2;
        System.out.println("Ingrese los dos valores a sumar");
        num1 = read.nextInt();
        num2 = read1.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de dichos numeros es: " + resultado);
         
    }
}
