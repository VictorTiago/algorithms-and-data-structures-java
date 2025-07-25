import java.util.Scanner;

public class C12EX23 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero[] = new int[10];
        int temp;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe o número: ");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numero.length; aux++) {
            if (numero[aux] % 3 == 0)
                System.out.println(numero[aux]);
        }
    }
}