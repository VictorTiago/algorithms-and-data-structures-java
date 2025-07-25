import java.util.Scanner;

public class C12EX18 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero[] = new int[10];
        double nReal, multiplicacao;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero[aux] = teclado.nextInt();
        }
        System.out.print("Informe um número real: ");
        nReal = teclado.nextDouble();
        for (int aux = 0; aux < numero.length; aux++) {
            multiplicacao = numero[aux] * nReal;
            System.out.println(multiplicacao);
        }
    }
}
