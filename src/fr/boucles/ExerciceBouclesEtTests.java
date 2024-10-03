package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args)  {
    int[]array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
     for ( int i = 0; i < array.length; i++)
    {
        System.out.println(array[i]);
    }
         for ( int i = array.length-1; i >-1 ; i--)
    {
        System.out.println(array[i]);
    }
        for ( int i = 0; i < array.length; i++)
        {
            if (array[i]>3)
            {
                System.out.println(array[i]);
            }
            else { }
        }
        for ( int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0 )
            {
                System.out.println(array[i]);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        for ( int i = 0; i < array.length; i++)
        {
            if (i % 2 == 0 )
            {
                System.out.println(array[i]);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for ( int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 1 )
            {
                System.out.println(array[i]);
            }
        }
    }

}
