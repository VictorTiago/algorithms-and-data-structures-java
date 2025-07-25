import javax.swing.*;
import java.util.Scanner;

public class C08EX19 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double progressao;
        long soma = 0;

        for (int aux = 1; aux <= 100; aux++) {
            progressao = Math.pow(aux, 2);
            soma += progressao;
            System.out.println(progressao);
        }
        System.out.println("Soma: "+soma);
    }
}
