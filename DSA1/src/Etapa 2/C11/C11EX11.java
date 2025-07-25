import java.util.Scanner;

public class C11EX11{
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int rep;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número inteiro de 1 a 9: ");
        rep = teclado.nextInt();

        if (rep > 9 || rep < 1)
            System.out.print("Numéro inválido");

        for (int aux = 1; aux <= rep; aux++) {
            for (int aux2 = 1; aux2 <= aux; aux2++) {
                System.out.print(aux2);
            }
            System.out.println();
        }
    }
}

