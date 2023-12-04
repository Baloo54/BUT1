/**
 * classe qui modelise un dictionnaire de citations
 * 
 */
public class Dico {
	private Citation[] citations;
	

	/**
	 * constructeur vide
	 * citations tableau taille 0
	 */
	public Dico() {
		citations = new Citation[0];
	}

	/**
	 * donne le nombre de citations stockees
	 * 
	 * @return taille de citations
	 */
	public int donnerNombre() {
		return citations.length;
	}

	/**
	 * pemet d'ajouter une citation dans un tableau trie
	 * 
	 * 
	 */
	public void ajouterCitation(String pNom, String pCite, String[] pClefs) {
		Citation c = new Citation(pNom, pCite, pClefs);
		Citation[] tab = new Citation[citations.length + 1];
		int i = 0;
		while (i < citations.length && citations[i].comparer(c) < 0) {
			tab[i] = citations[i];
			i++;
		}
		tab[i] = c;
		while (i < citations.length) {
			tab[i+1] = citations[i];
			i++;
		}
		citations = tab;
	}	

	/**
	 * retourne une citation au hasard
	 * 
	 * @return citation prise au hasard
	 */
	public Citation donnerAuHasard() {
		int taille = citations.length;
		MesMaths m = new MesMaths();
		return taille > 0 ? citations[m.choisirHasard(taille)] : null;
	}

	/**
	 * permet de recuperer toutes les citations avec tel mot clef
	 * 
	 * @param pMot
	 *            mot clef recherche
	 * @return la liste des citations possedant ce mot clef
	 */
	Citation[] recupererCitationMot(String pMot) {
		int taille = citations.length;
		Citation[] tab = new Citation[taille];
		int i = 0;
		int j = 0;
		while (i < taille) {
			if (citations[i].possederClef(pMot)) {
				tab[j++] = citations[i];
			}
			i++;
		}
		Citation[] res = new Citation[j];
		i = 0;
		while (i < j) {
			res[i] = tab[i];
			i++;
		}
		return res;
	}

	/**
	 * permet de recuperer tous les auteurs
	 * 
	 * @return liste des auteurs
	 */
	String[] recupererAuteurs() {
		String[] tab = new String[citations.length];
		int i = 0;
		while (i < citations.length) {
			boolean trouve = false;
			int j = 0; 
			while(j < i && !trouve){
				if (tab[j] != null) trouve = tab[j++].equals(citations[i].getAuteur());
				else j++;
			}
			if (!trouve)tab[i] = citations[i++].getAuteur();
			else tab[i++] = null;
		}
		return tab;
	}

	public static void main(String[] args) {
		Dico d = new Dico();

		{
			String[] pclef = { "titre", "livre" };
			d.ajouterCitation("Victor", "les miserables", pclef);
		}

		{
			String[] pclef = { "titre", "fantastique" };
			d.ajouterCitation("Vernes", "2000 lieux", pclef);
		}

		{
			String[] pclef = { "titre", "fantastique" };
			d.ajouterCitation("Vernes", "Voyage centre", pclef);
		}

		{
			String[] pclef = { "salut", "converstation" };
			d.ajouterCitation("Vincent", "Bonjour", pclef);
		}

		String[] res = d.recupererAuteurs();
		for (String s : res) {
			System.out.println(s);
		}

		Citation[] cit = d.recupererCitationMot("salut");
		for (Citation c : cit) {
			System.out.println(c);
		}

	}

	public Citation[] getCitations() {
		return citations;
	}

}
