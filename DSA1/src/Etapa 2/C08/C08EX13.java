import javax.swing.*;
import java.util.Scanner;

public class C08EX13 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        String cidade, cidadeMenor = "";
        long populacao, quantidadeEleitores, quantidadeHomens, quantidadeMulheres, contPopulacaoAcima = 0, contMaisMulheres = 0, populacaoMenor = 0;
        double percentualEleitores;
        Scanner arquivo = new Scanner(
                C08EX13.class.getResourceAsStream("c08ex13.txt"));

        for (int aux = 1; aux <= 858; aux++) {
            cidade = arquivo.nextLine();
            System.out.print("Cidade: " + cidade);
            populacao = arquivo.nextLong();
            System.out.print("População: "+populacao);
            quantidadeEleitores = arquivo.nextLong();
            System.out.print("Quantidade de eleitores: " + quantidadeEleitores);
            quantidadeHomens = arquivo.nextLong();
            System.out.print("Quantidade de homens: " + quantidadeHomens);
            quantidadeMulheres = arquivo.nextLong();
            System.out.print("Quantidade de mulheres: " + quantidadeMulheres);

            percentualEleitores = (quantidadeEleitores / populacao) * 100;

            if (quantidadeHomens + quantidadeMulheres != populacao)
                System.out.println("A soma de homens e mulheres difere da população");

            System.out.println("percentual de eleitores em relação a população: " + percentualEleitores);

            if (populacao > 1000000)
                contPopulacaoAcima++;

            if (quantidadeHomens < quantidadeMulheres)
                contMaisMulheres++;

            if (aux == 1 || populacao < populacaoMenor) {
                populacaoMenor = populacao;
                cidadeMenor = cidade;
            }
            arquivo.nextLine();
        }
        System.out.println("Cidades com população acima de 1 milhão: " + contPopulacaoAcima);
        System.out.println("Cidades cuja população tem mais mulheres: " + contMaisMulheres);
        System.out.println("Cidade de menor população: " + cidadeMenor);
        arquivo.close();
    }
}




