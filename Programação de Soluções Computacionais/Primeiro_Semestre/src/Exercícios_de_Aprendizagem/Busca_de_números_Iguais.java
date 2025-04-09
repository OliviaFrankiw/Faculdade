
package Exercícios_de_Aprendizagem;
//2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
//deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
//COMPLETO
import javax.swing.JOptionPane;

public class Busca_de_números_Iguais {
    public static void main(String[] args) {
     double n1, n2;
     n1=Double.parseDouble(JOptionPane.showInputDialog("me diga 1° numero"));
     n2=Double.parseDouble(JOptionPane.showInputDialog("Me diga o 2° numero"));
     if(n1==n2){
     JOptionPane.showMessageDialog(null,"Os numeros são iguais");
     }
    }
    
}
