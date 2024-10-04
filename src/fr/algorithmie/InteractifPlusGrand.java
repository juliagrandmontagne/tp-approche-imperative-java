package fr.algorithmie;
import java.util.Scanner;
public class InteractifPlusGrand {

    public static void main(String[] args)
    {
        int marqueur = -2147483648 ;
      for( int i = 1; i < 11; i++)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int nb = scanner.nextInt();
            while (marqueur < nb)
            {
                marqueur = nb;
            }

        }
        System.out.println(marqueur);
    }
}
