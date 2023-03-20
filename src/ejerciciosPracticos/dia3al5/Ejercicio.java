package ejerciciosPracticos.dia3al5;
import java.util.*;
public class Ejercicio {
    
    //Crear un programa que dado un número determine si es par o impar.
    public void Ejercicio1 () {
        Scanner read = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un valor");
        num1 = read.nextInt();
        if ( num1 % 2 == 0){
            System.out.println("El valor ingresado es par");
        }else{
            System.out.println("El valor ingresado es impar");
        }
    }
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
    Nota: investigar la función equals() en Java.
    */
    public void Ejercicio2 () {
        Scanner read = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la contraseña");
        frase = read.nextLine();
        if(frase.toLowerCase().equals("eureka")){
            System.out.println("Correcto");
        } else { System.out.println("Anda paya");
        }
    } 
    /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
    por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java.*/
    public void Ejercicio3 () {
        Scanner read = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = read.next();
        if (palabra.length() == 8){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
    /*Escriba un programa que pida una frase o palabra y valide si la primera letra de 
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.*/
    
    public void Ejercicio4(){
        Scanner read = new Scanner(System.in).useDelimiter("n/");//evito utilizar el nextLine
        String palabra;
        System.out.println("Ingrese una frase o palabra");
        palabra = read.nextLine();
        String a = "A";
        if (palabra.startsWith(a)){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
    
    public void Ejercicio5 (){
        Scanner read = new Scanner(System.in);
        int limite;
        System.out.println("Ingrese el límite deseado");
        limite = read.nextInt();
        int suma = 0;
        while (limite >= suma){
            int num;
            System.out.println("Ingrese un valor");
            num = read.nextInt();
            suma += num;
        }
        System.out.println("Ha superado el límite");
    }
    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
    el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
    por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
    Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/
    
    public void Ejercicio6 (){
        int num1, num2, option;
        boolean salir = false;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos valores para operar");
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        do {
            //System.out.println("MENU"+\n"1. Sumar"+\n"2. Restar"+\n"3. Multiplicar"+\n"4. Dividir"+\n"5. Salir"+\n"Elija opción");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción");
            option = read.nextInt();
            switch (option){
                case 1:
                    int suma;
                    suma = num1 + num2;
                    System.out.println(num1 +" + "+ num2 +" = "+ suma);
                    break;
                case 2:
                    int resta;
                    resta = num1 - num2;
                    System.out.println(num1 +" - "+ num2 +" = "+ resta);
                    break;
                case 3:
                    int mult;
                    mult = num1 * num2;
                    System.out.println(num1 +" x "+ num2 +" = "+ mult);
                    break;
                case 4:
                    double div;
                    div = num1 / num2;
                    System.out.println(num1 +" / "+ num2 +" = "+ div);
                    break;
                case 5:
                    String sale;
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    sale = read.next().toUpperCase();
                    if(sale.equals("S")){
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("La opción seleccionada es incorrecta");
            } 
        }while (!salir);
    }
    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
    fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
    ser X y el último tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
    “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE,
    que no respete el formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
    e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
    siguientes funciones de Java Substring(), Length(), equals().*/
    
    public void Ejercicio7 (){
        String secuencia;
        boolean FDE;
        int lecCorrectas;
        int lecIncorrectas;
        lecCorrectas = 0;
        lecIncorrectas = 0;
        Scanner read = new Scanner(System.in);
        FDE = false;
        do {
            System.out.println("Ingrese secuencia");
            secuencia = read.next();
            if (secuencia.length() == 5){
                if(secuencia.equals("&&&&&")){
                    FDE = true;
                }else if (secuencia.substring(0,1).equals("X") && secuencia.substring(4,5).equals("O")){
                    lecCorrectas += 1;
                }else {
                    lecIncorrectas += 1;
                }
            }else {
                lecIncorrectas += 1;
            }
        }while (!FDE);
        System.out.println("Lecturas correctas: "+ lecCorrectas);
        System.out.println("Lecturas incorrectas: "+ lecIncorrectas);        
    }
    //Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
    public void Ejercicio8 (){
        int lado;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la medida de los lados");
        lado = read.nextInt();
        int i,j;
        for (i = 0; i < lado;i++){
            for (j = 0; j < lado; j++){
                if(i == 0 || i == lado-1 || j == 0 || j == lado-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");    
        }
    }
}