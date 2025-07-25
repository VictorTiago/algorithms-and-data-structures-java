import java.util.Scanner;

public class C12EX21 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero[] = new int[20];
        int temp;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe um número inteiro: ");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numero.length; aux++) {
            if (aux % 2 == 0)
                System.out.println(numero[aux]);
        }

        for (int aux = 0; aux < numero.length; aux++) {
            if (aux % 2 != 0)
                System.out.println(numero[aux]);
        }
        teclado.close();
    }
}
