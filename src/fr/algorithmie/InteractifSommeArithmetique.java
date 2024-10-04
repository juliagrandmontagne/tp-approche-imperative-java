package fr.algorithmie;
import java.util.Scanner;
public class InteractifSommeArithmetique {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrer un nombre");
        int nb = scanner.nextInt() ;  // Read user input
        int somme = 0;
        for (int i =1; i<=nb ; i++ )
        {
            somme = somme +i;

        }
        System.out.println(somme);
    }
}
