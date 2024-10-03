package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args)
    {
        int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        //Declaration variable pour désincroniser les index
        int l = 0;
        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int [] arrayCopy = new int[array.length];
        //on incremente le nouvel array avec les valeur de l'ancien
        for ( int i = array.length-1; i >-1 ; i--)
        {

            arrayCopy[l] = array[i];
            l = l+1;
        }
        //verification visuel
        for ( int i = 0; i < arrayCopy.length; i++)
        {
            System.out.println(arrayCopy[i]);
            System.out.println(array[i]);
        }

    }
}
