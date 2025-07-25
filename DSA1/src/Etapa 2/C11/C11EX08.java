import java.util.Scanner;

public class C11EX08 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long horas, somaHoras = 0, contNome = 0, contPremio1 = 0, contPremio2 = 0, contPremio3 = 0;
        double valorHora, valorAReceber, premio, mediaHoras, maiorValorAReceber = 0, somaValorTotal = 0;
        String nome, funcao, funcaoMaiorValor = "", nomeMaiorValor = "";

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("FIM")) {
                contNome++;
                System.out.print("Informe sua função:");
                funcao = teclado.nextLine();
                System.out.print("Horas trabalhadas:");
                horas = teclado.nextLong();
                System.out.print("Valor da hora trabalhada:");
                valorHora = teclado.nextDouble();
                teclado.nextLine();
                somaHoras += horas;
                if (horas <= 100) {
                    premio = 1000;
                    contPremio1++;
                } else if (horas <= 500) {
                    premio = 10 * horas;
                    contPremio2++;
                } else {
                    premio = 100 * ((double) horas / 100);
                    contPremio3++;
                }
                    valorAReceber = horas * valorHora + premio;
                    somaValorTotal += valorAReceber;

                System.out.println("Valor a receber: " + valorAReceber);
                if (maiorValorAReceber < valorAReceber) {
                    maiorValorAReceber = valorAReceber;
                    funcaoMaiorValor = funcao;
                    nomeMaiorValor = nome;
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));
        mediaHoras = (double) somaHoras / contNome;
        System.out.println("Média de horas trabalhadas por pessoa: " + mediaHoras);
        System.out.println("Pessoa com maior salário: " + nomeMaiorValor + " - " + funcaoMaiorValor);
        System.out.println("Pessoas com premio de R$1.000: " + contPremio1);
        System.out.println("Pessoas com premio de R$10 por hora trabalhada: " + contPremio2);
        System.out.println("Pessoas com premio de R$100 a cada 10 horas completas: " + contPremio3);
        System.out.println("Valor total da folha de pagamento: " + somaValorTotal);
    }
}




