/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       System.out.println ("Digite o valor do seu salário mensal atual: ");
       int salario = teclado.nextInt();
       System.out.println("Digite o percentual de reajuste do salário(o símbolo % não é necessário): ");
       float reajuste = teclado.nextInt();
       
       float novo = reajuste/100 * salario;
       
       System.out.println(novo);
       System.out.println("Seu novo salário é "+ (salario+novo));
    }
    
}
