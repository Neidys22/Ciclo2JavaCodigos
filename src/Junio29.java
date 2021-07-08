import java.util.Scanner; // se crea automaticamente al corregir el error al usar Scanner

public class Junio29 {

    public static void main(String[] args){ // void(vacio) indica que no espera retornar nada 
        Scanner scanner = new Scanner(System.in); // creación de objeto Scanner
        int variable = 5;  // definir variable
        // variable = input () .... en python se forma asi.
        String entrada = scanner.nextLine(); // solicitar al usuario que ingrese datos string, se puede poner una indicacion "" en los parentesis.
        System.out.println("El mensaje fue " + entrada);
        int resultado = scanner.nextInt(); // otro metodo de scanner, solicitamos al usuario un entero.
        System.out.println("El resultado fue " + resultado);
        if (5>8){ // condicional sí 
            System.out.println(":)"); // imprimir carita feliz
        }else if (3>2){ // condicional sino sí 
            System.out.println("T.T"); // imprimir carita llorando
        }else { // condicional sino 
            System.out.println(":("); // imprimir carita triste
        } 

        Scanner animales = new Scanner(System.in); // in es input
        System.out.println("Ingrese un animal");
        String animal = animales.nextLine();
        if (animal.equals("Perro")){   // equals corresponde a == pero para string
            System.out.println("Guau");
        }else if (animal.equals("Gato")){
            System.out.println("Miau");
        }else {
            System.out.println("No encuentro el animal");
        }
        switch (animal){  //evalua expresiones con casos de igualdad
            case "Perro":  // si la variable animal es igual a Perro
                System.out.println("Guau");
                break;  // para cortar el switch y se salga
            case "Gato" :
                System.out.println("Miau");
                break;
            case "Loro" :
                System.out.println("Quiere cacao");
                break;
            default:  // si ningun caso se cumple
                System.out.println("No se encuentra el animal");

        }int numero = scanner.nextInt(); //ejemplo de switch con enteros
        switch (numero){
            case 0:
                System.out.println("Es igual a 0");
                break;
            default:
                System.out.println("No es igual a 0");  
        }

        int contador = 1 ; // Ejemplo contador
        while (true){  // este while es infinito hasta que entre un break
            System.out.println(":)"); // imprimir carita feliz
            contador = contador + 1; // va sumando 1 al contador
            if (contador==5){  // se imprimiran 4 caritas ya que break corta cuando llega contador a 5
                break;  // cortar y salir
            }  

        int dato = 5;
        do {  // Ejecuta primero la sentencia para que ingrese por lo menos una vez antes de preguntar con while
            System.out.println(":)");
        while (dato>7);
            }  

            for (int i=0;i<5;i=i+1){ // para recorrer; for(inicia;termina;incremento) (i<5)se repite mientras que i sea menor a 5
                System.out.println(":)");  // se imprime 5 veces la carita feliz porque empieza en 0
            }
            for (int i=7;i)
        }

        for (int i=0;i<=20;i=i+2){
            if (i==8){
                continue; // lo que hace es volver arriba y al imprimir salen todos menos el 8
            }
            System.out.println(i);
        } 

    }
    
}
