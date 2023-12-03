import static libtest.Lanceur.*;
import static libtest.OutilTest.*;


/**
 * tests des classes Dico et Citation
 *  
 */
public class TestDico {

	
	/**
	 * test un constructeur citation normal 
	 */
	public void test_01_constructeurCitationNormal()
	{
		String[] clefs={"titre"};
		Citation c=new Citation("Victor", "les miserables",clefs);
		assertEquals("le nom ne correspond pas", "Victor", c.getAuteur());
		assertEquals("les clefs ne correspondent pas", clefs, c.getClefs());
		
	}
	
	/**
	 * test un constructeur citation sans auteur
	 */
	public void test_02_constructeurCitationIconnu()
	{
		String[] clefs={"titre"};
		Citation c=new Citation(null, "les miserables",clefs);
		assertEquals("l'auteur devrait etre inconnu", "Inconnu", c.getAuteur());
	}
	
	/**
	 * test un constructeur citation sans mots clefs
	 */
	public void test_03_constructeurCitationssMotclefs()
	{
		Citation c=new Citation("Victor", "les miserables",null);
		assertEquals("l'auteur devrait etre Victor", "Victor", c.getAuteur());
		assertEquals("les clefs devraient etre null", null, c.getClefs());
		
	}
	
	/**
	 * test methode comparer normal
	 */
	public void test_04_comparerNormal()
	{
		Citation c1=new Citation("Victor", "Bonjour", null);
		Citation c2=new Citation("Hugo", "Bonjour", null);
		
		//test dans un sens
		int res=c1.comparer(c2);
		assertEquals("ne marche pas quand this>parametre",1,res);

		//test dans autre sens
		res=c2.comparer(c1);
		assertEquals("ne marche pas quand this<parametre",-1,res);	
		
	}
	
	/**
	 * test methode comparer auteur identique
	 */
	public void test_05_comparerMemeAuteur()
	{
		Citation c1=new Citation("Victor", "Bonjour", null);
		Citation c3=new Citation("Victor", "Bonjour", null);
		Citation c2=new Citation("Victor", "Salut", null);
		
		//test dans un sens
		int res=c1.comparer(c2);
		assertEquals("ne marche pas quand this<parametre avec meme auteur",-1,res);

		//test dans autre sens
		res=c2.comparer(c1);
		assertEquals("ne marche pas quand this>parametre avec meme auteur",1,res);
		
		//test egalite
		res=c3.comparer(c1);
		assertEquals("ne marche pas quand this=parametre avec meme auteur",0,res);
	}
	
	/**
	 * test recherche mot present
	 */
	public void test_06_recherchermotNormal()
	{
		Citation c1=new Citation("Victor", "les miserables", null);
		boolean res=c1.contenir("mis");
		assertEquals("le mot aurait du etre trouve", true, res);
	}
	
	/**
	 * test recherche mot present
	 */
	public void test_07_rechercherMotAbsent()
	{
		Citation c1=new Citation("Victor", "les miserables", null);
		boolean res=c1.contenir("misr");
		assertEquals("le mot n'aurait pas du etre trouve", false, res);
	}
	
	/**
	 * rechercher une clef presente
	 */
	public void test_08_rechercherClefNormal()
	{
		String[] clefs={"classique","titre","XIXe"};
		Citation c1=new Citation("Victor", "les miserables", clefs);
		
		//clef au milieu
		boolean res=c1.possederClef(new String("titre"));
		assertEquals("la clef titre aurait du etre trouvee", true, res);
	}
	
	/**
	 * rechercher une clef presente au debut
	 */
	public void test_09_rechercherClefDebut()
	{
		String[] clefs={"classique","titre","XIXe"};
		Citation c1=new Citation("Victor", "les miserables", clefs);
		
		//clef en debut
		boolean res=c1.possederClef(new String("classique"));
		assertEquals("la clef classique en debut des clefs aurait du etre trouvee", true, res);
	}
	
	/**
	 * rechercher une clef presente en fin
	 */
	public void test_10_rechercherClefFin()
	{
		String[] clefs={"classique","titre","XIXe"};
		Citation c1=new Citation("Victor", "les miserables", clefs);
		
		//clef en fin
		boolean res=c1.possederClef(new String("XIXe"));
		assertEquals("la clef charbon en fin des clefs aurait du etre trouvee", true, res);	
	}
	
