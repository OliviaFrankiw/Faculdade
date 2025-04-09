/*
Uma padaria precisa de um sistema para seu cliente escolher entre as 2 opçõe de Comida e 
2 de Bebidas e Após isso de Opção de pagamento e deixe ele comprar outra coisa após o pagamento do primeiro elemento for completo 
*/

package Exercícios_de_Aprendizagem;

import javax.swing.JOptionPane;


public class ESCOLHAePAGAMENTO {
    public static void main(String[] args) {
         int OPC,PAG,W = 1;
         double VAL,DESC,N1,PAR;
         String Fim="Geovane Augusto";
         while(W==1){
 OPC=Integer.parseInt(JOptionPane.showInputDialog("Seja bem-vindo á minha cantina nosso cardapio é\n1 – Misto quente R$5,50\n2 – X-Burguer R$18,20\n3 – Café R$4,00\n4 – Coca-Cola R$5,50\""));      
    if(OPC==1){
    JOptionPane.showMessageDialog(null,"bom apetite, vai lhe custar: R$5,50");
     PAG=Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento\n0-À vista\n1-Compra Parcelada"));
            if(PAG==0){ 
            VAL=5.50*0.1;
            DESC=5.50-VAL;
            JOptionPane.showMessageDialog(null,"O valor a ser pago é de desconto é de: "+VAL+" O valor da compra ficou "+DESC);
            } 
            else if(PAG==1){
        PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 2"));
            if(PAR==1){
           N1=5.50/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=5.50/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else if(PAR>=3){
           JOptionPane.showMessageDialog(null,"opção invalida");
       }
             else{
    JOptionPane.showMessageDialog(null,"ERRO");
    }
       }
    }
    else if(OPC==2){
    JOptionPane.showMessageDialog(null,"bom apetite,vai lhe custar: R$10,20");
      PAG=Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento\n0-À vista\n1-Compra Parcelada"));
            if(PAG==0){ 
            VAL=18.20*0.1;
            DESC=18.20-VAL;
            JOptionPane.showMessageDialog(null,"O valor a ser pago é de desconto é de: "+VAL+" O valor da compra ficou "+DESC);
            } 
            else if(PAG==1){
        PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 2"));
            if(PAR==1){
           N1=18.20/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=18.20/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else if(PAR>=3){
           JOptionPane.showMessageDialog(null,"opção invalida");
       }
            else{
            JOptionPane.showMessageDialog(null,"ERRO");
       }
            }
        }
    else if(OPC==3){
    JOptionPane.showMessageDialog(null,"tenha um excelente drink,vai lhe custar: R$4,00 ");
   PAG=Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento\n0-À vista\n1-Compra Parcelada"));
            if(PAG==0){ 
         VAL=4.00*0.1;
           DESC=4.00-VAL;
        JOptionPane.showMessageDialog(null,"O valor a ser pago é de desconto é de: "+VAL+" O valor da compra ficou "+DESC);
        } 
            else if(PAG==1){
       PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 2"));
            if(PAR==1){
           N1=4.00/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=4.00/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else{
           JOptionPane.showMessageDialog(null,"opção invalida");
       }
            }
         else{
            JOptionPane.showMessageDialog(null,"ERRO");
       }
            
    }
    else if(OPC==4){
    JOptionPane.showMessageDialog(null,"tenha um excelente drink,vai lhe custar: R$3,50");
    PAG=Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento\n0-À vista\n1-Compra Parcelada"));
            if(PAG==0){ 
         VAL=5.50*0.1;
           DESC=5.50-VAL;
        JOptionPane.showMessageDialog(null,"O valor a ser pago é de desconto é de: "+VAL+" O valor da compra ficou "+DESC);
        } 
            else if(PAG==1){
       PAR=Integer.parseInt(JOptionPane.showInputDialog("Deseja parcelar em quantas vezes? podemos parcelar em até 2"));
            if(PAR==1){
           N1=5.50/1;
           JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
           }
            else if(PAR==2){
             N1=5.50/2;
             JOptionPane.showMessageDialog(null, "sua parcela ficoo no valor de"+N1);
        }
            else if(PAR>=3){
           JOptionPane.showMessageDialog(null,"opção invalida");
       }
        else{
            JOptionPane.showMessageDialog(null,"ERRO");
       }
       }
    }
    else{
    JOptionPane.showMessageDialog(null,"ERRO");
     }
    W=Integer.parseInt(JOptionPane.showInputDialog("Deseja commprar mais alguma coisa?\n1-Sim\n2-Não"));
    }
        System.out.println("Feito por:"+Fim);
    }
    }
    
   
