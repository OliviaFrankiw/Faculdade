package Exercícios_de_Aprendizagem;



//Escreva um programa que oferece para o usuário as seguintes opções:
//1 – Misto quente R$5,50
//2 – Salada Chinesa R$10,20
//3 – Suco de Laranja R$4,00
//4 – Suco de Manga R$3,50
//Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
//terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
//lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir “bom apetite,
//vai lhe custar” seguido do valor da comida.
import javax.swing.JOptionPane;
public class Cardapio {
    public static void main(String[] args) {
   int OPC,n1;
 OPC=Integer.parseInt(JOptionPane.showInputDialog("Seja bem-vindo á minha cantina nosso cardapio é\n1 – Misto quente R$5,50\n2 – Salada Chinesa R$10,20\n3 – Suco de Laranja R$4,00\n4 – Suco de Manga R$3,50\""));      
    if(OPC==1){
    JOptionPane.showMessageDialog(null,"bom apetite, vai lhe custar: R$5,50");
    }
    else if(OPC==2){
    JOptionPane.showMessageDialog(null,"bom apetite,vai lhe custar: R$10,20");
    }
    else if(OPC==3){
    JOptionPane.showMessageDialog(null,"tenha um excelente drink,vai lhe custar: R$4,00 ");
    }
    else if(OPC==4){
    JOptionPane.showMessageDialog(null,"tenha um excelente drink,vai lhe custar: R$3,50");
    }
    else{
    JOptionPane.showMessageDialog(null,"ERRO");
    }
    }
}
