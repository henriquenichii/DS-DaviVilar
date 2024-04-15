/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
       System.out.println("Digite o custo de fábrica do carro: ");
       int valor = teclado.nextInt();
       
       float distribuidor = (float)28/100*valor;
       float imposto = (float)45/100 * valor;
       float custo_final = valor + distribuidor + imposto;
       
       System.out.println("Custo final R$" + custo_final);
       
    }
    
}
