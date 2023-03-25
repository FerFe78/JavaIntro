package ejerciciosPracticos.dia4al6;

import java.util.*;

public class EjercicioExtra {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     */

    public void Ejercicio1() {
        Scanner read = new Scanner(System.in);
        int min, hours, days, minRes;
        System.out.println("Ingrese el tiempo en minutos que desee calcular");
        min = read.nextInt();
        if (min > 2880) {
            days = min / 1440;
            hours = (min % 1440) / 60;
            minRes = min % 60;
            System.out.println(days + " días, " + hours + " horas y " + minRes + " minutos.");
        } else if (min > 1440) {
            days = min / 1440;
            hours = (min % 1440) / 60;
            minRes = min % 60;
            System.out.println(days + " día, " + hours + " horas y " + minRes + " minutos.");
        } else if (min > 120) {
            hours = min / 60;
            minRes = min % 60;
            System.out.println(hours + " horas y " + minRes + " minutos.");
        } else {
            hours = min / 60;
            minRes = min % 60;
            System.out.println(hours + " hora y " + minRes + " minutos.");
        }
    }

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */

    public void Ejercicio2() {
        int A, B, C, D, X;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese 4 valores correspondientes a las variables A, B, C y D");
        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();
        System.out.println("Variable A = " + A);
        System.out.println("Variable B = " + B);
        System.out.println("Variable C = " + C);
        System.out.println("Variable D = " + D);
        X = D;
        D = B;
        B = C;
        C = A;
        A = X;
        System.out.println("Variable A = " + A);
        System.out.println("Variable B = " + B);
        System.out.println("Variable C = " + C);
        System.out.println("Variable D = " + D);
    }

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
     * la función equals() de la clase String.
     */

    public void Ejercicio3() {

        String letra;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        letra = read.next().toLowerCase();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
    }
    //Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.

    public void Ejercicio4() {
        int num;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10 para transformar a romano");
        num = read.nextInt();
        switch (num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("La opción seleccionada es incorrecta");
                break;
        }
    }

    /**
     * Una obra social tiene tres clases de socios: Los socios tipo ‘A’ abonan
     * una cuota mayor, pero tienen un 50% de descuento en todos los tipos de
     * tratamientos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un
     * 35% de descuento para los mismos tratamientos que los socios del tipo A.
     * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos. Solicite una letra (carácter) que representa
     * la clase de un socio, y luego un valor real que represente el costo del
     * tratamiento (previo al descuento) y determine el importe en efectivo a
     * pagar por dicho socio.
     */
    public void Ejercicio5() {
        String socio;
        double costo, coseguro;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio y costo del tratamiento ($)");
        socio = read.next().toUpperCase();
        costo = read.nextDouble();
        switch (socio) {
            case "A":
                coseguro = costo * 0.5;
                break;
            case "B":
                coseguro = costo * 0.65;
                break;
            default:
                coseguro = costo;
                break;
        }
        System.out.println("El tratamiento de un socio tipo " + socio + " tiene un costo de $ " + coseguro);
    }

    /**
     * Leer la altura de N personas y determinar el promedio de estaturas que se
     * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
     */

    public void Ejercicio6() {
        double estatura, promEstGen, promEstShort, sumaEstGen, sumaEstShort;
        int contEstGen, contEstShort;
        Scanner read = new Scanner(System.in);
        sumaEstGen = 0;
        contEstGen = -1;
        sumaEstShort = 0;
        contEstShort = -1;
        System.out.println("Ingrese las estaturas de los individuos de la muestra. Seleccione 0 para mostrar los resultados");
        do {
            estatura = read.nextDouble();
            sumaEstGen += estatura;
            contEstGen++;
            if (estatura < 1.60) {
                sumaEstShort += estatura;
                contEstShort++;
            }
        } while (estatura != 0);
        promEstGen = sumaEstGen / contEstGen;
        promEstShort = sumaEstShort / contEstShort;
        System.out.println("El promedio de estatura general es de: " + promEstGen + " muestra: " + contEstGen + " individuos");
        System.out.println("El promedio de estatura inferior a 1,60 m es de: " + promEstShort + " muestra: " + contEstShort + " individuos");

    }

    public void Ejercicio6b() {
        double estatura, promEstGen, promEstShort, sumaEstGen, sumaEstShort;
        int contEstGen, contEstShort;
        boolean fin;
        Scanner read = new Scanner(System.in);
        sumaEstGen = 0;
        contEstGen = 0;
        sumaEstShort = 0;
        contEstShort = 0;
        fin = true;
        System.out.println("Ingrese las estaturas de los individuos de la muestra. "
                + "Seleccione 0 para mostrar los resultados");
        estatura = read.nextDouble();
        while (fin) {
            sumaEstGen += estatura;
            contEstGen++;
            if (estatura == 0) {
                fin = false;
                break;
            } else if (estatura < 1.60) {
                sumaEstShort += estatura;
                contEstShort++;
            }
        }
        promEstGen = sumaEstGen / contEstGen;
        promEstShort = sumaEstShort / contEstShort;
        System.out.println("El promedio de estatura general es de: " + promEstGen
                + " muestra: " + contEstGen + " individuos");
        System.out.println("El promedio de estatura inferior a 1,60 m es de: "
                + promEstShort + " muestra: " + contEstShort + " individuos");

    }

