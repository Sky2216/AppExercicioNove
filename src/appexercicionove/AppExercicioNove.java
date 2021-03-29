/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicionove;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioNove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        double baseMaior,baseMenor,altura,area;
        
     Scanner teclado = new Scanner (System.in);
     
     System.out.println("Digite a base maior do trapezio: ");
     baseMaior = teclado.nextDouble();
     System.out.println("Digite a base menor do trapezio: ");
     baseMenor = teclado.nextDouble();
     System.out.println("Digite a altura do trapezio: ");
     altura = teclado.nextDouble();         
     area = baseMaior + baseMenor * altura / 2;
  
        System.out.println("O valor da area do trapezio: "+area); 
    
    
    
    }
    
}
