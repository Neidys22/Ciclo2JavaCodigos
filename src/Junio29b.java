public class Junio29b {
    public static void main(String[] args){
        /*int a = 5; // esto es una expresión (dar valor a una variable)
        System.out.println(5+5); // imprime el resultado de la operación aritmetica indicada
        System.out.println(5-5);
        System.out.println(5*5);
        System.out.println(a/5);
        System.out.println(5%5);// arroja el resto de la divsión (seria 0)
        System.out.println(Math.pow(4,3)); //exponenciación, el primer número es la base y el segundo el exponente
        System.out.println(Math.sqrt(16)); //raíz cuadrada
        System.out.println(Math.abs(3-5)); //valor absoluto
        System.out.println(Math.cbrt(64); //raíz cubica*/

        //Ejemplo 2 - contador
        /*int contador = 0; 
        contador = contador + 1; //suma 1 a contador
        contador += 1;  //suma 1 a contador
        contador ++;  //suma 1 a contador, este es un atajo ya que es más corto y mejor usar este 
        System.out.println(contador); // imprime el resultado 3
        for (int i=0;i<5;i++){  // ejemplo de uso de ++ (i++) en vez de +1(i+1) con for 
            System.out.println(i);*/
        
        // operaciones combinadas:
        /*int contador = 0;  
        contador = contador + 1;
        contador += 1;  // valor anterior más 1
        contador -= 3;  // valor anterior menos 3
        contador *= 7;  // valor anterior por 7 
        contador /= 5;  // valor anterior entre 5
        contador %= 2;  // valor anterior modulo(resto) 2
        System.out.println(contador);*/     
        
        // Ejemplo de incremento y decremento
        /*int numero = 1;
        System.out.println(numero++); // aquí imprime resultado 1 porque primero muestra la variable y despues si la incrementa
        System.out.println(numero); // aqui si imprime resultado 2 porque ya incremento en la instrucción anterior
        System.out.println(++numero); // aquí si suma primero y luego muestra el resultado que seria 3.
        System.out.println(numero--); // primero muestra la variable y decrementa en 1
        System.out.println(numero);
        System.out.println(--numero); // resta primero y despues muestra*/

        //Ejemplo incremento con char
        /*char caracter = 'j';
        System.out.println(++caracter);  //Imprimirá la letra k
        System.out.println(caracter+=2); // imprime la letra m*/

        //Ejemplo para contraer un if con else sencillo:
        /*String resultado = 5>2 ? ":)" : ":("; // expresa; si 5 es mayor que 2 (o pregunta ¿5 es mayor que 2?)imprima carita feliz sino imprima carita triste
        // el signo de interrogación representa al if y los dos punto al else. 
        System.out.println(resultado);*/
        
        // and (&),or(|), not (!), xor (^)
        if (5>3 & 4>6){  // indica and (&), se deben cumplir las 2 condiciones para que sea verdadero
            System.out.println("?"); // no imprime nada porque no se cumplen las 2
        if (5>2 | 4>7){  // indica or (|) se debe cumplir una de las 2 de las condiciones
            System.out.println("?"); // Si imprime ya que se cumple una 
        if (!(5==1)){ // pregunta si 5 no es igual a 1 (negacion con !)
            System.out.println("correcto"); // se imprime "correcto" porque es verdadera la condicion 
        if (5>7 && 8>3 && 9>5 && 6>0 && 10>1); // usar && para que java no procese las demas sentencias cuando ubique una incorrecta
            System.out.println(":)"); // no imprime nada porque la primera es incorrecta
        if (5>2 || 8>3 || 9>5 || 6>0 || 10>1); // con || detecta la primera correcta y no procesa mas 
            System.out.println(":)"); // si imprime ya que se cumple por lo menos una
        if (5>3 ^ 5>4){  //solo una puede ser verdad no las dos (^ indica o)- o especial
            System.out.println(":)"); // no imprime nada porque las dos condicioenes son verdaderas.
        }
        }
        }
        }
        }
    }

