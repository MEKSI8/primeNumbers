import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int max = input.nextInt();

        for (int i = 2; i <=max ; i++) {

            boolean isPrime = true;

            for (int j = 2; j <i ; j++) {

                if (i%j==0){
                    isPrime=false;
                }
            }

            if (isPrime){
                System.out.print(i+" ");
            }

        }
    }
}