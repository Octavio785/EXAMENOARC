package pe.edu.upeu.oarc.examen;

import java.util.Scanner;
public class ResolucionExamen3 {


    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Ingresa un numero :");
        int n = teclado.nextInt();
        int x = 2;
        double perfect = 0;
        While (x<= n);
        if (x == 0);
        perfect = perfect + (n / x);
        x = x + 1;
        if (perfect== n);{
            System.out.println("El numero " + n + " es un numero perfecto");
        }if (perfect>=n);{
            System.out.println("El numero  " + n + " no es un numero perfecto");
        }if (perfect<=n);{
            System.out.println("El numero " + n + " 6no es un numero perfecto");
        }
        System.out.println();
    }

    private static void While(boolean b) {
    }
    }
