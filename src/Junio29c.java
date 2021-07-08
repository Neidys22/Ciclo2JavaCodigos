import java.util.Scanner;

public class Junio29c {
    public static void main(String[] args){  //Solución ejercicio 1 diapositivas clase 1 imaster:
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println(saludar(nombre)); // Imprime lo mismo que la anterior, esta es mas dificil porque se debe crear la funcion saludar(la de abajo) para poder llamarla y usarla.
    }
    // para indicar que tipo debe retornar usar public static seguida del tipo que queramos:
    public static String saludar(String nombre){  // ejemplo ejercicio 1 diapositivas clase 1 imaster (indica que tipo retorna)
        return "Hola " + nombre;

    } 

}
