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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner read4 = new Scanner(System.in);
        int celsius;
        System.out.println("Ingrese °C a convertir");
        celsius = read4.nextInt();
        int farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + "°C equivalen a " + farenheit + "°F");
        
    }
}
