import java.util.Scanner;

public class C08EX24 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double num, serie = 0;
        for (int aux = 1; aux <= 99; aux += 2) {
            num = Math.pow(2, aux);
            serie += num;
        }
        serie = (1.0 / 3) * serie;
        System.out.print("Valor da série = "+serie);
    }
}
