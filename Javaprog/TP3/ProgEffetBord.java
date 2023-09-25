class ProgEffetBord {
    public static void main(String [] args) {
        // dates initialisees
        MaDate d1 = new MaDate(4,4,2000);
        MaDate d2 = new MaDate(4,4,2000);
        MaDate d3 = d1;

        // on modifie d1 et d4
        d1.jour = 1;
        d2.jour = 2;
        d3.jour = 3;

        // on affiche les dates
        System.out.println("d1: " + d1.jour + "," + d1.mois + "," + d1.annee);
        System.out.println("d2: " + d2.jour + "," + d2.mois + "," + d2.annee);
        System.out.println("d3: " + d3.jour + "," + d3.mois + "," + d3.annee);
    }
}