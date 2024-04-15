/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        
        System.out.println("Digite se voce abasteceu com gasolina ou alcool(precofinaligite G para gasolina e A para alcool):");
        String tipo = teclado.nextLine();
        
        System.out.println("Digite quantos litros de combustivel voce abasteceu:");
        double litro = teclado.nextDouble();
        
        if (tipo.equals("A") && litro<=20){
            double desconto = (2.90 * 0.03);
            double preco = litro * (2.90 - desconto);
            System.out.println(preco);
        } else if (tipo.equals("A") && litro>=20){
            double desconto = (2.90 * 0.05);
            double preco = litro * (2.90 - desconto);
            System.out.println(preco);
        } else if (tipo.equals("G") && litro<=20){
             double desconto = (3.30 * 0.04);
            double preco = litro * (3.30 - desconto);
            System.out.println(preco);
        }else if (tipo.equals("G") && litro>=20){
              double desconto = (3.30 * 0.06);
            double preco = litro * (3.30 - desconto);
            System.out.println(preco);
    } else {
            System.out.println("Digitou qualquer coisa");
        }
        
        
    }
    
}
