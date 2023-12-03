/**
 * represente une carte trés simple juste avec une valeur
 */
class Carte{

  /** 
   * la valeur de la carte
   */ 
  private int valeur;

  /**
   * constructeur de carte
   * 
   * @param val valeur de la carte
   */
  public Carte (int val){
    this.valeur = val;
  }

  /**
   * getter
   */
  public int getValeur(){
    return (this.valeur);
  }

}
