import java.util.Scanner;

public class C09EX02 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.pow(aux, 2) + aux - 1;
            serie += num / den;
        }
        System.out.print(serie);
    }
}
