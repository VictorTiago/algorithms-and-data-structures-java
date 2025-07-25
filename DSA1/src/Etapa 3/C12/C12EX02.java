import java.util.Scanner;

public class C12EX02 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        int valor[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < valor.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            valor[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < valor.length; aux++) {
            if (valor[aux] > 5 && valor[aux] < 10)
                System.out.println(valor[aux]);
        }
        teclado.close();
    }
}
