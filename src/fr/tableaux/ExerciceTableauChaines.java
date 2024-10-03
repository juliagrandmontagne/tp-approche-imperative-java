package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args)  {
        String [] monTableau = {"Paris","Lyon","Nante","Montpellier","Nice"};
        System.out.println(monTableau[0]);
        for (int i = 0; i < monTableau.length; i++)
        {
            System.out.println(monTableau[i]);
        }
        System.out.println(monTableau.length);
        monTableau[2] = "Reims";
        for (int i = 0; i < monTableau.length; i++)
        {
            System.out.println(monTableau[i]);
        }
    }
}
