public class C09EX10A {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);
            serie += num / den;
        }
        System.out.print("O resultado da série é: " + serie);
    }
}
