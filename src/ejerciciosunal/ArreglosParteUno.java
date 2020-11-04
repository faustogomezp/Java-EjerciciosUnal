/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosunal;

/**
 *
 * @author fausto.gomez
 */
public class ArreglosParteUno {
    
    public static void main(String[] args){
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++){
            x[i] = i;
            System.out.print(i);
        }
        int j = 0;
        while ( j < x.length){
            System.out.print(x[j]+'\n');
            j++;
        }
    }
    
}
