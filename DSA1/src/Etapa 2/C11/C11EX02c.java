import java.util.Scanner;

public class C11EX02c {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long contBronze = 0, contPrata = 0, contOuro = 0;
        String nome, nomeMenorValor = "";
        double valor, somaBronze = 0, somaPrata = 0, somaOuro = 0, menorValor = Double.MAX_VALUE, mediaBronze, valorTotal;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o nome do cliente: ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")){
                System.out.print("Informe o valor aplicado: ");
                valor = teclado.nextDouble();
                teclado.nextLine();
                if (valor < menorValor) {
                    menorValor = valor;
                    nomeMenorValor = nome;
                }

                if (valor <= 1000) {
                    contBronze++;
                    somaBronze += valor;
                    System.out.println(nome + ", Classificação BRONZE");
                } else if (valor <= 5000) {
                    contPrata++;
                    somaPrata += valor;
                    System.out.println(nome + ", Classificação PRATA");
                } else if (valor > 5000) {
                    contOuro++;
                    somaOuro += valor;
                    System.out.println(nome + ", Classificação OURO");
                } else
                    System.out.println("VALOR INVALIDO");}
        }while (!nome.equalsIgnoreCase("X"));
        mediaBronze = somaBronze / contBronze;
        valorTotal = somaBronze + somaOuro + somaPrata;
        System.out.println("quantidade de clientes BRONZE: " + contBronze);
        System.out.println("quantidade de clientes PRATA: " + contPrata);
        System.out.println("quantidade de clientes OURO: " + contOuro);
        System.out.println("Média dos valores BRONZE: " + mediaBronze);
        System.out.println("Valor total aplicado: " + valorTotal);
        System.out.println("Cliente de menor aplicação: " + nomeMenorValor);
        teclado.close();
    }
}
