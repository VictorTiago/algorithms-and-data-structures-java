import java.util.Scanner;

public class C11EX04a {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int idade, pontos, maiorIdade = 0;
        double multa, somaMulta = 0, percentualHomens;
        String sexo, nome, nomeVelho = "";
        long somaIdade = 0, contMasculino = 0, contMulheres7 = 0, idadeMedia;

        Scanner teclado = new Scanner(System.in);

        for (int aux = 1; aux <= 230; aux++) {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe sua idade: ");
            idade = teclado.nextInt();
            somaIdade += idade;
            System.out.print("Informe seu sexo: ");
            sexo = teclado.nextLine();
            if (sexo.equalsIgnoreCase("Masculino"))
                contMasculino++;
            System.out.print("Informe a quantidade de pontos perdidos: ");
            pontos = teclado.nextInt();
            System.out.print("Informe o valor da multa: ");
            multa = teclado.nextDouble();
            teclado.nextLine();
            somaMulta += multa;
            if (sexo.equalsIgnoreCase("Mulher") && pontos == 7)
                contMulheres7++;
            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeVelho = nome;
            }
        }
        idadeMedia = somaIdade / 230;
        percentualHomens = (contMasculino * 100) / 230;
        System.out.println("Idade média dos condutores: " + idadeMedia);
        System.out.println("Valor total das multas: " + somaMulta);
        System.out.println("Percentual de homens multados: " + percentualHomens);
        System.out.println("Quantidade de mulheres que perderam 7 pontos: " + contMulheres7);
        System.out.println("Nome e idade da pessoa mais velha: " + nomeVelho + ", " + maiorIdade);
    }
}

