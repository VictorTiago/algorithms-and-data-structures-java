import java.util.Scanner;

public class C12EX19 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int numero[] = new int[10];
        int temp;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < numero.length; aux++) {
            System.out.print("Informe o número: ");
            numero[aux] = teclado.nextInt();
        }
        for (int aux = 0; aux < numero.length-1; aux++)
            for (int x = 0; x < numero.length-1; x++)
                if (numero[x] < numero[x + 1]) {
                    temp = numero[x];
                    numero[x] = numero[x + 1];
                    numero[x + 1] = temp;
                }
        for (int aux = 0; aux < numero.length; aux++)
            System.out.println(numero[aux]);
        teclado.close();

    }
}
