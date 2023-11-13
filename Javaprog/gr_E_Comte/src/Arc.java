public class Arc {
    /**
     * attributs Arc : degat, fleches 
     */
    private int degat;
    private int fleches;
    /**
    * constructeur par défaut
    */
    public Arc() {
        this.degat = 5;
        this.fleches = 3;
    }
    /**
     * constructeur avec paramètres
     * @param dg degat
     * @param fl fleches
     */
    public Arc(int dg, int fl) {
        //vérifie que les paramètres sont positifs
        this.degat = dg > 0 ? dg : 0;
        this.fleches = fl > 0 ? fl : 0;
    }
    /**
     * méthodes Accesseurs: getDegat, getFleches
     * @return degat, fleches
     */
    public int getDegats() {
        return this.degat;
    }
    public int getFleches() {
        return this.fleches;
    }
    /**
     * méthode recharger Arc
     * 
     * @param nFleches nouvelles fleches s'ajoutant au nombre de fleches du carquois
     */
    public void recharger(int nFleches){
        //vérifie que le paramètre est positif 
        this.fleches += nFleches > 0 ? nFleches: 0;
    }
    /**
     * méthode utiliser Arc
     * 
     * @return degat si fleches > 0, 0 sinon
     */
    public int utiliser(){
        //vérifie que le nombre de flèches est supérieur à 0
        if (this.fleches > 0) {
            this.fleches--;
            return this.degat;
        }
        return 0;
    }
    /**
     * méthode toString
     * 
     * @return "-arc(d: " + degat + ", f: " + fleches
     */
    public String toString() {
        return "-arc(d: " + degat + ", f: " + fleches + ")";
    }
}   

