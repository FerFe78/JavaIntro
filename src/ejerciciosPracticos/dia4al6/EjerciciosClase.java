
package ejerciciosPracticos.dia4al6;
import java.util.*;
public class EjerciciosClase {
    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
    public void Ejercicio1(){
        int min, horas, dias, minResto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los minutos a calcular");
        min = scanner.nextInt();
        dias = min/1440;
        horas = min%1440 /60;
        System.out.println("dia: "+ dias +" hora: "+horas);
    }
    /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A,
A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar*/
    public void Ejercicio2(){
        int A,B,C,D,X;
        A = 10;
        B = 20;
        C = 30;
        D = 40;
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
        X=D;
        D=B;
        B=C;
        C=A;
        A=X;
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
    public void Ejercicio3(){
        String letra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        letra = scanner.next().toUpperCase();
        if (letra.equals("A") || letra.equals("E") ||letra.equals("I") ||letra.equals("O") ||letra.equals("U") ) {
            System.out.println("La letra ingresada es una vocal");
        }else{
            System.out.println("La letra ingresada es una consonante");
        }
    }
    
}
