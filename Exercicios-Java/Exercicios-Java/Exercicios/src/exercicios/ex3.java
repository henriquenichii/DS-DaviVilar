/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
           
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite quantos quilômetro você percorre por litro:");
        float KML= teclado.nextFloat();
      
        System.out.println("Digite qual distância será percorrida:");
        float distancia = teclado.nextFloat();
        
        System.out.println("Qual o preço unitário do litro de combustível: ");
        float preco = teclado.nextFloat();
        
       float a =  distancia/KML;
       float custo = a*preco;
       
       System.out.println(custo);
       
        
        
    }
    
}
