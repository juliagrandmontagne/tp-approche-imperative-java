package fr.algorithmie;
import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrer un nombre");
        int nb = scanner.nextInt() ;  // Read user input

        for (int i =1; i<11 ; i++ )
        {
            System.out.println(i+nb );
        }
    }
}
