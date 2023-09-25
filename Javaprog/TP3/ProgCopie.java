public class ProgCopie {
    public static void main(String[]arg){
        MaDate d1 = new MaDate(1,1,1970);
        MaDate d2 = new MaDate(d1);
        d2.mois = 9;
        System.out.println("d1: " + d1.jour + "," + d1.mois + "," + d1.annee);
        System.out.println("d2: " + d2.jour + "," + d2.mois + "," + d2.annee);
        System.out.println("d1: " + d1 + ", d2: " + d2);
    }
}
