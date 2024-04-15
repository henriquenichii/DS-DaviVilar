/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite quantos alunos tem na sua sala: ");
        int n = teclado.nextInt();
        
        System.out.println("Insira a nota de cada aluno uma por vez:");
        
       int i = 0;
       int j = 0;
       int notaf = 0;
       
        while(i<n){
        j++;
        System.out.println("Nota do aluno" + j + ":");
        int nota = teclado.nextInt();
        notaf += nota;
        i++;
        }
        
        int media = notaf / n;
        System.out.println("Media da turma: " + media);
    }
    
}
