/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.pkgcase;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Qual é o codigo do seu produto?");
      int cod = teclado.nextInt();
      
      switch(cod)
      {
             case 1:
                System.out.println("Alimento nao-perecível");
                break;
            case 2, 3, 4:
                System.out.println("Alimento perecível");
                break;
            case 5, 6:
                System.out.println("Vestuário");
                break;
            case 7:
                System.out.println("Higiene pessoal");
                break;
            case 8,9,10,11,12,13,14,15:
                System.out.println("Limpeza e utensilios domesticos");
                break;
            default:
                System.out.println("Codigo invalido");
                break;
          
      }
    }
    
}
