package fr.algorithmie;
import java.util.Scanner;
public class InteractifTantQue {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrer un nombre entre 1 et 10");
        int nb = scanner.nextInt() ;  // Read user input

        while (1>nb || nb>10)
        {
            System.out.println("Le nombre n'est pas bon, entrer un nombre entre 1 et 10");
            nb = scanner.nextInt() ;  // Read user input
        }

        System.out.println("le nombre est: " + nb);

    }
}
