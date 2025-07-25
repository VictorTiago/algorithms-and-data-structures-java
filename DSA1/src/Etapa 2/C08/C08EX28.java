public class C08EX28 {
    public static void main(String[] args) {
        double media, num , somaN = 0, contN = 0 ;
        //Victor Tiago Avelino Da Silva

        for (int i = 1; i <= 1000; i++){
            for (int j = 1; j <= 1000; j++){

                if (i == j*(j+1)*(j+2)){
                    num = i;
                    System.out.println(num);

                    somaN += num;
                    contN++;
                }
            }
        }
        media = somaN/contN;
        System.out.println("\nMédia: "+media);
    }
}
