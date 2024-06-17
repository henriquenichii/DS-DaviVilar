import java.util.Scanner;
public class MeuGato{
       public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
System.out.println("Qual o nome do seu gato?");
 
 
           gato Miau = new gato();
           Miau.setNome("Miau");
           Miau.idade = 5;
           Miau.setCor("verde");
           Miau.raca = "bolivia";
 
            Miau.miar();
 
         System.out.println("O meu gato se chama "+ Miau.getNome());
         System.out.println("A cor do meu gato é " + Miau.getCor());
 
         
       }
 
       }
 