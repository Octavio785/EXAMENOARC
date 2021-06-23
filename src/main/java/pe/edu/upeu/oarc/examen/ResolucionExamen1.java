package pe.edu.upeu.oarc.examen;

import java.util.Scanner;
 
public class ResolucionExamen1 {
    private static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

    System.out.println ("Ingresa el numero de autos");
    int n = teclado.nextInt();
    double total = 0;
    double categoria1 = 0;
    double categoria2 = 0;
    double categoria3 = 0;
    double impuesto = 0;
    While (n> 0);
    int x= 0;
    System.out.printf("Ingrese el precio del auto: " ,x);
    int precio = teclado.nextInt();
    System.out.println ("Ingresa el codigo");
    int codigo = teclado.nextInt();
    if (codigo>0) and (codigo <4);
    
    impuesto = precio * 0.10;
    categoria1 = (int) (categoria1 + impuesto);
  
    impuesto = precio * .07;
    categoria2 = (int) (categoria2 + impuesto);
  
    impuesto = precio * .05;
    categoria3 = categoria3 + impuesto;
   
    total = total + impuesto;
    System.out.println("El impuesto a pagar por el(los) " + n + " auto(s) es $" + impuesto);
    if (n == n - 1){
    System.out.println ("Esta clave no existe");}
    if (codigo == 1);
    System.out.println("El impuesto a pagar por la categoria 1 es: $ "+ categoria1);
    if (codigo == 2);
    System.out.println("El impuesto a pagar por la categoria 2 es: $ "+ categoria2);
    if (codigo == 3)
    System.out.println("El impuesto a pagar por la categoria 3 es: $ "+ categoria3);
    
    System.out.println("El impuesto total de todos los autos: $ "+ total); }


    private static void While(boolean b) {
    }


    private static void and(boolean b) {
    }
}