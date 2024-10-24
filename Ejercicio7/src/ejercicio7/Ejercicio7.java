/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author utpl
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       boolean papa = ((Math.sqrt(81)+9)/3)==9;
       boolean uva = 10>1;
       boolean limon = (100/25)>=Math.sqrt(100);
       
       System.out.println(papa || uva && limon);
               
               
    }
    
}
