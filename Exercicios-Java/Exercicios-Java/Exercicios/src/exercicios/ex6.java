/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o número total de eleitores do município: ");
       int total = teclado.nextInt();
       
       System.out.println ("Digite o número de votos brancos do município:");
       int branco = teclado.nextInt();
       
       System.out.println ("Digite o número de votos nulos do município:");
       int nulo = teclado.nextInt();
       
       System.out.println ("Digite o número de votos válidos do município:");
       int valido = teclado.nextInt();
       
       float porcent_branco = ((float)branco/total)*100; 
       float porcent_nulo = ((float)nulo/total)*100;
       float porcent_valido = ((float)valido /total)*100;
       
       System.out.println( porcent_branco +"%  "+ porcent_nulo +"%  "+ porcent_valido +"%  ");
     
    }
    
}
