public class C09EX10B {
    public static void main(String[] args) {
        //Autor: Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 100; aux++) {
            num = aux * 2;
            den = aux * 3;
            serie += num / den;
        }
        serie = 1 + Math.sqrt(serie);
        System.out.print("System.out.print: " + serie);
    }
}
