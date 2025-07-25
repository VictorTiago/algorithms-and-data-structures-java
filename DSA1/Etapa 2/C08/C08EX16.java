import javax.swing.*;
import java.util.Scanner;

public class C08EX16 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double media, somaimpares = 0;
        int contImpares = 0;

        for (int aux = 1000; aux <= 2000; aux++) {
            if (aux % 2 != 0) {
                somaimpares += aux;
                contImpares++;
            }
        }
        media = somaimpares / contImpares;
        System.out.println("Média números ímpares: " + media);
    }
}
