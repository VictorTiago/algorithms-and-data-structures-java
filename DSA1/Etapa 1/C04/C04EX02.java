import java.util.Scanner;
public class C04EX02 {
    public static void main(String[] args) {
        // Autor: Victor Tiago Avelino Da Silva
        String nome, cpf, identidade, nomeEmpresa;
        long tituloEleitor, carteiraMotorista;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual é seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Informe seu cpf ");
        cpf = teclado.nextLine();
        System.out.print("Informe o número da sua identidade ");
        identidade = teclado.nextLine();
        System.out.print("Informe o nome da sua empresa ");
        nomeEmpresa = teclado.nextLine();
        System.out.print("Informe seu titulo de eleitor ");
        tituloEleitor = teclado.nextLong();
        System.out.print("Informe seu número da carteira de motorista ");
        carteiraMotorista = teclado.nextLong();
        System.out.print("Informe seu salário ");
        salario = teclado.nextDouble();

        System.out.println("Ficha funcional de: " + nome);
        System.out.println();
        System.out.print("Documentos: ");
        System.out.println("CPF ............................................."+cpf);
        System.out.println("C.I. ..............................................."+identidade);
        System.out.println("Titulo de eleitor ..........................."+tituloEleitor);
        System.out.println("Carteira de motorista ..................."+carteiraMotorista);
        System.out.println();
        System.out.println("Empresa:"+nomeEmpresa);
        System.out.println("Salário: R$"+salario);
        teclado.close();
    }
}