package javaintro.ejerciciospdf;
import java.util.Scanner;
public class Ejercicio {
    
    public void Ejercicio1y2 () {    
        byte b = 7; // entero 8 bits val min= -128, max=127
        short num1 = 1000;// entero 16 bits val min= -32,768 max= 32,767
        int num2 = 5861;// entero 32 bits val min= -2,147,483,648 max= 214748364
        long num3 = 186315658;// entero 64 bits val min= -9,223,372,036,854,775,808 max=9,223,372,036,854,775,807
        float dicimal1 = 5.94f;// decimal de precision simple de 32 bits (IEEE 754 punto flotante)
        double decimal2 = 32.85d;// decimal de precision simple de 64 bits (IEEE 754 punto flotante)
        char letra = 'a';// carácter simple unicode de 16 bits val min='\u0000'(en entero 0) max='\uffff' (en entero 65,535)
        String cadena = "Fernando";//Java provee también un soporte especial para cadena de caracteres a través de la clase String.
        boolean bool = true;// true or false
    }
    public void Ejercicio3() {
    
        
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
     public void Ejercicio4() {
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
      public void Ejercicio6 () {
        Scanner read = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos valores enteros");
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        if(num1 > 25){
        System.out.println("El primer número ingresado es mayor a 25");
        }else if(num2 > 25){
            System.out.println("El segundo número ingresado es mayor a 25");
        }else {
            System.out.println("Ambos números ingresados son menores a 25");
        }
        
    }
      public void Ejercicio7 () {
        Scanner read = new Scanner(System.in);
        int motor;
        System.out.println("Ingrese el tipo de motor");
        motor = read.nextInt();
        switch (motor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
             
                  
        }
                
    }
/*Escriba un programa que valide si una nota está entre 0 y 10,sino está 
      entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/
      public void Ejercicio8 () {
    
        Scanner read = new Scanner(System.in);
        int nota;
        
        do {
            System.out.println("Ingrese una nota");
            nota = read.nextInt();
        
        }while (nota < 0 || nota > 10);
         System.out.println("Ha ingresado la nota correcta");
                 
    }
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero
 se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
 El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
 pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
      public void Ejercicio9 () {
        Scanner read = new Scanner(System.in);
        int number, suma;
        suma = 0;
        number = 0;
        for (int i = 0; i < 20; i ++){
            System.out.println("Ingrese un número");
            number = read.nextInt();
            suma =+ number;
            if(number == 0){
            System.out.println("Se capturo el número 0");
            System.out.println("La suma de los número ingresados hasta ahora es de " + suma);
            break;
            }
        }
        if(number != 0){
        System.out.println("La suma de los número ingresados es de " + suma);
        }
    }
      /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
      imprima el número ingresado seguido de tantos asteriscos como indique su valor.*/
      
      public void Ejercicio10 (){
        Scanner read = new Scanner(System.in);
        int number;
        
        for(int i = 0; i < 4; i++){
            do {
                System.out.println("Ingrese un número entre 0 y 20");
                number = read.nextInt();
     
            }while(number < 0 || number > 20 );
            System.out.print(number + " ");
            for(int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println("");
        }  
    }
}

