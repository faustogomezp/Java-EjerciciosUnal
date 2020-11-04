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
public class SentimientoGroot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] sentimientos = {"I am", "it", "that", "I groot"};
        String sentimiento = "";
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++){
            if (i == 1 ) {
                sentimiento = sentimientos[0];
            } else if (i % 2 == 0){
                sentimiento += " " + sentimientos[2] + " " + sentimientos[3];
            } else {
               sentimiento += " " + sentimientos[2] + " " + sentimientos[0]; 
            }
        }
        sentimiento += " " + sentimientos[1];
        System.out.print(sentimiento);
    }
        
    
}
