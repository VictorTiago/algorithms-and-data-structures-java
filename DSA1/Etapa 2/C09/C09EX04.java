import java.util.Scanner;

public class C09EX04 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;
        long termos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos: ");
        termos = teclado.nextLong();

        for (int aux = 1; aux <= termos*4; aux +=4) {
            num = aux * (aux + 1);
            den = (aux+2)*(aux+3);
            serie += (num/den);
        }
        System.out.print(Math.sqrt(serie));
    }
}

