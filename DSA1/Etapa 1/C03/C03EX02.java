import java.util.Scanner;
public class C03EX02 {
    //Calcula Função: Calcula a média de 3 números inteiros
    //Autor: Victor Tiago Avelino Da Silva
    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Informe um número: ");
        n1 = teclado.nextLong ();
        System.out.println("Informe outro número: ");
        n2 = teclado.nextLong ();
        System.out.println("Informe mais um número: ");
        n3 = teclado.nextLong ();
        soma = n1 + n2 + n3;
        media = soma / 3.0;
        System.out.println("Média = " + media);
        teclado.close();
    }
}