	/**
	 * recherche clef absente
	 */
	public void test_11_rechercheClefAbsente()
	{
		String[] clefs={"classique","titre","XIXe"};
		Citation c1=new Citation("Victor", "les miserables", clefs);
		
		//clef en fin
		boolean res=c1.possederClef(new String("terre"));
		assertEquals("la clef terre n'aurait pas du etre trouvee", false, res);	
	}
	
	/**
	 * recherche clef avec clefs null
	 */
	public void test_12_rechercheClefNull()
	{
		Citation c1=new Citation("Victor", "les miserables", null);
		
		
		boolean res=c1.possederClef("terre");
		assertEquals("la clef terre n'aurait pas du etre trouvee", false, res);	
	}
	
	/**
	 * constructeur et nombre Dico
	 */
	public void test_13_constructeurDico()
	{
		Dico d=new Dico();
		
		
		int res=d.donnerNombre();
		assertEquals("la taille du nouveau dictionnaire devrait etre 0", 0, res);	
	}
	
	/**
	 * ajouter citation
	 */
	public void test_14_ajoutCitationNormal()
	{
		Dico d=new Dico();
		String[] clefs={"salutation"};
		d.ajouterCitation(null, "bonjour,  je suis un anonyme",clefs);
		
		
		int res=d.donnerNombre();
		assertEquals("la taille du nouveau dictionnaire devrait etre 1 apres un ajout", 1, res);	
	}
	
	/**
	 * ajouter plusieurs citation et tester tri
	 */
	public void test_15_ajoutCitations()
	{
		Dico d=new Dico();
				
		String[] clefs2={"titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Albert", "bonjour,  je suis un anonyme",clefs);
		
		String[] clefs3={"titre"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		//test taille
		int res=d.donnerNombre();
		assertEquals("la taille du nouveau dictionnaire devrait etre 3 apres un ajout", 3, res);
		
		//test tri
		Citation[] cite=d.getCitations();
		String s1=cite[0].getAuteur();
		assertEquals("le premier de la liste devrait etre inconnu", true, s1.compareTo("Albert")==0);
		s1=cite[1].getAuteur();
		assertEquals("le second de la liste devrait etre vernes", 0, s1.compareTo("Vernes"));
		s1=cite[2].getAuteur();
		assertEquals("le troisieme de la liste devrait etre victor", 0, s1.compareTo("Victor"));
		
	}
	
	/**
	 * ajouter plusieurs citation avec des auteurs identiques
	 */
	public void test_16_ajoutCitationsAuteursIdentiques()
	{
		Dico d=new Dico();
				
		String[] clefs2={"titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Vernes", "bonjour,  je suis un anonyme",clefs);
		
		String[] clefs3={"titre"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		//test taille
		int res=d.donnerNombre();
		assertEquals("la taille du nouveau dictionnaire devrait etre 3 apres un ajout", 3, res);
		
		//test tri
		Citation[] cite=d.getCitations();
		String s1=cite[0].getAuteur();
		assertEquals("le premier de la liste devrait etre Vernes", true, s1.compareTo("Vernes")==0);
		assertEquals("le premier de la liste devrait etre 20000 lieux", true, cite[0].getCite().compareTo("20000 lieux")==0);
		
		s1=cite[1].getAuteur();
		assertEquals("le second de la liste devrait etre Vernes", 0, s1.compareTo("Vernes"));
		s1=cite[2].getAuteur();
		assertEquals("le troisieme de la liste devrait etre Victor", 0, s1.compareTo("Victor"));	
	}
	
	
	/**
	 * tester citation au hasard
	 */
	public void test_17_hasard()
	{
		Dico d=new Dico();
				
		String[] clefs2={"titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Vernes", "bonjour,  je suis un anonyme",clefs);
		
		String[] clefs3={"titre"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		//lance plein de fois pour voir si cela genere une exception
		for (int i =0;i<100;i++)
		{
			Citation res=d.donnerAuHasard();
			assertEquals("la citation ne devrait pas etre null", true, res!=null);
		}
	}
	
	/**
	 * tester citation au hasard
	 */
	public void test_18_hasardDicoVide()
	{
		Dico d=new Dico();
		Citation res=d.donnerAuHasard();
		assertEquals("la citation devrait etre null", true, res==null);
		
	}
	
	
	/**
	 * tester citations par mot clef
	 */
	public void test_19_citationMotClef()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Vernes", "bonjour,  je suis Jules Vernes",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		
		Citation[] res=d.recupererCitationMot("titre");
		assertEquals("rechercher titre devrait retourner 2 citations", 2, res.length);
		assertEquals("le premier devrait etre vernes", "Vernes", res[0].getAuteur());
		assertEquals("le second devrait etre victor", "Victor", res[1].getAuteur());
		
		
	}
	
	/**
	 * tester citations par mot clef
	 */
	public void test_20_citationMotClefInexistant()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Vernes", "bonjour,  je suis Jules Vernes",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		Citation[] res=d.recupererCitationMot("vide");
		assertEquals("rechercher vide devrait retourner 0 citation", 0, res.length);	
	}
	
	/**
	 * tester citations par mot clef avec mots clefs vides
	 */
	public void test_21_citationMotClefNull()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation"};
		d.ajouterCitation("Vernes", "bonjour,  je suis Jules Vernes",null);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		Citation[] res=d.recupererCitationMot("titre");
		assertEquals("rechercher vide devrait retourner 2 citations", 2, res.length);			
	}
	
