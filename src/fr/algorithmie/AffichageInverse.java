package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args)
    {
        int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        /*  for ( int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for ( int i = array.length-1; i >-1 ; i--)
        {
            System.out.println(array[i]);
        }*/

        //Afficher l’ensemble des éléments du tableau arrayCopy grâce à une boucle
        //etape1 declaration du tableau vide
        int [] arrayCopy = new int[array.length];
        //etape2 on change chaque valeur du tableau vide
       for ( int i = 0; i < array.length; i++)
        {
            arrayCopy[i] = array[i];
        }
       //etape3 (facultatif) on visualise le tableau
        for ( int i = 0; i < arrayCopy.length; i++)
        {
            System.out.println(arrayCopy[i]);
        }

    }
}
