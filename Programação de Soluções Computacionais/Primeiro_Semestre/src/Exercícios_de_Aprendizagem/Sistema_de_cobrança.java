
package Exercícios_de_Aprendizagem;
//6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
//valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
//programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
//saque.
//COMPLETO
import javax.swing.JOptionPane;

public class Sistema_de_cobrança {
    public static void main(String[] args) {
        double Saldo, Sacar,FINAL;
        Saldo=Double.parseDouble(JOptionPane.showInputDialog("Olá esse é seu banco digitsl\n Me fale seu Saldo"));
        Sacar=Double.parseDouble(JOptionPane.showInputDialog("Agora me fale quanto deseja sacar"));
        if(Sacar>Saldo){
        JOptionPane.showMessageDialog(null,"Não foi  possivel realizar saque");
        }
        else{
        FINAL=Saldo-Sacar;
        JOptionPane.showMessageDialog(null,"Seu saldo atual é"+FINAL);
        }
    }
    
}
