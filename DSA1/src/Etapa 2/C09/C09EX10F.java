public class C09EX10F {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = Math.pow(aux, 2);
            den = Math.pow(aux * 2, 2);
            serie += num / den;
        }
        System.out.print("Resultado da serie: " + serie);
    }
}