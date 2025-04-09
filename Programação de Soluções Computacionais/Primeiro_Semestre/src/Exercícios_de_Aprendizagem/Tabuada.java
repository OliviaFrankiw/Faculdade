
package Exercícios_de_Aprendizagem;
import java.util.Scanner;
public class Tabuada {
      public static void main(String[] args) {
        int num; int cont=0; String fim="Geovane augusto";Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero");
            num=sc.nextInt();
        for(cont=0; cont<=10; cont++)
        {
           System.out.println(num+"X"+cont+"="+(num*cont));  
        }
          System.out.println("feito por:"+fim);
    }
}
