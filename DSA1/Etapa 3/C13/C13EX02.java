import java.util.Scanner;

public class C13EX02 {

    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.print("Informe o valor de x: ");
        x = teclado.nextInt();

        System.out.print("f(x)= " + FuncaoC13EX02.funcao(x));
    }
}

