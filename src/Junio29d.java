import java.util.Scanner;

public class Junio29d {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = contadorDigitos(numero); //invocar y usar funcion auxiliar creada abajo (contadorDigitos)
        System.out.println(resultado); // imprime la variable resultado que uso la variable de abajo
    }
    // funcion auxiliar que va a retornar la cantidad de digitos que tiene un numero:
    public static int contadorDigitos(int numero){
        // 1990 -> 4 digitos -ejemplo
        int cifras = 0; // la variable cifras arranca en 0
        while(numero!=0){ // mientras que el numero no sea '0' el while sigue entrando
            //se pone diferente (!=) porque vamor a estar dividiendo el numero entre 10
            numero /= 10; // con el ejemplo 1990 al dividirlo entre 10 da 199, como este sigue siendo diferente de '0' se ejecuta la division otra vez y asi hasta que de '0' como resultado.
            cifras ++; // la variable cifras aumenta 1 cada que se divide hasta que no se pueda dividir porque de '0'
            //la cantidad de veces que se ejecute el while (la division) esa sera la cantidad de digitos(cifras).
        }
        return cifras;
    } 
}
