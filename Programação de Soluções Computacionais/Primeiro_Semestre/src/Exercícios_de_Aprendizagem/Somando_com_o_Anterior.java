
package Exercícios_de_Aprendizagem;
import javax.swing.JOptionPane;
public class Somando_com_o_Anterior {
    public static void main(String[] args) {
        int S; int I=1; int C=0; int R; int F; String fim="Geovane Augusto";
       S=Integer.parseInt(JOptionPane.showInputDialog("Até que numero  deseja que a sequencia vá?"));
       for(F=0;F<S; F++){
           System.out.println(I);
        R=I;
        I=I+C;
        C=R;
       }
    System.out.println("feito por:"+fim);
    }
    
}
