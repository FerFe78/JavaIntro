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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = read.next();
        Scanner read1 = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = read1.nextInt();
        System.out.println("Hola mundo soy "+ nombre +" tengo "+ edad + 
                " años y estoy programando en Java");
    }
}
