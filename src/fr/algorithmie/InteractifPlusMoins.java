package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        int random = (int) ((100 * Math.random()) + 1);
        int nbrtentative = 1;
        int nb = scanner.nextInt() ;  // Read user input

        System.out.println("Entrer un nombre entre 1 et 100");

        if (nb != random){
            if (nb > random){System.out.println("Le nompbre proposé est trop grand");}
            else{System.out.println("Le nompbre proposé est trop petit");}
            while (nb != random)
            {
                System.out.println("Entrer un nombre entre 1 et 100");
                nbrtentative = nbrtentative +1 ;
                nb = scanner.nextInt() ;  // Read user input
                if (nb > random)
                {
                    System.out.println("Le nompbre proposé est trop grand");
                }
                else
                {
                    System.out.println("Le nompbre proposé est trop petit");
                }
            }
        }

        System.out.println("Bravo, vous avez trouvé en " + nbrtentative + " coups ");
    }
}
