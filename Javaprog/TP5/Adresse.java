/**
 * represente une adresse sous la forme rue, codepostal et ville
 */
class Adresse {

  /**
   * attributs qui définissent une adresse
   */
  private String rue, code, ville;

  /**
   * construit une adresse par defaut (inconnue)
   */
  public Adresse() { 
    this.rue = "inconnue";
    this.code = "inconnu";
    this.ville = "inconnu";
  }

  /**
   * construit une adresse quelconque 
   * 
   * @param r nom de la rue
   * @param c code postal de la ville
   * @paral v ville de l'adresse
   */
  public Adresse(String r, String c, String v){
    this.rue = r;
    this.code = c;
    this.ville = v;
  }

  /**
   * constucteur par copie : copie une adresse
   *
   * @param a adresse a copier (modele utilise pour construire la nouvelle adresse)
   */
  public Adresse(Adresse a){
    if (a != null){
      // a existe => on l'utilise comme modele
      this.rue = a.rue;
      this.code = a.code;
      this.ville = a.ville;
    } else {
      // a n'existe pas => on utilise une adresse par defaut
      this.rue = "inconnue";
      this.code = "inconnu";
      this.ville = "inconnu";
    }
  }
  public String getRue(){
    return this.rue;
  }
  public String getCode(){
    return this.code;
  }
  public String getVille(){
    return this.ville;
  }
  public void setRue(String r){
    this.rue = r;
  }
  public void setCode(String c){
    this.code = c;
  }
  public void setVille(String v){
    this.ville = v;
  }
  public boolean avoirMemeVille(Adresse a){
    return this.ville.equals(a.ville);
  }
}