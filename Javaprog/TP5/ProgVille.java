public class ProgVille{
    static public void main (String[]args){
        MaDate d1 = new MaDate(27, 3, 2006);
        MaDate d2 = new MaDate(20, 9, 2003);
        Adresse a1 = new Adresse("617 rue des oiseleurs", "54200", "Ecrouves");
        Adresse a2 = new Adresse("144 rue quartier dorée", "54200", "Toul");
        Personne p1 = new Personne("Comte", "Gabriel", a1, d1);
        Personne p2 = new Personne("Comte", "Nathanaël", a1, d1);
        Personne p3 = new Personne("Comte", "Elric", a2, d2);
        System.out.println(p1.habiterMemeVille(p2));
        System.out.println(p1.habiterMemeVille(p3));
        System.out.println(p2.habiterMemeVille(p3));
        System.out.println(p1.etrePlusJeune(p2));
        System.out.println(p2.etrePlusJeune(p3));
        System.out.println(p3.etrePlusJeune(p1));
    }
}