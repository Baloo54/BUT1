import java.nio.channels.FileChannel.MapMode;

/** 
 * classe Personne
 */
public class Personne {
    // attributs identite
    private String nom;
    private String prenom;

    // attribut objet adresse
    private Adresse adresse;

    //attribut date de naissance
    private MaDate dateN;

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
        System.out.println("- né(e) le: "+ this.dateN.getJour() + "/"+ this.dateN.getMois() + "/" + this.dateN.getAnnee());
        System.out.println("- habite: " + this.adresse.getRue() + " à " + this.adresse.getVille() + " " + this.adresse.getCode());
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
                this.dateN.setJour(2);;
            }
            else{
                this.dateN.setJour(j);
            }
        }
    }
    public void demenager(Adresse d){
        if(d != null){
            this.adresse = new Adresse(d);
        }
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public MaDate getDateN() {
        return dateN;
    }
    public void setPrenom(String prenom) {
        if(prenom != null) this.prenom = prenom;
    }
    public void setNom(String nom) {
        if(nom != null) this.nom = nom;
    }
    public void setAdresse(Adresse adresse) {
        Adresse a = new Adresse(adresse);
        this.adresse = a;
    }
    public void setDateN(MaDate dat) {
        this.dateN = dat;
    }
    public boolean habiterMemeVille(Personne p){
        return this.adresse.avoirMemeVille(p.adresse);
    }
    public boolean etrePlusJeune(Personne p){
        return false == this.dateN.etreAvant(p.dateN);
    }
  }