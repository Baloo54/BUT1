import java.nio.channels.FileChannel.MapMode;

/** 
 * classe Personne
 */
public class Personne {
    // attributs identite
    String nom;
    String prenom;

    // attribut objet adresse
    Adresse adresse;

    //attribut date de naissance
    MaDate dateN;

    /**
     * constructeur par defaut
     */  
    public Personne() {
      // une identite anonyme
      this.nom        = "Anonyme";
      this.prenom     = "Anonyme";
    
      // une adresse par defaut
      this.adresse    = new Adresse();

      // une date de naissance par defaut
      this.dateN  = new MaDate();
    }

    /**
     * constructeur avec des parametres
     *
     * @param nom nom de la personne
     * @param prenom prenom de la personne
     * @param adr adresse de la personne
     * @param naiss date de naissance de la personne
     */  
    public Personne(String nom, String prenom, Adresse adr, MaDate naiss) {
      // initialise l'identite
      this.nom        = nom;
      this.prenom     = prenom;

      // ATTENTION : eviter les effets de bord et gerer adr null
      // construit une adresse par copie
      this.adresse    = new Adresse(adr);

      // ATTENTION : eviter les effets de bord et gerer naiss null
      // une date de naissance par copie
      this.dateN  = new MaDate(naiss);
    }
    public void afficher(){
        System.out.println(this.nom + " " + this.prenom);
        System.out.println("- né(e) le: "+ this.dateN.jour + "/"+ this.dateN.mois + "/" + this.dateN.annee);
        System.out.println("- habite: " + this.adresse.rue + " à " + this.adresse.ville + " " + this.adresse.code);
    }
    public void setNom(String mn){
        if(mn != null){
            this.nom = mn;
        }
    }
    public void seMarier(Personne p){
        if(p != null){
            this.nom = p.nom;
        }
    }
    public void setDate(MaDate d){
        if(d != null){
            this.dateN = new MaDate(d); 
        }
    }
    public void changerDateJour(int j){
        if(j != 0){
            if((j<1) | (j>31)){
                this.dateN.jour = 2;
            }
            else{
                this.dateN.jour = j;
            }
        }
    }
    public void demenager(Adresse d){
        if(d != null){
            this.adresse = new Adresse(d);
        }
    }
  }