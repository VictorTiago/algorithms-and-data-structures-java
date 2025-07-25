import java.util.Scanner;

public class C08EX12 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        String codigo;
        int contVendas1 = 0, contVendas2 = 0, contVendas3 = 0, contVendas4 = 0, contVendas5 = 0;
        double unitario1, unitario2, unitario3, unitario4, unitario5, faturamento1, faturamento2, faturamento3, faturamento4, faturamento5, faturamentoTotal;

        Scanner teclado = new Scanner(System.in);

        unitario1 = 1.565;
        unitario2 = 1890;
        unitario3 = 2150;
        unitario4 = 2963;
        unitario5 = 3750;

        for (int aux = 1; aux <= 1000; aux++) {
            System.out.print("Informe o código do equipamento: ");
            codigo = teclado.nextLine();

            if (codigo.equalsIgnoreCase("A2450"))
                contVendas1++;
            else if (codigo.equalsIgnoreCase("B2356"))
                contVendas2++;
            else if (codigo.equalsIgnoreCase("C3900"))
                contVendas3++;
            else if (codigo.equalsIgnoreCase("D4100"))
                contVendas4++;
            else if (codigo.equalsIgnoreCase("E6749"))
                contVendas5++;
            else
                System.out.print("Código inválido, verifique e tente novamente.");
        }

        faturamento1 = contVendas1 * unitario1;
        faturamento2 = contVendas2 * unitario2;
        faturamento3 = contVendas3 * unitario3;
        faturamento4 = contVendas4 * unitario4;
        faturamento5 = contVendas5 * unitario5;

        faturamentoTotal = faturamento1 + faturamento2 + faturamento3 + faturamento4 + faturamento5;

        System.out.println("Faturamento total: " + faturamentoTotal);
    }
}
