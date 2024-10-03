package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args)  {
         int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        int lastNumberTable = tableau.length -1;
        System.out.println(tableau[lastNumberTable]);
        //Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans votre code pour l’expliquer.
        System.out.println(tableau[10]);
        //message eurreur Index 10 out of bounds for length 8 il ne peut pas aller aux dela de 7 car le tableau n'est pas defini aux dela de 8 indice zero compris
    }
}
