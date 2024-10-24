/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author utpl
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v1 = 3;
        double v2 = 10;
        double v3 = 1;
        
        double uva = ((Math.sqrt(Math.pow(v1,4)))+Math.pow(v1,2))/v1;
        double pera = Math.pow(v1,2);
        boolean papaya = uva == pera;
        boolean papa = (v2>v3);
        System.out.println(papaya && papa);        
    }
        
    
}
