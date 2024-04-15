/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.pkgcase;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
        System.out.println("x: ");
        int x = teclado.nextInt();
        System.out.println("y: ");
        int y = teclado.nextInt();
 
       
       System.out.println("Qual operação deseja?(1 para média, 2 para diferença, 3 para produto, 4 para divisao do primeiro pelo segundo)");
       int i = teclado.nextInt();
       
       switch(i){
           case 1:
       int media = (x+y)/2;
       System.out.println(media);
              break;
           case 2:
       int diferenca = x - y;
       System.out.println(diferenca);
              break;
           case 3:
        int produto = x*y;
        System.out.println(produto);       
              break;
           case 4:
        int divisao = x/y;
       System.out.println(divisao);        
              break;
       }
       
    }
    
}
