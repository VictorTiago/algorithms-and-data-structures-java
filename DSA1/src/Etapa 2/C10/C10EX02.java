import java.util.Scanner;

public class C10EX02 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double valor, somaValor = 0, media;
        long contValor = 0, contValorMaior = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("Informe o valor: ");
            valor = teclado.nextDouble();
            if (valor != 0) {
                somaValor += valor;
                contValor++;
                if (valor > 1000)
                    contValorMaior++;
            }
        } while (valor != 0);
        media = somaValor / contValor;
        System.out.print("Média dos valores: "+media+"\nValor total: "+somaValor+"\nQuantidade de valores acima de R$1.000,00: "+contValorMaior);
        teclado.close();
    }
}
