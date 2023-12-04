/**
 * classe qui modelise des citations
 * 
 */
public class Citation {
	private String auteur;
	private String cite;
	private String[] clefs;


	/**
	 * constructeur
	 * 
	 * @param pAuteur
	 *            auteur de la citation, si null, auteur inconnu
	 * @param pCite
	 *            phrase citee
	 * @param pClefs
	 *            mots clefs de la citation, peut etre null
	 */
	public Citation(String pAuteur, String pCite, String[] pClefs) {
		cite = pCite;
		auteur = pAuteur == null ? "Inconnu" : pAuteur;
		if (pClefs  == null) clefs = null;
		else {
			clefs = pClefs;
		}
	}

	/**
	 * permet de comparer deux citations dans l'ordre de leurs auteurs
	 * 
	 * @param c
	 *            citation supplementaire a comparer
	 * @return -1 si this avant
	 */
	public int comparer(Citation c) {
		int compar = auteur.compareTo(c.auteur);
		int compar2 = cite.compareTo(c.cite);
		return compar != 0 ? compar > 0 ? 1 : - 1 : compar2 == 0 ? 0 : compar2 > 0 ? 1 : -1;
	}

	/**
	 * permet de savoir la citation contient un certain mot
	 *
	 * @param expression
	 *            mot recherche
	 * @return vrai si et seulement si la citation contient le mot
	 */
	public boolean contenir(String expression) {
		return cite.contains(expression);
	}


	/**
	 * permet de savoir si la citation est possede une clef parmi ses
	 * mots clefs
	 * 
	 * @param c
	 *            clef recherchee
	 * @return vrai si et seulement si la clef fait partie des mots
	 *         clefs
	 */
	public boolean possederClef(String c) {
		boolean res = false;
		if (clefs == null) return res;
		int i = 0;
		while ((!res) && i < (clefs.length) && (c != null)){
			if(clefs[i++].contains(c)) res = true;
		}
		return res;
	}

	/**
	 * surcharge methode toString 
	 * sous la forme
	 * auteur - phrase
	 * [motclef1; motclef2; motcle3]
	 */
	public String toString() {
		String res = auteur + " - " + cite + "\n";
		if (clefs != null) {
			res += "[";
			for (int i = 0; i < clefs.length; i++) {
				res += clefs[i] + "; ";
			}
			res += "]";
		}
		return res;
	}

	/**
	 * test du programme
	 * 
	 * @param args
	 *            argument inutilise
	 */
	public static void main(String[] args) {
		String[] pClefs = { "informatique", "memoire", "erreur" };
		Citation c = new Citation("Bill Gates", "640Ko suffisant", pClefs);
		System.out.println(c);
	}

	public String[] getClefs() {
		return clefs;
	}
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		throw new Error("a faire");
	}

	public String getCite() {
		return cite;
	}

	public void setCite(String cite) {
		throw new Error("a faire");
	}

}
