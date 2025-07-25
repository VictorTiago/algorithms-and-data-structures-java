public class C09EX08 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 20; aux++) {
            num = (aux * 2 + 1) + Math.sqrt(aux * 4 + 1);
            den = Math.pow(aux, 5);
            serie += num / den;
        }
        serie = Math.pow(serie, 2);
        System.out.print("O resultado é: " + serie);
    }
}
