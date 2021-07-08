public class App {
    public static void main(String[] args) throws Exception {   //metodo(función estática) main-hasta ahora podemos copiar hasta args 
        System.out.println("Hello, World!"); // para imprimir en consola.
        System.out.println("Misiontic");  
        int variable=8; // variable entero
        System.out.println(variable); 
        boolean variable2 = true; // variable booleana
        String variable3 = "Neidys"; // variable cadena de texto
        float variable4 = 1.2f ; // variable decimal flotante
        double variable5 = 1.8 ; // variable decimal doble
        System.out.println(variable4-variable5); //podemos hacer operacioes entre float y double.
        char variable6 = 'N' ; // variable para guardar un solo caracter, colocar comillas simples
        byte variable7 = 8 ; // variable tipo de entero 2^{8}=256 datos desde el -128 hasta el 127(incluir 0)
        short variable8 = 130 ; // variable tipo de entero 2^{16}
        int variable9 = 1000000 ; // variable tipo de entero 2^{32}
        long variable10 = 350000000 ; // variable tipo de entero 2^{64}
        int [] lista = {5,9,3,2}; // lista con numeros enteros, se llaman arreglos porque no admite varios tipos de dato
        String [] lista2 = {"Hola", "como", "estas"}; // lista (arreglo) de cadena de texto
        System.out.println(variable7);
        System.out.println(lista[0]); // imprimir elemento de la lista, 0 es la posición  
        var variable11 = "Hola" ;
        String variable12 = "Hola\tMundo" ;  // para espacio tab entre palabras
        String variable13 = "Hola\nMundo" ; // para salto de linea
        System.out.println (variable12) ;
        System.out.println (variable13) ;
        
    }
}
