public class C09EX10D {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux + (aux - 1);
            den = Math.pow(aux, 2);
            serie += num / den;
        }
        System.out.print("Resultado da serie: " + serie);
    }
}

