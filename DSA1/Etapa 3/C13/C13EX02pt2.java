import java.util.Scanner;

public class C13EX02pt2 {

    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        int x;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o valor de X: ");
            x = teclado.nextInt();
            if (x != -1)
                System.out.print("f(X)= " + FuncaoC13EX02.funcao(x));
        } while (x != -1);
        teclado.close();
    }
}
