import java.util.Scanner;

public class C12EX15 {
    public static void main(String[] args) {

        // Victor Tiago Avelino Da Silva
        String mes[] = new String[12], temp;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux < mes.length; aux++) {
            System.out.print("Informe o mês: ");
            mes[aux] = teclado.nextLine();
        }
        for (int aux = 0; aux < mes.length - 1; aux++)
            for (int x = 0; x < mes.length - 1; x++)
                if (mes[x].compareToIgnoreCase(mes[x + 1]) > 0) {
                    temp = mes[x];
                    mes[x] = mes[x + 1];
                    mes[x + 1] = temp;
                }
        for (int aux = 0; aux < mes.length; aux++)
            System.out.println(aux+1 + " - " + mes[aux]);
        teclado.close();
    }
}
