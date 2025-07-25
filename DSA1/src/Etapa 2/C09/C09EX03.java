import java.util.Scanner;

public class C09EX03 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;
        long termos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o numero de termos: ");
        termos = teclado.nextLong();

        for (int aux = 1; aux <= termos; aux++) {
            num = Math.pow(aux, 0) + Math.sqrt(aux * 4);
            den = aux * 3;
            serie += num / den;
        }
        System.out.print(serie);
        teclado.close();
    }
}

