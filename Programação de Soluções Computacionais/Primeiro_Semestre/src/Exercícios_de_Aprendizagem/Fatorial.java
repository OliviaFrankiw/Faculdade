package Exercícios_de_Aprendizagem;
import javax.swing.JOptionPane;
public class Fatorial
{
    public static void main(String[] args) {
         long FAT=1;int num;String fim="Geovane Augusto";
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber seu fatorial: "));;
        for (int i=1;i<=num;i++) 
            FAT=FAT*i;
        JOptionPane.showMessageDialog(null,"O fatorial de "+num+" é "+FAT);
        JOptionPane.showMessageDialog(null,"Feito por "+fim);
       
    }
}
