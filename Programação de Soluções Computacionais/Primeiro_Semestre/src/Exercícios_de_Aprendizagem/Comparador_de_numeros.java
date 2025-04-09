package Exercícios_de_Aprendizagem;
//1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
//do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
//somente termina.
//COMPLETO
import javax.swing.JOptionPane;


public class Comparador_de_numeros {
    public static void main(String[] args) {
        int N1;
        double N2;  
      N1=Integer.parseInt(JOptionPane.showInputDialog("me fale um numero inteiro"));
      N2=Double.parseDouble(JOptionPane.showInputDialog("me fale um numero reeal"));
      if(N1<N2){
          System.out.println("Seu inteiro é menor que o Real");
      }
    }
   
}
