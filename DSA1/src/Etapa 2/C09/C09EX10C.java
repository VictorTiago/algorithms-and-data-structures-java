public class C09EX10C {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux * 2 - 1;
            den = aux * 2;
            serie += num / den;
        }
        serie = (1.0 / 3) * (Math.pow(serie, 2));
        System.out.print("Resultado da serie: " + serie);
    }
}