    /**
     * Realice un programa que calcule y visualice el valor máximo, el valor
     * mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     * principio del programa y los números serán introducidos por el usuario.
     * Realice dos versiones del programa, una usando el bucle “while” y otra
     * con el bucle “do - while”.
     */
    public void Ejercicio7() {
        int n, valor, cont, suma, min, max;
        double prom;
        Scanner read = new Scanner(System.in);
        cont = 0;
        suma = 0;
        max = 0;
        min = 1000000;
        System.out.println("Ingrese la cantidad de valores a considerar");
        n = read.nextInt();
        System.out.println("Ingrese los valores");
        while (cont < n) {
            valor = read.nextInt();
            suma += valor;
            cont++;
            if (valor < min) {
                min = valor;
            } else if (valor > max) {
                max = valor;
            }
        }
        prom = suma / cont;
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor promedio: " + prom);
    }

    public void Ejercicio7b() {
        int n, valor, cont, suma, min, max;
        double prom;
        Scanner read = new Scanner(System.in);
        cont = 0;
        suma = 0;
        max = 0;
        min = 1000;
        System.out.println("Ingrese la cantidad de valores a considerar");
        n = read.nextInt();
        System.out.println("Ingrese los valores");
        do {
            valor = read.nextInt();
            suma += valor;
            cont++;
            if (valor < min) {
                min = valor;
            } else if (valor > max) {
                max = valor;
            }
        } while (cont < n);
        prom = suma / cont;
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Valor promedio: " + prom);
    }

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     */
    public void Ejercicio8() {
        int num, cont, contPar, contImpar;
        boolean fin;
        Scanner read = new Scanner(System.in);
        cont = 0;
        contPar = 0;
        contImpar = 0;
        System.out.println("Ingrese valores, si el valor ingresado es multiplo de 5 "
                + "saldra y mostrara resultados");
        do {
            num = read.nextInt();
            if (num > 0) {
                cont++;
                if (num % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
        } while (num % 5 != 0);
        System.out.println("Se han ingresado " + cont + " valores en total.");
        System.out.println("Se han ingresado " + contPar + " valores pares.");
        System.out.println("Se han ingresado " + contImpar + " valores impares.");
    }

    /**
     * Simular la división usando solamente restas. Dados dos números enteros
     * mayores que uno, realizar un algoritmo que calcule el cociente y el
     * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
     * obtener un resultado menor que el divisor, este resultado es el residuo,
     * y el número de restas realizadas es el cociente.
     */
    public void Ejercicio9() {
        int cociente, dividendo, divisor;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el dividendo y el divisor con los cuales desee operar");
        cociente = 0;
        dividendo = read.nextInt();
        divisor = read.nextInt();
        while (divisor < dividendo) {
            dividendo = dividendo - divisor;
            cociente++;
        }
        System.out.println("cociente = " + cociente);
        System.out.println("residuo = " + dividendo);
    }

    /**
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta. En
     * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente.
     */
    public void Ejercicio10() {
        int num1, num2;
        Scanner read = new Scanner(System.in);
        num2 = 0;
        num1 = (int) (Math.random() * 10);
        while (num1 != num2) {
            System.out.println("Ingrese un valor");
            num2 = read.nextInt();
            if (num1 != num2) {
                System.out.println("Respuesta incorrecta");
            } else {
                System.out.println("Respuesta correcta");
                break;
            }
        }
    }

    /**
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número
     * 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos
     * matemáticamente utilizando el operador de división. Nota: recordar que
     * las variables de tipo entero truncan los números o resultados.
     */
    public void Ejercicio11() {
        int num, cont;
        Scanner read = new Scanner(System.in);
        cont = 0;
        System.out.println("Ingrese el valor a considerar");
        num = read.nextInt();
        while (num > 0) {
            num = num / 10;
            cont++;
        }
        System.out.println("El valor ingresado tiene " + cont + " digitos.");
    }

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E.
     */
    public void Ejercicio12() {
        String cadena;
        int n;
        n = 0;
        do {

            cadena = Integer.toString(n);
            if (cadena.length() == 1) {
                cadena = "0" + "-" + "0" + "-" + cadena;
            } else if (cadena.length() == 2) {
                cadena = "0" + "-" + cadena.substring(0, 1) + "-" + cadena.substring(1, 2);
            } else {
                cadena = cadena.substring(0, 1) + "-" + cadena.substring(1, 2) + "-" + cadena.substring(2, 3);
            }
            if (cadena.contains("3")) {
                cadena = cadena.replace("3", "E");
            }
            System.out.println(cadena);
            n++;
        } while (n < 1000);

    }

    public void Ejercicio12b() {
        String iS, jS, kS;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    iS = Integer.toString(i);
                    jS = Integer.toString(j);
                    kS = Integer.toString(k);
                    if (iS.equals("3") ) {
                        iS = "E";
                    }
                    if(jS.equals("3")){
                        jS = "E";
                    }
                    if(kS.equals("3")){
                        kS = "E";
                    }
                    System.out.println(iS + "-" + jS + "-" + kS);
                }

            }

        }
    }
    /**Crear un programa que dibuje una escalera de números, donde cada línea de números 
     * comience en uno y termine en el número de la línea. Solicitar la altura de la 
     * escalera al usuario al comenzar.
     */
    
    public void Ejercicio13(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = read.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }    
    }
    /**Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad
     * de hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
     * cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
     */
    public void Ejercicio14(){
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int nFamilias = read.nextInt();

        int sumaEdades = 0;
        int totalHijos = 0;

        for (int i = 1; i <= nFamilias; i++) {
            System.out.printf("Ingrese la cantidad de hijos de la familia "+i+": ");
            int nHijos = read.nextInt();

            for (int j = 1; j <= nHijos; j++) {
                System.out.printf("Ingrese la edad del "+j+"° hijo de la familia "+i+": ");
                int edadHijo = read.nextInt();
                sumaEdades += edadHijo;
            }

            totalHijos += nHijos;
        }
        double mediaEdad = sumaEdades / totalHijos;
        System.out.printf("La media de edad de los hijos de todas las familias es: "+ mediaEdad);
        System.out.println("");
    }
}
