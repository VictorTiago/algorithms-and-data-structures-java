import java.util.Scanner;

public class C12EX01 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        int valor[] = new int[10], contDiv = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < valor.length; aux++) {
            System.out.println("Informe o valor: ");
            valor[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < valor.length; aux++) {
            if (valor[aux] % 5 == 0 && valor[aux] % 7 == 0)
                contDiv++;
        }
        System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + contDiv);
        teclado.close();
    }
}


