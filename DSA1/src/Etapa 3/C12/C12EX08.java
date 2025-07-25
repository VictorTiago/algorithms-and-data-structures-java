import java.util.Scanner;

public class C12EX08 {
    public static void main(String[] args) {

        // Victor Tiago Avelino Da Silva
        int numero[] = new int[20], soma = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe o número: ");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numero.length; aux++) {
            soma = numero[aux] + numero[10 + aux];
            System.out.println(soma);
        }
    }
}
