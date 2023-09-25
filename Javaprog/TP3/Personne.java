import java.nio.channels.FileChannel.MapMode;

class Personne {
    /**
     * attributs lies a l identite de la personne
     */
    MaDate dateN ;
    String nom, prenom;

    /**
     * attributs lies a la date de naissance de la personne


    /**
     * attributs lies a l adresse de la personne
     */
   Adresse rcv;
    /**
     * constructeur par defaut
     * personne anonyme
     * avec une adresse inconnue
     * nee a une date par defaut
     */
    public Personne() {
        this.rcv = new Adresse();
        this.dateN = new MaDate();
    }
    public Personne(String n, String p, MaDate d){
        this.rcv = new Adresse();
        this.nom = n;
        this.prenom = p;
        this.dateN = new MaDate(d);
    }
    public Personne(String n, String p, MaDate d, Adresse adr){
    this.nom = n;
    this.prenom = p;
    this.dateN = new MaDate(d);
    this.rcv = new Adresse(adr);
    }
}