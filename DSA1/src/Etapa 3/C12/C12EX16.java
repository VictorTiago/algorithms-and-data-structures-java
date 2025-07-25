import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class C12EX16 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        String nome[] = new String[100], estado[] = new String[100];
        long populacao[] = new long[100], temp;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < nome.length; aux++) {
            System.out.print("Informe o nome da cidade: ");
            nome[aux] = teclado.nextLine();
            System.out.print("Informe o estado: ");
            estado[aux] = teclado.nextLine();
            System.out.print("Informe a população: ");
            populacao[aux] = teclado.nextLong();
            teclado.nextLine();
        }
        for (int aux = 0; aux < nome.length; aux++)
            for (int x = 0; aux < nome.length; aux++)
                if (populacao[x] < populacao[x+1]) {
                    temp = populacao[x];
                    populacao[x] = populacao[x + 1];
                    populacao[x + 1] = temp;
                }
    }
}
