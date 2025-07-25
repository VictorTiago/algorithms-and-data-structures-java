import javax.swing.JOptionPane;

public class C08EX11 {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        String[] botoesSexo = {"M", "F"}, botoesEstadoCivil = {"C", "S", "O"}, botoesOlhos = {"A", "C", "P", "O"}, botoesCabelo = {"L","P","C", "R"}, botoesEscolaridade = {"1", "2", "3", "4"};
        String nome, idadeStr, salarioStr, nomeMaior = "";
        int idade, escolaridade, sexo, estadoCivil, corOlhos, corCabelos, contMulheres = 0;
        double salario, salarioMaior = 0, salarioMaiorMasculino = 0, salarioMenorMasculino = 0, diferencaMasculino;

        for (int aux = 1; aux <= 5; aux++) {
            nome = JOptionPane.showInputDialog(null,
                    "Informe o seu nome ",
                    "Aula de java",
                    JOptionPane.QUESTION_MESSAGE);

            idadeStr = JOptionPane.showInputDialog(null,
                    "Informe sua idade",
                    "Aula de Java",
                    JOptionPane.QUESTION_MESSAGE);

            idade = Integer.parseInt(idadeStr);

            sexo = JOptionPane.showOptionDialog(null,
                    "Informe seu sexo",
                    "Aula de Java",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesSexo,
                    botoesSexo[0]);

            String sexoStr = botoesSexo[sexo];

            estadoCivil = JOptionPane.showOptionDialog(null,
                    "Informe seu estado civil",
                    "Aula de Java",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesEstadoCivil,
                    botoesEstadoCivil[0]);

            String estadoCivilStr = botoesEstadoCivil[estadoCivil];

            corOlhos = JOptionPane.showOptionDialog(null,
                    "Informe a cor dos seus olhos",
                    "Aula de Java",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesOlhos,
                    botoesOlhos[0]);

            String corOlhosStr = botoesOlhos[corOlhos];

            corCabelos = JOptionPane.showOptionDialog(null,
                    "Informe a cor do seu cabelo",
                    "Aula de Java",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesCabelo,
                    botoesCabelo[0]);

            String corCabelosStr = botoesCabelo[corCabelos];

            salarioStr = JOptionPane.showInputDialog(null,
                    "Informe seu salário",
                    "Aula de Java",
                    JOptionPane.QUESTION_MESSAGE);

            salario = Double.parseDouble(salarioStr);

            if (aux == 1 || salario > salarioMaior) {
                salarioMaior = salario;
                nomeMaior = nome;
            }
            if (aux == 1 || salario > salarioMaiorMasculino && sexoStr.equalsIgnoreCase("M")) {
                salarioMaiorMasculino = salario;
            }
            if (aux == 1 || salario < salarioMenorMasculino && sexoStr.equalsIgnoreCase("M")) {
                salarioMenorMasculino = salario;
            }

            escolaridade = JOptionPane.showOptionDialog(null,
                    "Informe seu nível de escolaridade",
                    "Aula de Java",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    botoesEscolaridade,
                    botoesEscolaridade[0]);

            String escolaridadeStr = botoesEscolaridade[escolaridade];

            if (sexoStr.equalsIgnoreCase("F") && corCabelosStr.equalsIgnoreCase("L") && idade >= 18 && idade <= 25 && estadoCivilStr.equalsIgnoreCase("S") && salario > 10000 && escolaridadeStr.equalsIgnoreCase("4")) {
                contMulheres++;
            }
        }
            diferencaMasculino = salarioMaiorMasculino - salarioMenorMasculino;

            JOptionPane.showMessageDialog(null,
                    "Mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo: "+contMulheres+"\nPessoa com maior salário: "+nomeMaior+"\nDiferença entre maior e menor salário MASCULINO: "+diferencaMasculino,
                    "Aula de Java",
                    JOptionPane.INFORMATION_MESSAGE);

    }
}


