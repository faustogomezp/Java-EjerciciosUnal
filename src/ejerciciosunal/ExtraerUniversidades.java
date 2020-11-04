/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunal;
import java.util.Scanner;
public class ExtraerUniversidades { 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cant_universidades = 0;
        cant_universidades = Integer.parseInt(sc.nextLine());
        String[] universidades = new String[cant_universidades];
        for (int i=0; i < cant_universidades; i++){
            universidades[i] = sc.nextLine().split("\\.")[1];
        }
        for (int i = 0; i < cant_universidades; i ++) {
            System.out.print(universidades[i]+'\n');
        }
    } 
}
