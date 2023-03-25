package javaintro.ejerciciospdf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio ejercicio = new Ejercicio();
        ejercicio.Ejercicio11();
        Scanner read = new Scanner(System.in);
        String frase = read.nextLine();
        String retorno = Ejercicio11(frase);
        System.out.println(retorno);
        */
        System.out.println(esMultiplo(10,6));
    }
    public static String Ejercicio11(String frase) {
        String newFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            String buscaVocal = frase.substring(i, i + 1).toLowerCase();
            System.out.println("");
            switch (buscaVocal) {
                case "a":
                    newFrase=newFrase.concat("@");
                    break;
                case "e":
                    newFrase=newFrase.concat("#");
                    break;
                case "i":
                    newFrase=newFrase.concat("$");
                    break;
                case "o":
                    newFrase=newFrase.concat("%");
                    break;
                case "u":
                    newFrase=newFrase.concat("*");
                    break;
                default:
                    newFrase=newFrase.concat(buscaVocal);;
            }
        }
        return newFrase;
    }
    /**Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
     * validando que el primer número múltiplo del segundo e imprima si el primer número 
     * es múltiplo del segundo, sino informe que no lo son.
     */
    public static boolean esMultiplo(int a,int b){
        int retorno = a % b;
        if (retorno == 0){
            return true;
        }else {
            return false;
        }
    }
    
}
