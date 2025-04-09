
package Exercícios_de_Aprendizagem;
//Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
//o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
//números são iguais”.
//COMPLETO
import javax.swing.JOptionPane;


public class comparador_de_números {
    public static void main(String[] args) {
        double n1, n2;
       n1=Double.parseDouble(JOptionPane.showInputDialog(""));
       n2=Double.parseDouble(JOptionPane.showInputDialog(""));
       
       if(n1>n2){
           System.out.println(n1+" É maior que "+n2);
       }
       else if(n2>n1){
           System.out.println(n1+" É maior que "+n2);
       }
       else if(n2==n1){
           System.out.println(n1+" e = "+n2);
    }
    }
    
}
