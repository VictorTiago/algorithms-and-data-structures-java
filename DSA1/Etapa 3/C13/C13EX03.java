import java.util.Scanner;

public class C13EX03 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        long num;
        int index;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número positivo ou nulo de até 9 dígitos: ");
        num = teclado.nextLong();

        while ((num > 999999999 || num < -0) ){
            System.out.println("Número inválido!!!");
            System.out.println("Informe um número de até 9 dígitos: ");
            num = teclado.nextLong();
        }

        System.out.println("Informe a posição que você deseja saber: ");
        index = teclado.nextInt();

        System.out.println(C13EX03Decomp.decomp(num,index));
    }
}
