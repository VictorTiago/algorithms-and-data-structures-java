import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12EX28 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        List<String> nomesArrList = new ArrayList<>();
        List<String> RAArrList = new ArrayList<>();

        String nomeStr, RAStr, tempNome, tempRA;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Para encerrar o cadastro digite '0' no Nome");

        System.out.println("Informe o Nome do aluno: ");
        nomeStr = teclado.nextLine();

        do {

            if (nomeStr.equalsIgnoreCase("0")){
                break;
            }else {

                if (!(nomeStr.equalsIgnoreCase("0"))) {
                    System.out.println("Informe o Registro Acadêmico: ");
                    RAStr = teclado.nextLine();

                    RAArrList.add(RAStr);
                    nomesArrList.add(nomeStr);
                }

                System.out.println("Informe o Nome do aluno: ");
                nomeStr = teclado.nextLine();
            }
        } while (!(nomeStr.equalsIgnoreCase("0")));

        for (int aux = 0; aux < nomesArrList.size(); aux++) {
            for (int aux2 = 0; aux2 < nomesArrList.size() - 1; aux2++) {
                if (nomesArrList.get(aux2).compareToIgnoreCase(nomesArrList.get(aux2 + 1)) > 0) {
                    tempNome = nomesArrList.get(aux2);
                    nomesArrList.set(aux2, nomesArrList.get(aux2 + 1));
                    tempRA = RAArrList.get(aux2);
                    RAArrList.set(aux2, RAArrList.get(aux2 + 1));
                }
            }
        }

        System.out.println("Informe um nome a ser pesquisado: ");
        String nomePes = teclado.nextLine();

        for (int aux = 0; aux < RAArrList.size(); aux++) {
            if (nomesArrList.contains(nomePes)) {
                if (nomesArrList.get(aux).equalsIgnoreCase(nomePes)) {

                    System.out.printf("""
                            NOME ENCONTRADO!
                                                    
                            Aluno: %s
                            RA: %s
                            Posição na lista: %d
                            """, nomesArrList.get(aux), RAArrList.get(aux), (aux+1));

                }
            }else {

                System.out.println("NOME NÃO ENCONTRADO!");
            }
        }
    }
}

