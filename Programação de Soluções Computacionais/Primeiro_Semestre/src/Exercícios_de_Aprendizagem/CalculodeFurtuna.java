
package Exercícios_de_Aprendizagem;

public class CalculodeFurtuna {
        public static void main(String[] args) {
        int PA=10000;
        int PB=5000; 
        int M=1; 
        String fim="Geovane Augusto";
        while (PA>PB)
        {
            System.out.println("estamos no mes "+M);
            System.out.println("Pessoa A: "+PA);
            System.out.println("Pessoa B: "+PB+"\n");
            M++;
            PA+=100;
            PB+=300;
        }
        if (PA==PB){System.out.println("estamos no mes "+M+"\nA pessoa B tem furtuna de: "+PA+"\n Igualou a Pessoa A que tem: "+PB+"\n");
        } 
        System.out.println("estamos no mes "+(M+1)+"\nA pessoa B tem furtuna de: "+(PA+100)+"\n ultrapassou a Pessoa A que tem: "+(PB+300));
        
    System.out.println("feito por:"+fim);
    }
}
