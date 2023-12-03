import java.util.Scanner;
class Logs{
    private int min, max;
    private double moyenne;
    private int[] connexions; // tableau d'entiers
    private int[][] superconnexions;
              
    // ################ QUESTION 1 ########################

	/**
	 * constructeur ou tous les nombres de connexions mensuelles sont
	 * supposes nuls
	 * 
	 * @param n
	 *            nombre de mois d'etude (au moins 1)
	 */
    public Logs(int n){
		this.connexions = n > 0 ? new int[n] : new int[1];
    }

	// ################ QUESTION 2 ########################

	/**
	 * pour l'affichage
	 * 
	 * @return chaine de caracteres representant le releve de
	 *         connexions
	 */
    public String toString(){
        String s = "[";
        for(int i = 0; i < this.connexions.length; i++){
            s += this.connexions[i] + ",";}
            s += "]";
        return "tableau:"+ s + " min: "+this.min + " max: "+this.max + " moyenne: "+ this.moyenne;
        }

	// ################ QUESTION 3 ########################

	/**
	 * methode de saisie des releves de connexions
	 */
    public void saisirConnexions(){
        Scanner sc = new Scanner(System.in);
        int var;
        var = sc.nextInt();
        for(int i=0; i<this.connexions.length; i++){
            var = -1;
            while(var<0) {
                var = sc.nextInt();}
            this.connexions[i] = var;
        }
        calculMinMaxMoy();
    }
	/**
	 * methode qui met a jour les attributs min max et moyenne
	 */
	private void calculMinMaxMoy() {
        this.min = this.connexions[0];
        this.max = this.connexions[0];
        this.moyenne = 0;
		for(int i = 0; i < this.connexions.length; i++){
            if(this.connexions[i] < this.min) this.min = this.connexions[i];
            if(this.connexions[i] > this.max) this.max = this.connexions[i];
            this.moyenne += this.connexions[i];
        }
        this.moyenne = this.moyenne/this.connexions.length;
	}

	// ################ QUESTION 4 ########################
	
	/**
	 * permet de corriger des elements successifs du tableau de
	 * nombres de connexions mensuelles
	 * 
	 * @param mois_debut
	 *            indice de la premiere valeur a modifier
	 * @param tab
	 *            nouvelles valeurs
	 */
    public void corrigerConnexions(int moisDebut, int[] tab){
        int moisFin = tab.length;
        if((moisDebut + tab.length) > connexions.length) moisFin = connexions.length - moisDebut;
        for(int i=0; i<moisFin; i++){
            if(tab[i]>0) this.connexions[moisDebut+i] = tab[i];
        }
        calculMinMaxMoy();
    }

	// ################ QUESTION 5 ########################

	/**
	 * permet d'inverser l'ordre des valeurs stockees dans le tableau
	 * de nombres de connexions mensuelles
	 */
	public void inverserConnexions() {
		int indiceFin = this.connexions.length -1;
        for(int i=0; i < indiceFin; i++){
            int tmp = this.connexions[i];
            this.connexions[i] = this.connexions[indiceFin];
            this.connexions[indiceFin] = tmp;
            indiceFin --;
        }
	}

	// ################ QUESTION 6 ########################

	/**
	 * permet de rentrer une nouvelle valeur (le nombre de connexions
	 * du dernier mois ecoule) dans le tableau, et met a jour le
	 * nombre minimum, maximum et moyen de connexions
	 * <p>
	 * la case i contient toujours le nombre de connexions mensuelles
	 * enregistre i mois auparavant
	 * 
	 * @param nv
	 *            nouvelle valeur
	 */
	public void entrerNouveauReleve(int nv) {
        if (nv > 0){
            for(int i = this.connexions.length - 2; i >= 0; i --){
                this.connexions[i+1] = this.connexions[i];
            }
            this.connexions[0] = nv;
        }
        calculMinMaxMoy();
	}

	// ################ QUESTION 7 ########################

	/**
	 * constructeur a partir d'un tableau a 2 dimensions de taille n x
	 * 12 dont
	 * la case {[i,j]} correspond au j-ieme mois jour i-ieme.
	 * 
	 * @param tab2D
	 *            tableau a 2 dimensions
	 */
	public Logs(int[][] tab2D) {
		this.connexions = new int[12];
		for(int i = 0; i <= 11; i++){
			for(int j = 0; j <= 30; j++){
				this.connexions[i] += tab2D[i][j];
			}
		}
		this.inverserConnexions();
		this.calculMinMaxMoy();
	}
	// ################ QUESTION 8 ########################

	/**
	 * tri decroissant par selection
	 */
	public void trierDecroissantConnexions() {
		int indDeb = 0;
		int indFin = this.connexions.length - 1;
		while(indDeb < indFin){
			int indMax = indDeb;
			for(int i = indDeb + 1; i <= indFin; i++){
				if(this.connexions[i] > this.connexions[indMax]) indMax = i;
			}
			int tmp = this.connexions[indDeb];
			this.connexions[indDeb] = this.connexions[indMax];
			this.connexions[indMax] = tmp;
			indDeb ++;
		}
	}


	// ################ QUESTION 9 ########################

	/**	
	 * faire un tri decroissant par une methode a bulle
	 */
	public void trierDecroissantBulle() {
		//rajout condidtion fin de tri
		boolean fini = false;
		while(!fini){
			fini = true;
			for(int i = 0; i < this.connexions.length - 1; i++){
				if(this.connexions[i] < this.connexions[i+1]){
					int tmp = this.connexions[i];
					this.connexions[i] = this.connexions[i+1];
					this.connexions[i+1] = tmp;
					fini = false;
				}
			}
		}
	}


	// ################ MAIN ########################


	/**
	 * test de nbconnexions
	 * 
	 * @param args
	 *            inutile
	 */
	public static void main(String[] args) {
		Logs nc = new Logs(8);
		nc.saisirConnexions();
		System.out.println(nc);
		nc.corrigerConnexions(2, new int[] { 54, 68, 687 });
		nc.inverserConnexions();
		System.out.println(nc);
		nc.entrerNouveauReleve(7653);
		nc.trierDecroissantConnexions();
		System.out.println(nc);
	}

    // ################ GETTERS ########################
	/**
	 * getter
	 * 
	 * @return le tableau de nombre de connexions
	 */
	public int[] getNbrConnexions() {
		return this.connexions;
	}

	/**
	 * getter
	 * 
	 * @return le min
	 */
	public int getMin() {
		return this.min;
	}

	/**
	 * getter
	 * 
	 * @return le max
	 */
	public int getMax() {
		return this.max;
	}

	/**
	 * getter
	 * 
	 * @return la moyenne
	 */
	public double getMoyenne() {
		return this.moyenne;
	}
}
