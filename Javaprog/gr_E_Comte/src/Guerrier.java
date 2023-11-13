public class Guerrier {
     /**
     * attributs Guerrier : nom, pv, arc
     */
    private String nom;
    private int pv;
    private Arc arc;
    /**
     * constructeur avec un paramètre nom
     * 
     * @param pNom nom du guerrier
     */
    public Guerrier(String pNom) {
        //vérifie que le paramètre n'est pas null
        this.nom = pNom != null ? pNom : "Guerrier";
        this.pv = 10;
        this.arc = null;
    }
    /**
     * constructeur avec deux paramètres nom et pv
     * 
     * @param pNom nom du guerrier
     * @param p points de vie du guerrier
     */
    public Guerrier(String pNom, int p) {
        //vérifie que le paramètre n'est pas null
        this.nom = pNom != null ? pNom : "Guerrier";
        //vérifie que le paramètre est positif donc le pv est égal à p sinon 1
        this.pv = p > 0 ? p : 1;
        this.arc = null;
    }
    /**
     * méthode Accesseur: getPv, getArc, getNom
     * 
     * @return pv, arc, nom
     */
    public int getPv() {
        return this.pv;
    }
    public Arc getArc() {
        return this.arc;
    }
    public String getNom() {
        return this.nom;
    }
    /**
     * méthode etreBlesse
     * 
     * @return true si pv = 0, false sinon
     */
    public boolean etreBlesse() {
        //vérifie que le nombre de points de vie est égal à 0
        return this.pv == 0 ? true : false;
    }
    /**
     * méthode subirDegat
     * 
     * @param degat degat subit par le guerrier
     */
    public void subirDegat(int degat) {
        //vérifie que le paramètre est positif
        if (degat > 0) {
            //vérifie que le nombre de points de vie est supérieur à 0
            if (this.pv > 0) {
                this.pv -= degat;
                //vérifie que le nombre de points de vie est inférieur à 0
                if (this.pv < 0) {
                    this.pv = 0;
                }
            }
        }
    }
    /**
     * méthode prendreArc
     * 
     * @param arc arc pris par le guerrier
     * @return true si l'arc est pris, false sinon
     */
    public boolean prendreArc(Arc arc) {
        //vérifie que le gerrier n'est pas blesse et que l'arc n'est pas null
        if ((arc != null) && (!etreBlesse())) {
            //vérifie que le guerrier n'a pas d'arc
            if (this.arc == null) {
                this.arc = arc;
                return true;
            }
        }
        return false;
    }
    /**
     * méthode poserArc
     * 
     * @return arc
     */
    public Arc poserArc() {
        //vérifie que le guerrier a un arc et que le guerrier n'est pas blesse
        if ((this.arc != null) && (!etreBlesse())) {
            Arc arc = this.arc;
            this.arc = null;
            return arc;
        }
        return null;
    }
    /**
     * méthode attaquer
     * 
     * @param victime victime du guerrier : type Guerrier
     * @return true si la victime est blesse, false sinon
     */
    public boolean attaquer(Guerrier victime) {
        //vérifie que le guerrier n'est pas blesse et que la victime n'est pas null et que l'attaquant a un arc
        if ((victime != null) && (!etreBlesse()) && (this.arc != null)) {
            int degat = this.arc.utiliser();
            //vérifie que le degat est supérieur à 0 et que la victime n'est pas blesse
            if ((degat > 0) && (!victime.etreBlesse())) {
                victime.subirDegat(degat);
                return true;
            }
        }
        return false;
    }
    /**
     * méthode toString
     * 
     * @return nom + "(" + pv + ")" + "-arc(d: " + degat + ", f: " + fleches
     */
    public String toString() {
        //vérifie que le guerrier a un arc
        if (this.arc != null) {
            return this.nom + "(" + this.pv + ")" + this.arc.toString();
        }
        return this.nom + "(" + this.pv + ")";
    }
}
