import javax.swing.*;
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        int quantidadeConsumida, quantidadeInsumos, quantidadeConsumidaSoma = 0;
        String nome, nomeMaior = "";
        double precoUnitario, precoTotal, mediaParcial, precoParcial, precoParcialSoma = 0, parcialMaior = 0;;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de insumos utilizados: ");
        quantidadeInsumos = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux <= quantidadeInsumos; aux++) {
            System.out.print("Informe o nome do insumo: ");
            nome = teclado.nextLine();
            System.out.print("Informe o preço unitário do insumo: ");
            precoUnitario = teclado.nextDouble();
            System.out.print("Informe  a quantidade consumida pelo insumo: ");
            quantidadeConsumida = teclado.nextInt();
            quantidadeConsumidaSoma += quantidadeConsumida;

            precoParcial = quantidadeConsumida * precoUnitario;
            precoParcialSoma +=precoParcial;
            System.out.println("Custo parcial: "+precoParcial);
            teclado.nextLine();

            if (aux == 1 || precoParcial > parcialMaior) {
                parcialMaior = precoParcial;
                nomeMaior = nome;
            }

        }
        mediaParcial = precoParcialSoma / quantidadeInsumos;
        System.out.println("A media de custo Parcial foi de: "+mediaParcial);
        System.out.println("O custo total do projeto foi de: R$" + precoParcialSoma);
        System.out.println("Insumo com maior custo parcial: " + nomeMaior);
        teclado.close();
    }
}