	/**
	 * tester citations par mot clef avec mots clefs vides
	 */
	public void test_22_citationMotClefPartout()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"salutation","titre"};
		d.ajouterCitation("Vernes", "bonjour,  je suis Jules Vernes",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		Citation[] res=d.recupererCitationMot("titre");
		assertEquals("rechercher vide devrait retourner 3 citations", 3, res.length);			
	}
	
	/**
	 * tester citations Dico vide
	 */
	public void test_23_citationDicoVide()
	{
		Dico d=new Dico();
		Citation[] res=d.recupererCitationMot("titre");
		assertEquals("rechercher vide devrait retourner 0 citation", 0, res.length);			
	}
	
	/**
	 * recuperer la liste des auteurs
	 */
	public void test_24_listeAuteursDifferents()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"titre"};
		d.ajouterCitation("Balzac", "Germinal",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		String[] res=d.recupererAuteurs();
		assertEquals("les auteurs differents devraient retourner 3", 3, res.length);			
	}
	
	/**
	 * recuperer la liste des auteurs deux communs
	 */
	public void test_25_listeAuteursCommuns()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Victor", "les miserables",clefs2);
		
		String[] clefs={"titre"};
		d.ajouterCitation("Vernes", "voyage au centre de la terre",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		String[] res=d.recupererAuteurs();
		assertEquals("les auteurs differents devraient retourner 3 (car taille fixe)", 3, res.length);
		assertEquals("le premier devrait etre Vernes", "Vernes", res[0]);
		assertEquals("le second devrait etre Victor", "Victor", res[1]);
		assertEquals("le troisieme doit etre null", true, res[2]==null);
		
	}
	
	/**
	 * recuperer la liste des auteurs tous identiques
	 */
	public void test_26_listeAuteursIdentiques()
	{
		Dico d=new Dico();
		String[] clefs2={"revolution","titre"};
		d.ajouterCitation("Vernes", "test",clefs2);
		
		String[] clefs={"titre"};
		d.ajouterCitation("Vernes", "voyage au centre de la terre",clefs);
		
		String[] clefs3={"titre","steampunk"};
		d.ajouterCitation("Vernes", "20000 lieux",clefs3);
		
		String[] res=d.recupererAuteurs();
		assertEquals("les auteurs differents devraient retourner 3 (car taille fixe)", 3, res.length);
		assertEquals("le premier devrait etre Vernes", "Vernes", res[0]);
		assertEquals("le deuxieme doit etre null", true, res[1]==null);
		assertEquals("le troisieme doit etre null", true, res[2]==null);
		
	}
	
	/**
	 * recuperer la liste des auteurs dicoVide
	 */
	public void test_27_listeAuteursDicoVide()
	{
		Dico d=new Dico();
		String[] res=d.recupererAuteurs();
		assertEquals("les auteurs differents devraient retourner 3 (car taille fixe)", 0, res.length);
		
	}
	
	
	
	
	
	
	/**
	 * lancement des tests
	 * @param args
	 */
	public static void main(String[] args)
	{
		lancer(new TestDico(), args);
	}
	
}
