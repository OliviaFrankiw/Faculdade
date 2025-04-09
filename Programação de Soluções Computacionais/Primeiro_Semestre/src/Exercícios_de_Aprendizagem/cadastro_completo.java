
package Exercícios_de_Aprendizagem;

import javax.swing.JOptionPane;


 
public class cadastro_completo {
public static void main (String args[]){
    String Nome=JOptionPane.showInputDialog("nome completo:");
    int idade=Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
    String Telefone=JOptionPane.showInputDialog("Telefone:");
    String Cidade=JOptionPane.showInputDialog("Sua cidade:");
    double Nascimento=Double.parseDouble(JOptionPane.showInputDialog("Data de Nascimento: \n ex:10032006"));
    JOptionPane.showMessageDialog(null, "seu nome é: "+Nome+", Voce nasceu em :"+Nascimento+", sua idade:"+idade+" Mora em:"+Cidade+" e seu telefone é:"+Telefone);
}    
}
