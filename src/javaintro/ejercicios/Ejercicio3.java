/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro.ejercicios;
import java.util.Scanner;
/**
 *
 * @author lopez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Scanner read1 = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros con los cuales quiera operar");
        num1 = read.nextInt();
        num2 = read1.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;
        int mod = num1 % num2;
        boolean logic = num1 > num2;
        boolean logic1 = num1 < num2;
        boolean logic2 = num1 == num2;
        boolean logic3 = num1 != num2;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + mult);
        System.out.println("El resultado de la division es: " + div);
        System.out.println("El resto de la division es: " + mod);
        System.out.println("El primer valor es mayor al segundo: " + logic);
        System.out.println("El primer valor es menor al segundo: " + logic1);
        System.out.println("Ambos valores son iguales: " + logic2);
        System.out.println("Ambos valores son distintos: " + logic3);
        System.out.println("El primer valor incrementado en 1 es: " + num1++);
        System.out.println("El primer valor decrementado en 1 es: " + num1--);
        System.out.println("El segundo valor incrementado en 1 es: " + num2++);
        System.out.println("El segundo valor decrementado en 1 es: " + num2--);
        System.out.println(num1++ + " "+ num2++);
        System.out.println(num1++ + " "+ num2++);
        System.out.println(num1++ + " "+ num2++);
        System.out.println(num1++ + " "+ num2++);
        System.out.println(num1-- + " "+ num2--);
        System.out.println(num1-- + " "+ num2--);
        System.out.println(num1-- + " "+ num2--);
        System.out.println(num1-- + " "+ num2--);
    }
}
