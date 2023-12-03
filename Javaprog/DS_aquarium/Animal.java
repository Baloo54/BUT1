/**
 * construit un objet de type animal
 */
public class Animal{
    /**
     * attributs de la class: type :un entier permettant de décrire l'animal et nomType: correspondant au nom du type d'animal
     */
    private int type;
    private String nomType;
    /**
     * constructeur par défaut
     */
    public Animal(){
        this.type = 0;
        this.nomType = "Guppi";
    }
    /**
     * constructeur avec parram 
     * 
     * @param typeParam correspond au type de l'animal
     */
    public Animal(int typeParam){
        switch (this.type) {
            case 1:
                this.nomType = "Crabe";
                break;
            case 2:
                this.nomType = "Pouple";
                break;
            case 3:
                this.nomType = "Anémone";
                break;
            case 4:
                this.nomType = "Reguin";
                break;
            default:
                this.nomType = "Guppi";
                break;
        }
        this.type = (typeParam < 0 || typeParam > 4) ? 0 : typeParam;
    }
    /**
     * methode accesseur: getType
     * 
     * @return type
     */
    public int getType(){
        return this.type;
    }
}