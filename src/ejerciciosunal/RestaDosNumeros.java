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
public class RestaDosNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        System.out.print(A-B);
    }
}
