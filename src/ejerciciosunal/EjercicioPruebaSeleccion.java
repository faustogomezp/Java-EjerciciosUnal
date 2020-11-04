/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunal;

import java.util.Scanner;

/**
 *
 * @author fausto.gomez
 */
public class EjercicioPruebaSeleccion {    
    private static int a, b, c, d;

    public static void inicializarVariables() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

    public static void lecturaVariables() {
        Scanner sc = new Scanner(System.in);
        a = Integer.parseInt(sc.nextLine().trim());
        b = Integer.parseInt(sc.nextLine().trim());
        c = Integer.parseInt(sc.nextLine().trim());
        d = Integer.parseInt(sc.nextLine().trim());
    }

    public static int tomarA() {
        return a;
    }

    public static int tomarB() {
        return b;
    }

    public static int tomarC() {
        return c;
    }

    public static int tomarD() {
        return d;
    }

    public static String validacionVariables() {
        String resultado = "";
        if (tomarB() > tomarC() && tomarD() > tomarA() && (tomarC() + tomarD()) > (tomarA() + tomarB()) && tomarC() > 0 && tomarD() > 0 && (tomarA() % 2) == 0) {
            resultado = "Valores aceptados";
        } else {
            resultado = "Valores no aceptados";
        }
        return resultado;
    }

    public static void main(String[] args) {
        lecturaVariables();
        System.out.print(validacionVariables());
    }
}
