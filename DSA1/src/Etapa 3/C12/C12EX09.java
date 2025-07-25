import java.util.Scanner;

public class C12EX09 {
    public static void main(String[] args) {

        // Victor Tiago Avelino Da Silva
        int numero[] = new int[10], soma = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero[aux] = teclado.nextInt();
            soma += numero[aux];
        }
        for (int aux = 0; aux < numero.length; aux++) {
            if (soma % numero[aux] == 0)
                System.out.println(numero[aux]);
        }
    }
}
