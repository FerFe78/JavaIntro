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
public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read.nextLine();
        String fraseMay = frase.toUpperCase();
        System.out.println(fraseMay);
        String fraseMin = frase.toLowerCase();
        System.out.println(fraseMin);
    }
}
