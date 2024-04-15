/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
System.out.println("Digite 10 números inteiros: ");
       int i = 0;
       int j = 0;
       int maior = 0;
       int maior2 = 0;
       
        while(i<4){
        j++;
        System.out.println("Numero" + j + ":");
        int n = teclado.nextInt();
       if (n>maior){
         maior2 = maior;
         maior = n;
      
        }
       else if (n>maior2 ){
           maior2 = n; }
        i++;
        }
     
        System.out.println("O maior número foi: " + maior);
        System.out.println("O segundo maior número foi: " + maior2);
    }
    
}
