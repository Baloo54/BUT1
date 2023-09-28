/**
 * represente une date sous la forme jour, mois, annee
 */

public class MaDate{

  /**
   * attribut jour, mois, annee qui representent la date
   */
  int jour, mois, annee;

  /** 
   * constructeur par defaut : date du 1/1/1970
   */ 
  public MaDate(){
    this.jour = 1;
    this.mois = 2;
    this.annee = 2000;
  }

  /**
   * construit une date quelconque
   *  
   * @param j jour de la date construite
   * @param m mois de la date construite
   * @param a annee de la date construite
   */
  public MaDate(int j, int m, int a){
    this.jour = j;
    this.mois = m;
    this.annee = a;
  }

  /**
   * constructeur par copie
   * 
   * @param d date modele a copier
   */
  public MaDate(MaDate d){
    // verifie si d existe
    if (d != null){
    
      // d existe => construit la date a partir de d
      this.jour = d.jour;
      this.mois = d.mois;
      this.annee = d.annee;

    } else {

      // d n'existe pas => construit date par defaut
      this.jour = 1; 
      this.mois = 1;
      this.annee = 1970;
    }  
  }


}