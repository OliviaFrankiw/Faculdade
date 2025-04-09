
package Exercícios_de_Aprendizagem;
//Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
//um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
//0 – Compra à vista
//1 – Compra parcelada no cartão
//2 – Crediário

//Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
//Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
//Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
//desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
//Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
//terminar.
//COMPLETO
import javax.swing.JOptionPane;



public class Sistema_de_vendas {
    public static void main(String[] args) {
        double A,N3,N1,N2;
        int PAG,PAR;
        
      
        A=Double.parseDouble(JOptionPane.showInputDialog("Qual o  valor da peça que deseja levar!"));
       PAG=Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento\n0-À vista\n1-Compra Parcelada\n2-Crediario" ));
       if(PAG==0){
           N1=A*0.1;
           N2=A-N1;
        JOptionPane.showMessageDialog(null,"O valor a ser pago é de desconto é de: "+N1+" O valor da compra ficou "+N2);
        }         
       else if(PAG==1){
       PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 3"));
            if(PAR==1){
           N1=A/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=A/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else if(PAR==3){
             N1=A/3;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
            }
            else if(PAR>=4){
           JOptionPane.showMessageDialog(null,"opção invalida");
       }
       }
        if(PAG==2){
         PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 3")); 
          if(PAR==1){
              N1= N1=A*(1+0.1)/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=A*(1+0.1)/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else if(PAR==3){
             
                N1=A*(1+0.1)/3;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
            }
            else if(PAR>=4){
           JOptionPane.showMessageDialog(null,"opção invalida");
            }
        }
       }
}

