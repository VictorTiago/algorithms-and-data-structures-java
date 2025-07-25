import java.util.Scanner;

public class C08EX23 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        long palindromoVerificacao, contPalindromo = 0, soma = 0;
        double media;


        for (int aux = 1000; aux <= 9999; aux++) {
            palindromoVerificacao = aux % 10000;
            if (aux == palindromoVerificacao) {
                contPalindromo++;
                soma += palindromoVerificacao;
            }
        }
        media = soma/contPalindromo;
        System.out.print(media);
    }
}





