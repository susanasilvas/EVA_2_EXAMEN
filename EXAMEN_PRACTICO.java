/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captu = new Scanner(System.in);
        System.out.println("Jugar piedra, papel, tijera 1,2,3");
         cant = captu.nextInt();
        String[] Elección = new String[cant];
        captu.nextLine();
       
        for (int i = 2; i < 3; i++) {
            System.out.println("consola#" + (i < 3) +":");
            Elección[i] = captu.nextLine();
            System.out.println("Ganaste");
          captu.nextInt();
          
                  
        
              
          
          
          
        
            
         
            
                
            }
            
            
            
      
          
                
            }
          
                 
         
            
            
 
             
       
    }
    

