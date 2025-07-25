import java.util.Scanner;

public class C12EX06 {
    public static void main(String[] args) {
        // Victor Tiago Avelino Da Silva
        String meses[] = new String[12];
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < meses.length; aux++) {
            System.out.print("Informe o nome do mês: ");
            meses[aux] = teclado.nextLine();
        }
        for (int aux = meses.length - 1; aux >= 0; aux--) {
            System.out.println(meses[aux]);
        }
    }
}

