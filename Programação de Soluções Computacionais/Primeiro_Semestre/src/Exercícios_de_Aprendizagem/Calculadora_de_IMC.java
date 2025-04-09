
package Exercícios_de_Aprendizagem;
//Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
//O programa deve exibir um texto para o usuário conforme a tabela abaixo:
//      IMC                        Texto
//Abaixo de 18,5            Abaixo do peso ideal.
//Entre 18,5 e 24,9         Peso ideal, muito bem.
//Entre 25,0 e 29,9         Sobrepeso, um regime leve pode ajudar.
//Entre 30,0 e 34,9         Obesidade leve.
//Entre 35,0 e 39,9         Obesidade moderada.
//Acima de 40               Obesidade mórbida.
//COMPLETO
import javax.swing.JOptionPane;
public class Calculadora_de_IMC{
    public static void main(String[] args) {
      double Peso,Altura,IMC; 
      JOptionPane.showMessageDialog(null,"Olá vamos calcular o seu IMC");
      Peso=Double.parseDouble(JOptionPane.showInputDialog("Me diga seu peso"));
      Altura=Double.parseDouble(JOptionPane.showInputDialog("Agora me diz sua Altura"));
      IMC=Peso/(Altura*Altura);
      JOptionPane.showMessageDialog(null,IMC);
        if(IMC<=18.5){
    JOptionPane.showMessageDialog(null,"Abaixo do peso ideal.");
    }
        else if((IMC==(18.5))&&(IMC<=(24.9))){
    JOptionPane.showMessageDialog(null,"Peso ideal, muito bem");
    }
       else if((IMC>=(25.0))||(IMC<=(29.9))){
    JOptionPane.showMessageDialog(null,"Sobrepeso, um regime leve pode ajudar.");
       }
        else if((IMC>=(30.0))||(IMC<=(34.9))){
      JOptionPane.showMessageDialog(null,"Obesidade leve.");
      }
       else if((IMC>=(35.0))||(IMC<=(39.9))){
      JOptionPane.showMessageDialog(null,"Obesidade moderada.");
       }
       else if(IMC>=40){
       JOptionPane.showMessageDialog(null," Obesidade mórbida.");
       }
    }
  }
