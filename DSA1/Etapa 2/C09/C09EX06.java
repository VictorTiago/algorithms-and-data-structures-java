public class C09EX06 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        double num, den, serie = 0;

        for (int aux = 1; aux <= 20; aux++) {
            num = aux;
            den = Math.sqrt(aux * 2);
            serie += num / den;
        }
        serie = 10 + serie;
        System.out.print("o resultado da serie é: " + serie);
    }
}
