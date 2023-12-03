/**
 * construit un objet de type Couple 
 */
public class Couple {
    /**
     * attribut de la class: proie et predateur
     */
    private int proie;
    private int predateur;
    /**
     * constructeur 2 parrametres.
     * 
     * @param predateurParam
     * @param proieParam 
     */
    public Couple(int predateurParam, int proieParam) {
        this.predateur = predateurParam;
        this.proie = proieParam;
    }
    /**
     * methode acceusseur: getProie
     * 
     * @return proie
     */
    public int getProie(){
        return this.proie;
    }
    /**
     * methode accesseur: getPredateur
     * 
     * @return predateur
     */
    public int getPredateur(){
        return this.predateur;
    }
}