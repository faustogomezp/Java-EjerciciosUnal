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

/*
Se desea desarrollar una competencia de integrales en una Universidad.
Para motivar a los estudiantes sin importar el nivel, se desea que inicialmente los problemas
sean sencillos.
Para esto se ha seleccionado un problema y se le ha preguntado a n personas sus opiniones.
Si al menos una persona dijo que el problema era difícil el problema será difícil y se procederá
a cambiar dicho ejercicio.

Entrada: La primera línea contiene la cantidad n de personas que dieron su opinión
sobre un problema dado. La siguiente línea contiene n números que pueden ser 0 o 1.
Si es un cero la persona piensa que el problema es fácil, si es un 1,
la persona piensa que es un problema difícil: Salida Muestre la palabra
FACIL si el problema es fácil de acuerdo con las respuestas dadas o DIFICIL si al 
menos una persona piensa que el problema es difícil.

Input

Output

3
1 0 1

DIFICIL
 */
import java.util.Scanner;
public class CompetenciaFacil {

    public static void main(String[] args) {
        int cant_estudiantes= 0;
        Scanner sc = new Scanner(System.in);
        cant_estudiantes = Integer.parseInt(sc.nextLine());
        //String[]respuestas = new String[cant_estudiantes];
        String respuestas[] = sc.nextLine().split(" ");
        for (int i = 0; i < cant_estudiantes; i++) {
            if (respuestas[i].equals("1")) {
                System.out.print("DIFICIL");
                System.exit(0);
            }
        }
        System.out.print("FACIL");
    }
}
