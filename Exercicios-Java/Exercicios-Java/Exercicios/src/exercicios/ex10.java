/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite seu sexo(M ou F): ");
        String sexo = teclado.nextLine();
        
        switch(sexo){
            case "M":
        double hpeso_ideal = (72.7 * altura) - 58;
        System.out.println(hpeso_ideal);
        break;
            case "F":
        double mpeso_ideal = (62.1 * altura) - 44.7;
        System.out.println(mpeso_ideal);
        break;
            default:
        System.out.println("Digitou qualquer coisa");}
        
       
    }
    
}
