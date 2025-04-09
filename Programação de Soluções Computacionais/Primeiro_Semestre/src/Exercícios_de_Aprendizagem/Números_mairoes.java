
package Exercícios_de_Aprendizagem;
//3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
//programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
//primeiro”.
//COMPLETO
import javax.swing.JOptionPane;

public class Números_mairoes {
    public static void main(String[] args) {
        int n1, n2;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digiite o 2° numero"));
        if(n1>n2){
        JOptionPane.showMessageDialog(null, n1+" É maior que "+n2);
        }
        else if(n2>n1){
        JOptionPane.showMessageDialog(null, n2+" È maior que "+n1);
        }
    }
}
