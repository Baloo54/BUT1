/**
 * creer un objet de type Incompatibilite
 */
public class Imcompatibilite {
    /**
     * attribut de la class: tabCouples
     */
    private Couple tabCouples[];
    /**
     * construceur avec 1 param
     * 
     * @param unCouple
     */
    public Imcompatibilite(Couple[] unCouple) {
        this.tabCouples = unCouple;
    }
    /**
     * methode compatible
     * 
     * @param a objet Animal
     * @param b objet Animal
     * @return true uniquement si a n'est pas un prédateur de b ET si b n'est pas un prédateur de a.
     */
    public boolean compatible(Animal a, Animal b) {
        boolean res = true;
        int i = 0;
        while(i < this.tabCouples.length && !res){
            int predateur = this.tabCouples[i].getPredateur();
            int proie = this.tabCouples[i].getProie();
            if (a.getType() == predateur && b.getType() == proie) res = false;
            if (b.getType() == predateur && a.getType() == proie) res = false;
            i++;
        }
        return res;
    }
    /**
     * methode ajout d'un predateur
     * 
     * @param predateur
     * @param proie
     */
    public void ajouterPredateurProie(int predateur, int proie){
        Animal unPredateur = new Animal(predateur);
        Animal uneProie = new Animal(proie);
        if(compatible(unPredateur, uneProie)){
            Couple couple = new Couple(predateur, proie);
            int tailleTab = this.tabCouples.length + 1;
            Couple[] tabTemp = new Couple[tailleTab];
            for(int i = 0; i < tailleTab - 1; i++) tabTemp[i] = this.tabCouples[i];
            tabTemp[tailleTab] = couple;
            this.tabCouples = tabTemp;
        }
    }
    /**
     * methode proie predateur :
     * 
     * @param a un animal correspondanr à la proie
     * @return un tableau de couple où avec les proie des predateurs.
     */
    public Couple[] couplePredateur(Animal a) {
        int total = 0;
        for(int i = 0; i < this.tabCouples.length; i++){
            int proie = this.tabCouples[i].getProie();
                if (a.getType() == proie) total++;
        }
        if (total != 0){
            Couple[] tabRes = new Couple[total];
            int d = 0;
            for(int i = 0; i < this.tabCouples.length; i++){
            int proie = this.tabCouples[i].getProie();
                if (a.getType() == proie) tabRes[d++] = this.tabCouples[i];
            }
            return tabRes;
        }
        else return null;
    }
}