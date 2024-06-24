/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

/**
 *
 * @author CAMARGO
 */
import javax.swing.JOptionPane;
public class Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    String nome = null;
    int resposta;
    nome = JOptionPane.showInputDialog("Qual é a sua cor favorita?");
    resposta = JOptionPane.showConfirmDialog(null, "A sua cor favorita é " + nome + "?");
    if (resposta == JOptionPane.YES_OPTION) {
    // verifica se o usuário clicou no botão YES
      JOptionPane.showMessageDialog(null, "Sua cor favorita é " + nome);
    } else {
      JOptionPane.showMessageDialog(null, "Sua cor favorita não é " + nome);
    }
  }
}