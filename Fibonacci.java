import java.util.Scanner;

/**
La serie de Fibonacci es una serie en la que el siguiente número es la suma de los dos anteriores.
Los primeros números de la serie de Fibonacci son 0, 1.
Los primeros 8 números de la serie son 0, 1, 1, 2, 3, 5, 8, 13
Escribe un programa que imprima los primeros X números de la serie de Fibonacci.
La salida debe ser en una sola línea, separando los números por un espacio. Puedes asumir que X es por lo menos 2.
*/
class Fibonacci {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
    //write your code below   	
    int[] fibonacci = new int[x];
    fibonacci[0] = 0;
    fibonacci[1] = 1;
    for(int i=2; i<x; i++){
        fibonacci[i]= fibonacci[i-2] + fibonacci[i-1];
    }
    for(int i=0; i<x; i++){
        System.out.print(fibonacci[i] + " ");
    }
      
  }
}
