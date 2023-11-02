public class MaDate {

    /**
     * attributs MaDate
     */
    private int jour;
    private int mois;
    private int annee;
  
    /**
     * constructeur MaDate
     *
     * @param j jour de la date (entre 1 et 31)
     * @param m mois de la date (entre 1 et 12)
     * @param a annee de la date
     */
    public MaDate(){
      this.jour = 1;
      this.mois = 1;
      this.annee = 1970;
    }
   
    public MaDate(int j, int m, int a) {
          this.mois = m;
      // verifie mois correct
      if (this.mois < 1)
        this.mois = 1;
      if (this.mois > 12)
        this.mois = 12;
  
      this.annee= a;
      int k = getNbJours(); 
      this.jour = j;
      // verifie que le jour est correct
      if (this.jour < 1)
        this.jour = 1;
      if (this.jour > k) 
        this.jour = k;

    }
  
    /**
     * constructeur par copie
     */
    public MaDate(MaDate d) {
      if (d != null) {
        this.jour = d.jour;
        this.mois = d.mois;
        this.annee = d.annee;
      } else {
        // d inexistant => date par defaut
        this.jour = 1;
        this.mois = 1;
        this.annee = 1970;
      }
    }
    
    public void afficher(){
      int k = getNbJours();  
      if(this.jour < 1) this.jour = 1;
      if(this.jour > k) this.jour = k;
      if (this.mois < 1) this.mois = 1;
      if (this.mois > 12) this.mois = 12;
      System.out.println("jour: " + this.jour + " mois :" + this.mois + " année : " + this.annee);
    }
   
    public int getJour(){
      return this.jour;
    }
    
    public int getMois(){
      return this.mois;
    }
    
    public int getAnnee(){
      return this.annee;
    }
    
    public void setJour(int j){
      int k = getNbJours();  
      if(j < 1) this.jour = 1;
      if(j > k) this.jour = k;
      this.jour = j;
    }
    
    public void setMois(int m){ 
      if(m < 1) this.jour = 1;
      if(m > 12) this.jour = 12;
      this.mois = m;
    }
    
    public void setAnnee(int a){ 
      this.annee = a;
    }
    
    public int getNbJours(){
      return (this.mois % 2 == 1) || (this.mois == 8) ? 31 : (this.mois != 2)? 30 : ((this.annee % 400 == 0)||(((this.annee % 4) == 0) && ((this.annee % 100) != 0)))? 29 : 28;
    }
    
    public MaDate demain(){
      int k, j = this.jour + 1, m = this.mois, a = this.annee;
      k = getNbJours();      
      if(j > k){
        j = 1;
        m += 1;
        if(m > 12){
          m = 0;
          a += 1;
        }
      }
      MaDate d = new MaDate(j, m, a);
      return d;
    }
    
    public boolean etreAvant(MaDate d){
      return this.annee < d.annee ? true: (this.annee != d.annee ? false : ( this.mois < d.mois ? true : (this.mois != d.mois ? false : (this.jour < d.jour ? true : false)))); 
    }
    
    public String ToString(){
      return "(" + this.jour + "/" + this.mois + "/" + this.annee + ")";
    }
}

  