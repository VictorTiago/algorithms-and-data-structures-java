import java.util.Scanner;

public class C08EX25 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        for (int aux1 = 1; aux1 <= 10; aux1++) {
            for (int aux = 1; aux <= aux1; aux++)
                System.out.print("*");
            System.out.println();
        }
        for (int aux2 = 9; aux2 >= 1; aux2--) {
            for (int aux = 1; aux<=aux2; aux++)
                System.out.print("*");
            System.out.println();
        }
    }
}
