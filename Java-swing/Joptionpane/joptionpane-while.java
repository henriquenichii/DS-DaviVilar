/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex01jop {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = null;
        int n = 0;
do{
      nome = JOptionPane.showInputDialog("Qual é a sua cor favorita?");
    n = JOptionPane.showConfirmDialog(null, "A sua cor favorita é " + nome + "?");
      
} while(n>0);
          



    }
    
}
