package ejerciciosPracticos.dia1y2;
import java.util.*;
public class Ejercicio {
    public void  Ejercicio1 (){
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese los dos valores a sumar");
        num1 = read.nextInt();
        num2 = read.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de dichos numeros es: " + resultado);
    }
    public void Ejercicio2 (){
        Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = read.next();
        System.out.println("Hola " + nombre);
    }
    public void Ejercicio3 (){
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read.nextLine();
        String fraseMay = frase.toUpperCase();
        System.out.println(fraseMay);
        String fraseMin = frase.toLowerCase();
        System.out.println(fraseMin);
    }
    public void Ejercicio4 (){
        Scanner read = new Scanner(System.in);
        double celsius;
        System.out.println("Ingrese °C a convertir");
        celsius = read.nextDouble();
        double farenheit = 32 + (9 * celsius / 5);
        System.out.println(celsius + "°C equivalen a " + farenheit + "°F");   
    }
    public void Ejercicio5 (){
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
