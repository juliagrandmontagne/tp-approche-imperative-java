package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("tapper 1 pour ajouter un nombre tapper 2 pour Afficher les nombres existants. tapper 3 pour quitter le programme");
        int nb = scanner.nextInt() ;  // Read user input
        int nb2 = 0;
        int[]array1 = {};
        while ( nb != 3)
        {
            if(nb == 1)
            {
                System.out.println("tapper un nombre");
                nb2 = scanner.nextInt() ;
                int [] arrayCopy = new int[array1.length+1];
                for (int i = 0; i < array1.length; i++) {
                    arrayCopy[i] = array1 [i];
                }
                arrayCopy[array1.length] = nb2;
                array1=arrayCopy;
            } else if (nb == 2)
            {
                for (int i = 0; i < array1.length; i++)
                {
                    System.out.println(array1 [i]);
                }
            }
            else
            {
                System.out.println("merci de choisir entre 1 ou 2 ou 3 ");
            }
            System.out.println("tapper 1 pour ajouter un nombre tapper 2 pour Afficher les nombres existants. tapper 3 pour quitter le programme");
            nb = scanner.nextInt() ;  // Read user input
        }
    }
}
