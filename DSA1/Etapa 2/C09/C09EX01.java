import java.util.Scanner;

public class C09EX01 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 37; aux++) {
            num = (38 - aux) * (39 - aux);
            den = aux;
            serie += num / den;
        }
        System.out.print(serie);
    }
}
