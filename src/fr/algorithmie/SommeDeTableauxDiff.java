package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args)
    {
        int[]array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[]array2 = {-1,12,17,14,5,-9,0,18};
        int sommearray = 0;
        int sommearray2 = 0;
        int [] arrayOfSomme = new int[2];
        for ( int i = 0; i < array.length; i++)
        {
            sommearray = sommearray+ array[i];
        }
        for ( int i = 0; i < array2.length; i++)
        {
            sommearray2 = sommearray2+ array2[i];
        }
        arrayOfSomme[0] = sommearray;
        arrayOfSomme[1] = sommearray2;
        for ( int i = 0; i < arrayOfSomme.length; i++)
        {
            System.out.println(arrayOfSomme[i]);
        }
    }
}
