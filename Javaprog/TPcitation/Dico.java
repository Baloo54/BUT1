/**
 * classe qui modelise un dictionnaire de citations
 * 
 */
public class Dico {

	

	/**
	 * constructeur vide
	 * citations tableau taille 0
	 */
	public Dico() {
		throw new Error("a faire");
	}

	/**
	 * donne le nombre de citations stockees
	 * 
	 * @return taille de citations
	 */
	public int donnerNombre() {
		throw new Error("a faire");
	}

	/**
	 * pemet d'ajouter une citation dans un tableau trie
	 * 
	 * 
	 */
	public void ajouterCitation(String pNom, String pCite, String[] pClefs) {
		throw new Error("a faire");
	}

	/**
	 * retourne une citation au hasard
	 * 
	 * @return citation prise au hasard
	 */
	public Citation donnerAuHasard() {
		throw new Error("a faire");
	}

	/**
	 * permet de recuperer toutes les citations avec tel mot clef
	 * 
	 * @param pMot
	 *            mot clef recherche
	 * @return la liste des citations possedant ce mot clef
	 */
	Citation[] recupererCitationMot(String pMot) {
		throw new Error("a faire");

	}

	/**
	 * permet de recuperer tous les auteurs
	 * 
	 * @return liste des auteurs
	 */
	String[] recupererAuteurs() {
		throw new Error("a faire");
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
		throw new Error("a faire");
	}

}
