
/*
um algoritimo que le 7 notas de 0 á 10 e nos mostra as 3 maiores notas
desenvolvido por:
Geovane Augusto- RA=824124157
Olivia Frankiw- RA=824118846
*/
import java.util.Scanner;

public class Algoritmo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[7];

        System.out.println("Digite as 7 notas:");
        for (int i = 0; i < notas.length; i++) {
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite novamente:");
                nota = sc.nextDouble();
            }

            notas[i] = nota;
        }

        for (int i = 1; i < notas.length; i++) {
            double notaAtual = notas[i];
            int j = i - 1;

            while (j >= 0 && notaAtual > notas[j]) {
                notas[j + 1] = notas[j];
                j--;
            }

            notas[j + 1] = notaAtual;
        }

        System.out.println("As 3 maiores notas são:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.2f\n", notas[i]);
        }
    }
}
