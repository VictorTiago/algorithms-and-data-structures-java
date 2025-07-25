import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class C12EX27 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        Scanner teclado = new Scanner(System.in);
        List<Long> listaCpf = new ArrayList<Long>();
        List<String> listaEndereco = new ArrayList<String>();
        long cpf, cpfPesquisa;
        String endereco;

        do {
            System.out.print("Informe o CPF: ");
            cpf = teclado.nextLong();
            if (cpf != 0) {
                teclado.nextLine();
                listaCpf.add(cpf);
                System.out.print("Informe o endereço: ");
                endereco = teclado.nextLine();
                listaEndereco.add(endereco);
            }
        } while (cpf != 0);

        System.out.print("Informe seu cpf: ");
        cpfPesquisa = teclado.nextLong();

        System.out.print(listaCpf.indexOf(cpfPesquisa));
        int pos = teclado.nextInt();
        if (pos != -1) {
            System.out.print("Foi encontrado, deseja alterar o endereço ou excluir o endereço? (A/E) ");
            String resp = teclado.nextLine();
            if (resp.equalsIgnoreCase("A")) {
                System.out.print("Informe o novo endereço: ");
                String novoEndereco = teclado.nextLine();
                listaEndereco.set(pos + 1, novoEndereco);
            }
            if (resp.equalsIgnoreCase("E")) {
                System.out.print("Endereço removido!");
                listaEndereco.remove(pos + 1);
                listaCpf.remove(pos + 1);
            }
        } else {
            System.out.print("Endereço não encontrado, deseja incluir?(S/N) ");
            String resp = teclado.nextLine();
            if (resp.equalsIgnoreCase("S")) {
                System.out.print("Informe o novo endereço: ");
                cpf = teclado.nextLong();
                listaCpf.add(cpf);
            }
        }
        for (int aux = 0; aux < listaCpf.size(); aux++) {
            System.out.println(listaCpf.get(aux));
            System.out.println(listaEndereco.get(aux));
        }
    }
}





