/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunal;

import java.util.Scanner;

public class EjercicioEdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese tú edad en días: ");
        int edad = Integer.parseInt(sc.nextLine().trim());
        int años = 0, mes = 0;
        if (edad >= 365) {
            años = edad / 365;
            edad = edad % 365;
        } 
        if (edad >= 30) {
            mes = edad / 30;
            edad = edad % 30;
        }
        System.out.print(años + " año(s)"+'\n'+mes + " mes(es)"+'\n'+edad + " día(s)");
    }
    
}
