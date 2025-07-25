import java.util.Scanner;

public class C12EX04 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        long valor[] = new long[20];
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < valor.length; aux++) {
            System.out.print("Ordem de chegada primeira bateria: ");
            valor[aux] = teclado.nextLong();
        }
            System.out.println(valor[0] + " / " + valor[10]);
            System.out.println(valor[1] + " / " + valor[11]);
            System.out.println(valor[2] + " / " + valor[12]);
            System.out.println(valor[3] + " / " + valor[13]);
            System.out.println(valor[4] + " / " + valor[14]);
            System.out.println(valor[5] + " / " + valor[15]);
            System.out.println(valor[6] + " / " + valor[16]);
            System.out.println(valor[7] + " / " + valor[17]);
            System.out.println(valor[8] + " / " + valor[18]);
            System.out.println(valor[9] + " / " + valor[19]);
        teclado.close();
    }
}