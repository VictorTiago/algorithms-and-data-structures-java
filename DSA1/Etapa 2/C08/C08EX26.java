public class C08EX26 {
    public static void main(String[] args) {
        //Victor Tiago Avelino Da Silva
        //rep desenho asteriscos
        for (int aux = 1; aux <= 10; aux++) {

            for (int aux1 = 1; aux1 <= 10; aux1++) {
                for (int aux2 = 1; aux2 <= aux1; aux2++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int aux1 = 10; aux1 >= 1; aux1--) {
                for (int aux2 = 1; aux2 <= aux1; aux2++) {
                    System.out.print("*");
                    System.out.println();
                }
            }
        }
    }
}