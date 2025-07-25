import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class C12EX26 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        Scanner teclado = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<String>();
        List<Double> listaSalarios = new ArrayList<Double>();
        String nome;
        double salario, reajusteSlr;

        do {
            System.out.print("Informe o nome do funcionário (X para encerrar): ");
            nome = teclado.nextLine();
            if (!nome.equalsIgnoreCase("X")) {
                System.out.print("Informe o salário: ");
                salario = teclado.nextDouble();

                listaNomes.add(nome);
                listaSalarios.add(salario);
            }
        } while (nome.equalsIgnoreCase("X"));

        System.out.print("Informe o reajuste salarial: ");
        reajusteSlr = teclado.nextDouble();

        for (int aux = 0; aux < listaSalarios.size(); aux++) {
            if (listaSalarios.get(aux) < 1000)
                listaSalarios.set(aux, reajusteSlr);
        }
        for (int aux = 0; aux < listaSalarios.size(); aux++) {
            System.out.println("Nome: " + listaNomes.get(aux));
            System.out.println("Salário: " + listaSalarios.get(aux));
        }
    }
}
