/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.pkgcase;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
   
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
       double nota1 = teclado.nextInt();
        System.out.println("Digite sua segunda nota: ");
       double nota2 = teclado.nextInt();
       
       double media = (nota1 + nota2)/2;
       
       int resultado = 0;
        if(0<media && media<4){
             resultado = 1;
        } else if (4.1<media && media< 7){
            resultado = 2;
        } else if (7.1 < media && media< 10){
            resultado = 3;
        }
        
        switch(resultado){
            case 1:
                System.out.println("Reprovado");
                break;
            case 2:
                System.out.println("Exame");
                break;
            case 3:
                System.out.println("Aprovado");
                break;
                
        }
    }
    
}
