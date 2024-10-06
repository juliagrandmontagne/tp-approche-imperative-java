package fr.algorithmie;
import java.util.Scanner;
public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreBatonDispo = 21;
        int random = 0;
        int nb = 0 ;
         // Read user input
        while ( nombreBatonDispo > 0)
        {
            System.out.println("Entrer un nombre entre 1 et 3");
            nb = scanner.nextInt() ;
            if(nb < 1 || nb > 3 )
            {
                System.out.println("vous avez tricher game over");
                break;
            }
            nombreBatonDispo = nombreBatonDispo - nb;
            if(nombreBatonDispo < 0)
            {
                System.out.println("vous avez perdu");
                break;
            }
            random = (int) ((3 * Math.random()) + 1);
            System.out.println("l'ordinateur a choisie "+random+" baton(s)");
            nombreBatonDispo = nombreBatonDispo - random;
            System.out.println("il reste "+nombreBatonDispo+" baton(s)");
            if (nombreBatonDispo <= 0)
            {
                System.out.println("vous avez gagner");
            }

        }

    }
}
