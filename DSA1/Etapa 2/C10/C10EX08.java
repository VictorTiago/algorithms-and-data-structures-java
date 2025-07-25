import java.util.Scanner;

public class C10EX08 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        String cidade, cidadeMenorPopulacao = " ";
        long populacao, eleitores, mulheres, homens, contCidade = 0, somaPopulacao = 0, contMulheres = 0, somaHomens = 0, menorPopulacao = Long.MAX_VALUE, somaEleitores = 0;
        double percentualEleitores, mediaHomens;

        Scanner arquivo = new Scanner(
                C10EX08.class.getResourceAsStream("c10ex08.txt"));

        do {
            cidade = arquivo.nextLine();

            contCidade++;
            populacao = arquivo.nextLong();
            somaPopulacao += populacao;
            eleitores = arquivo.nextLong();
            somaEleitores += eleitores;
            mulheres = arquivo.nextLong();
            homens = arquivo.nextLong();
            somaHomens++;
            if (mulheres > homens)
                contMulheres++;
            if (populacao < menorPopulacao) {
                menorPopulacao = populacao;
                cidadeMenorPopulacao = cidade;
            }
            if (homens + mulheres > populacao)
                System.out.print("A soma de homens e mulheres é maior que a população");
            if (!cidade.equalsIgnoreCase("Zimbabue de Minas"))
                break;

        } while (!cidade.equalsIgnoreCase("Zimbabue de Minas"));
        percentualEleitores = (somaEleitores / somaPopulacao) * 100;
        mediaHomens = somaHomens / contCidade;
        System.out.println("quantidade total de cidades: "+contCidade);
        System.out.println("populacao total do estado: "+somaPopulacao);
        System.out.println("percentual de eleitores: "+percentualEleitores);
        System.out.println("quantidade de cidades com mais mulheres: "+contMulheres);
        System.out.println("media de homens: "+mediaHomens);
        System.out.println("cidade de menor populacao: "+cidadeMenorPopulacao);
        arquivo.close();
    }
}