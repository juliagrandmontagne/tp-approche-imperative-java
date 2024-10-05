package fr.algorithmie;

public class Rotation {
    public static void main(String[] args)
    {
        int [] arrayRotation = {15,-3,8};
        int [] arrayCopy = new int[arrayRotation.length];
        arrayCopy[0] = arrayRotation[arrayRotation.length-1];
        System.out.println(arrayCopy[0]);
        for ( int i = 1; i < arrayRotation.length; i++)
        {
            arrayCopy[i] = arrayRotation [i-1];
            System.out.println(arrayCopy[i]);
        }

    }

}
