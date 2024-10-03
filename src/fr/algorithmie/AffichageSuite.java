package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args)
    {
        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        for ( int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        for ( int i = 0; i <= 10; i++)
        {
            System.out.println(i);
        }
        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        for ( int i = 1; i <= 10; i = i + 2)
        {
            System.out.println(i);
        }
        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        int j = 1;
        while (j <= 10)
        {
            System.out.println(j);
            j++;
        }
        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        int k = 0;
        while (k <= 10)
        {
            System.out.println(k);
            k = k+2;
        }
        //Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        int l = 1;
        while (l <= 10)
        {
            System.out.println(l);
            l = l+2;
        }
    }
}
