public class MaDate {
    /**
     * attributs jour , mois , an de la date
     */
    int jour, mois, annee;

    /**
     * constructeur par defaut : date du 1/1/1970
     */
    public MaDate() {
        this.jour = 1;
        this.mois = 1;
        this.annee = 1970;
    }
    public MaDate(MaDate d){
        this.jour = d.jour;
        this.mois = d.mois;
        this.annee = d.annee;
    }

    /**
     * constructeur de date quelconque
     *
     * @param pJour jour de la date
     * @param pMois mois de la date
     * @param pAn   annee de la date
     */
    public MaDate(int pJour, int pMois, int pAn) {
        // initialise jour
        if (pJour < 1)
            pJour = 1;
        if (pJour > 31)
            pJour = 31;
        this.jour = pJour;

        // initialise mois
        if (pMois < 1)
            pMois = 1;
        if (pMois > 12)
            pMois = 12;
        this.mois = pMois;

        // initialise annee
        this.annee = pAn;
    }
}