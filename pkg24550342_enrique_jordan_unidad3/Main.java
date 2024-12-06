/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550342_enrique_jordan_unidad3;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int al = 6;
        int calif;
        int val;
        
        System.out.println("Ingrese en orden del 1 al 5 los alumnos: ");
        for (int i = 0; i < 5; i++) {
           al = captu.nextInt(); 
        }
        
        val = calif;
        System.out.println("Ingrese la califiacion del alumno 1:");
        calif = captu.nextInt();
        if (calif >=50) {
            System.out.println("Si Aprobo");
        } else if(calif <=100) {
                System.out.println("No Aprobo");
        }
        System.out.println("Ingrese la califiacion del alumno 2:");
        calif = captu.nextInt();
        if (calif >=50) {
            System.out.println("Si Aprobo");
        } else if(calif <=100) {
                System.out.println("No Aprobo");
        }
        System.out.println("Ingrese la califiacion del alumno 3:");
        calif = captu.nextInt();
        if (calif >=50) {
            System.out.println("Si Aprobo");
        } else if(calif <=100) {
                System.out.println("No Aprobo");
                }
        System.out.println("Ingrese la califiacion del alumno 4:");
        calif = captu.nextInt();
        if (calif >=50) {
            System.out.println("Si Aprobo");
        } else if(calif <=100) {
                System.out.println("No Aprobo");
                }
        System.out.println("Ingrese la califiacion del alumno 5:");
        calif = captu.nextInt();
        if (calif >=50) {
            System.out.println("Si Aprobo");
        } else if(calif <=100) {
                System.out.println("No Aprobo");
                }
        
        
    }
    
}
