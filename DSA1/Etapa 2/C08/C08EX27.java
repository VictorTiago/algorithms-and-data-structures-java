import java.util.Scanner;

public class C08EX27 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        // rep desenhos asteriscos pt2
        int rep;

        for (int aux = 1; aux <= 10; aux++) {

            for (int aux2 = 0; aux2 <= 9; aux2++) {
                rep = (int) Math.pow(2, aux2);

                for (int aux3 = 1; aux3 <= rep; aux3++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int aux2 = 9; aux2 >= 0; aux2--) {
                rep = (int) Math.pow(2, aux2);

                for (int aux3 = 1; aux3 <= rep; aux3++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}