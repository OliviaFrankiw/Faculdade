
package Exercícios_de_Aprendizagem;
//5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
//maior desses números. COMPLETO
import javax.swing.JOptionPane;
import java. util . Scanner ;
public class calcula_3_números_e_mostra_várias_operações {
    public static void main(String[] args) {
        int n1, n2, n3,S,M,P,L,MNA,MNB;
       n1=Integer.parseInt(JOptionPane.showInputDialog("me fale 1° numero"));
       n2=Integer.parseInt(JOptionPane.showInputDialog("me fale 2° numero"));
       n3=Integer.parseInt(JOptionPane.showInputDialog("me fale 3° numero"));
        S=n1+n2+n3;
        P=n1*n2*n3;
        M=n1+n2+n3/3;
       MNA=n1;
       MNB=n1;
       if(n2<MNB){
       MNB=n2;
       }
       if(n3<MNB){
       MNB=n3;
       }
       if(n2>MNA){
       MNA= n2;
       }
       if(n3>MNA){
       MNA=n3;
       }
        System.out.printf("A soma é"+S+"o produto é"+P+"e a media é"+M+"o menor numero é: "+MNB+" o maior é: "+MNA);
    }
}
    
    

