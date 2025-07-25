import java.util.Scanner;

public class C10EX07 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        long pessoas, contDias = 0, ano, meses, dias;
        double contaminacao, pessoasAtual = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe quantas pessoas vivem no local: ");
        pessoas = teclado.nextLong();

        do {
            contaminacao = pessoasAtual * 0.003;
            pessoasAtual += contaminacao;
            contDias++;

        } while (pessoasAtual < pessoas);

        ano = contDias / 365;
        meses = (contDias % 365) / 30;
        dias = (contDias % 365) % 30;

        System.out.print("anos = " + ano + "\nmeses = " + meses + "\ndias = " + dias);
        teclado.close();
    }
}
