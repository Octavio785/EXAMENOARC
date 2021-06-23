package pe.edu.upeu.oarc.examen;

import java.util.Scanner;
public class ResolucionExamen4 {


    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


 int resultado;
 System.out.print("Ingresa el numero de x :");
        int x = teclado.nextInt();
 System.out.print("Ingresa el numero de n :");
        int n = teclado.nextInt();
 
 if (n==0) System.out.println ("el resultado es 1");
 if (n>0){
 int potencia=(int)Math.pow(x,n-1);
 resultado=n*potencia;
 System.out.println ("el resultado es :" +resultado);}
 
}
}