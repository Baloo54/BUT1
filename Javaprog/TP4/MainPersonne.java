public class MainPersonne {
    static public void main(String[] args){
        Adresse a = new Adresse("617 rue des oiseleurs", "54200", "Ecrouves" );
        MaDate d = new MaDate(27, 3, 2006);
        MaDate d2 = new MaDate(21, 4, 2003);
        Personne p = new Personne("Comte", "Gabriel", a, d);
        p.afficher();
        p.setNom("gaugenot");
        p.setDate(d2);
        p.afficher();
    }
}
