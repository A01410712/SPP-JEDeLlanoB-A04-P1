/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.a04.p1;
import java.util.Scanner;
/**
 *
 * @author José Eduardo De Llano Barragán A01410712 IC
 */
public class SPPJEDeLlanoBA04P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        Scanner datos= new Scanner(System.in);
      
        System.out.println("Introduce un ángulo entre 0º y 360º");
        a= datos.nextDouble();
        
        System.out.println("¿Que función quieres sacar?");
        System.out.println("¨1.Seno¨");
        System.out.println("¨2.Coseno¨"); 
        System.out.println("¨3.Tangente¨");
        double anguloRadianes = Math.toRadians(a);
        int op;
        double res;
        op=datos.nextInt();
        
        switch(op){
            case 1:
            res=Math.sin(anguloRadianes);
            System.out.println("Seno de " + a + "º = " + res);
             break;
        case 2:
             res=Math.cos(anguloRadianes);
            System.out.println("Coseno de " + a + "º = " + res);
            break;
        case 3:
             res=Math.tan(anguloRadianes);
            System.out.println("Tangente de " + a + "º = " + res);
            break;
        default:
            res=0;
            System.out.println("No esta dentro del menú");
            
        }
        
                
    }
    
}
     
      
        
    
