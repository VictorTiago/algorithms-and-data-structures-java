import java.util.Scanner;

public class C09EX09 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double num, den, serie = 0;
        long rep;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        rep = teclado.nextLong();

        for (int aux = 1; aux <= rep; aux++) {
            num = Math.pow(3, aux + 1);
            den = (aux + 9) * Math.sqrt(Math.pow(aux, 4));
            serie += num / den;
        }
        serie = 100 - (Math.pow(serie, 3));
        System.out.print("O resultado da serie é: " + serie);
    }
}