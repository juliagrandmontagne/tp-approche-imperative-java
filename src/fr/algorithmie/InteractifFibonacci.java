package fr.algorithmie;
import java.util.Scanner;
public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("choisir un rang N dans la suite de Fibonacci");
        int N = scanner.nextInt() ;
        int N_1 = 1;
        int N_2 = 0;
        int Fibo = 0;
       if ( N == 0 )
       {
           System.out.println(N);
       }
           else if ( N == 1 ){
           System.out.println(N);
       }
       else if ( N < 0 ){
           System.out.println("le rang N ne peut etre negatif nice try ");
       }
       else
       {
            for (int i = 1; i < N; i++) {
                Fibo= N_1 + N_2;
                N_2 = N_1;
                N_1 = Fibo;
            }
            System.out.println(Fibo);
       }

    }
}
