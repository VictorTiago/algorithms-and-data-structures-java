import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C13EX06 {
    public static void main(String[] args) {
        //Victor Tiago Avelino da Silva

        Scanner teclado = new Scanner(System.in);
        int qnt = 10, qntNomesFml = 0;
        String sobrenome;

        List<String> nomesArrLst = new ArrayList<String>();

        System.out.println("Informe o nome de uma família: ");
        sobrenome = teclado.nextLine();

        for (int aux = 0; aux < qnt; aux++){
            System.out.println("Informe um nome: ");
            nomesArrLst.add(teclado.nextLine());
        }

        for (int aux = 0; aux < qnt; aux++){
            String finaltemp;
            finaltemp = nomesArrLst.get(aux);
            if (finaltemp.endsWith(" "+sobrenome)){
                qntNomesFml ++;
            }
        }
        System.out.printf("Existem um total de %d pessoas com esse sobrenome",qntNomesFml);
    }
}
