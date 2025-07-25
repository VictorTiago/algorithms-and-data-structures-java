import javax.swing.*;
import java.util.Scanner;

public class C08EX20 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        long rep, soma = 0;
        double progressao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de termos: ");
        rep = teclado.nextLong();

        for (int aux = 1; aux <= rep; aux++) {
            progressao = aux * 2;
            soma += progressao;
            System.out.println(progressao);
        }
        System.out.println("Soma: " + soma);
    }
}
