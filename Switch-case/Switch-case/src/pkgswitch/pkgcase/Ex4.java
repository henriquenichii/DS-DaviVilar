/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.pkgcase;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Codigo do lanche(100 a 105): ");
        int cod = teclado.nextInt();

         System.out.println("Quantidade de lanches");
        double n = teclado.nextInt();
        
        
        switch(cod){
            case 100:
            double preco100 = n * 1.70;
            System.out.println(preco100);
            break;
                
            case 101:
            double preco101 = n * 2.30;
            System.out.println(preco101);                
            break;
            
            case 102:
            double preco102 = n * 2.60; 
             System.out.println(preco102);
             break;   
             
            case 103:
            double preco103= n * 2.40;  
            System.out.println(preco103);
                break; 
                
            case 104:
            double preco104 = n * 2.50;  
             System.out.println(preco104);
                break;
                
            case 105:
            double preco105 = n * 1;    
             System.out.println(preco105);
                break;     
        }
    
    }
    
}
