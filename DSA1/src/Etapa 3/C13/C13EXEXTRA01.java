import java.util.Scanner;

public class C13EXEXTRA01 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);

        double salario, salarioDepAbt, imposto;
        int qntDep;

        System.out.println("Informe seu salário: ");
        salario = teclado.nextDouble();

        System.out.println("Informe a quantidade de dependetes: ");
        qntDep = teclado.nextInt();

        salarioDepAbt = salario-qntDep*150;

        if (salarioDepAbt < 1000){
            imposto = 0;
        }else if (salarioDepAbt < 5000){
            imposto = salarioDepAbt * (0.1);
        }else if (salarioDepAbt < 10000){
            imposto = salarioDepAbt * (0.15);
        }else {
            imposto = salarioDepAbt * (0.2);
        }

        System.out.println("Valor a pagar de IRPF: "+imposto);


        teclado.close();
    }
}
