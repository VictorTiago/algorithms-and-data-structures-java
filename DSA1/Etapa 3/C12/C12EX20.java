import java.util.Scanner;

public class C12EX20 {
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
            for (int x = 0; x < numero.length; x++) {
                if (numero[x] > numero[aux = 9])
                    System.out.println(numero[x]);
            }
        }
    }
}
