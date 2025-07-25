import java.util.Scanner;

public class C09EX05 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        long rep;
        double num, den, serie = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        rep = teclado.nextLong();


        for (int aux = 1; aux <= rep; aux++) {
            num = (2 * (aux - 1)) + (aux * 3);
            den = (aux * 6) + 1;
            serie += num / den;
        }
        serie = 5 * serie;
        System.out.print("Valor da serie: " + serie);
    }
}
