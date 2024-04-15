/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Digite um número qualquer e inteiro: ");
     int n = teclado.nextInt();
     
      for (int p = 0; p <= n; p = p+2){ //par
           System.out.println("Numero par: "+ p);
       }
      
      System.out.println("_______________________ \n");
      
      for (int i = 1; i <= n; i = i+2){ //impar
           System.out.println("Numero impar: "+ i);
       }
    }
    
}
