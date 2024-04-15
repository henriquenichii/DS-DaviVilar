/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu salário fixo: ");
        int salario = teclado.nextInt();
        
        System.out.println("Digite sua comissão fixa por venda: ");
        int comissao = teclado.nextInt();
        
        System.out.println("Digite quantos carros você vendeu este mês: ");
        int n_vendas = teclado.nextInt();
        
        System.out.println("Digite o valor total de suas vendas: ");
        int total = teclado.nextInt();
        
        int comissao_vendas = comissao*n_vendas;
        double porcent_total = total * 0.05;
        double salario_final = salario + comissao_vendas + porcent_total;
        
        System.out.println("Seu salário finla é R$"+salario_final);
    }
    
}
