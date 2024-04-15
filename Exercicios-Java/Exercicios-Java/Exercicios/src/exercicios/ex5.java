/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite quantos anos, meses e dias de vida você tem: ");
        
        System.out.println("Anos: ");
        int anos = teclado.nextInt();
        System.out.println("Meses: ");
        int meses = teclado.nextInt();
        System.out.println("Dias: ");
        int dias = teclado.nextInt();
        
        int anos_dias = anos*365;
        int meses_dias = meses*30;
        
        int idade_dias = dias + anos_dias + meses_dias;
        System.out.println("Sua idade em dias é "+idade_dias+"dias");
        
    }
}
