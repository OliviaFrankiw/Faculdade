package sistema.churrasco;

import java.util.Scanner;

/**
 *
 * @author Geovane Augusto Git Geo0703
 *
 */
public class SistemaChurrasco {

    public static void main(String[] args) {
        //Quantidade Unitaria Adultos
        double CarneB_Adulto = 0.4;
        double CarneP_Adulto = 0.2;
        double CarneF_Adulto = 0.3;
        double ling_Adulto = 0.3;
        int pao_Adulto = 2;
        //Quantidade Unitaria Criança
        double CarneB_Crianca = 0.25;
        double CarneP_Crianca = 0.075;
        double CarneF_Crianca = 0.2;
        double ling_Crianca = 0.2;
        int pao_Crianca = 1;
        //Soma Geral
        double SomaCarne;
        double SomaCarnePorco;
        double SomaCarneFrango;
        double SomaLibguiça;
        int SomaPao;
        //Quantidade de pessoas 
        int Adultos;
        int Crianca;
        String PesoV = "G";
        String PesoP = "G";
        String PesoF = "G";
        String PesoL = "G";
        //recebe o numero de pessoas
        Scanner SC = new Scanner(System.in);
        //Captura a informação do usuário
        System.out.println("Olá Vamos Fazer seu kit-Churrasco\nQuantos Adultos Estão Confirmados");
        Adultos = SC.nextInt();
        System.out.println("E quantas Crianças Vão Vir para o Churrasco");
        Crianca = SC.nextInt();
        //Multiplica Quantidade pelo numero de Pessoas
        CarneB_Adulto = CarneB_Adulto * Adultos;
        CarneP_Adulto = CarneP_Adulto * Adultos;
        CarneF_Adulto = CarneF_Adulto * Adultos;
        ling_Adulto = ling_Adulto * Adultos;
        pao_Adulto = pao_Adulto * Adultos;
        CarneB_Crianca = CarneB_Crianca * Crianca;
        CarneP_Crianca = CarneP_Crianca * Crianca;
        CarneF_Crianca = CarneF_Crianca * Crianca;
        ling_Crianca = ling_Crianca * Crianca;
        pao_Crianca = pao_Crianca * Crianca;
        //Soma Adultos Com Crianças
        SomaCarne = CarneB_Adulto + CarneB_Crianca;
        SomaCarnePorco = CarneP_Adulto + CarneP_Crianca;
        SomaCarneFrango = CarneF_Adulto + CarneF_Crianca;
        SomaLibguiça = ling_Adulto + ling_Crianca;
        SomaPao = pao_Adulto + pao_Crianca;
        //Condicional para diferenciar KG de Gr
        if (SomaCarne >= 1.0) {
            PesoV = "KG";
        }
        System.out.println("Seu Kit Churrasco é\nCarne de Vaca: " + SomaCarne + PesoV);
        if (SomaCarnePorco >= 1.0) {
            PesoP = "KG";
        }
        System.out.println("Carne de Porco: " + SomaCarnePorco + PesoF);
        if (SomaCarneFrango >= 1.0) {
            PesoF = "KG";
        }
        System.out.println("Carne de Frango: " + SomaCarneFrango + PesoF);
        if (SomaLibguiça >= 1.0) {
            PesoL = "KG";
        }
        System.out.println("Linguiça: " + SomaLibguiça + PesoL);
        System.out.println("Pão de alho " + SomaPao + " Unidades");
    }

}
