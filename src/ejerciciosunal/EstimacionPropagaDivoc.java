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
public class EstimacionPropagaDivoc {
    public static void main(String[] args){
        double n, m;
        int d;
        Scanner sc = new Scanner(System.in);
        n = Double.parseDouble(sc.nextLine().trim());
        m = Double.parseDouble(sc.nextLine().trim());
        d = 1;
        while(n > m) {
            m *= 1.03;
            n *= 1.02;
            d++;
        }
        System.out.print(d);
    }
}
