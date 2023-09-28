import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester changement de dates
 */
public class TestChangerDate {
	
	/*
	 * liste des tests
	 * 1. test setDate cas normal
	 * 2. test setDate null
	 * 3. test setDate effet bord
	 * 4. test changerDateJour normal
	 * 5. test changerDateJour 0
	 * 6. test changerDateJour 32
	 */

	/** 
	 * test du setDate cas normal
	 */
	public void test1_setDateNormal()
	{
		// PREPARATION DES DONNEES
		//on construit une personne par defaut
		Personne p = new Personne();
                // on construit une date
              	MaDate date =new MaDate(2,3,2003);

		// METHODE TESTEE
		p.setDate(date);

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour de naissance de p devrait etre 2", 2, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois de naissance de  devrait etre 3", 3, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee de naissance de p devrait etre 2003", 2003, p.dateN.annee);
	}
	
	/** 
	 * test avec date null
	 */
	public void test2_setDateNull()
	{
		// PREPARATION DES DONNEES
                // on construit une date et une adresse
              	MaDate date = new MaDate(2,3,2003);
              	Adresse adresse = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p = new Personne("Dupont", "Toto", adresse, date);

		// METHODE TESTEE
		p.setDate(null);

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour n'aurait pas du changer", 2, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois n'aurait pas du changer", 3, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee de naissance n'aurait pas du changer", 2003, p.dateN.annee);
	}

	/** 
	 * teste effets de bord
	 */
	public void test3_setDateEffetBord()
	{
		// PREPARATION DES DONNEES
                // on construit une date et une adresse
              	MaDate date = new MaDate(2,3,2003);
              	Adresse adresse = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p = new Personne("Dupont", "Toto", adresse, date);

		// METHODE TESTEE
              	MaDate date2 = new MaDate(4,5,2005);
		p.setDate(date2);
		date2.jour = 1;

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour n'aurait pas du changer avec date2", 4, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois aurait du changer", 5, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee de naissance aurait du changer", 2005, p.dateN.annee);
	}

	/** 
	 * teste setDateJour normal
	 */
	public void test4_setDateJourNormal()
	{
		// PREPARATION DES DONNEES
                // on construit une date et une adresse
              	MaDate date = new MaDate(2,3,2003);
              	Adresse adresse = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p = new Personne("Dupont", "Toto", adresse, date);

		// METHODE TESTEE
		p.changerDateJour(4);

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour aurait du changer avec setDateJour", 4, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois n'aurait pas du changer avec setDateJour", 3, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee n'aurait pas du changer avec setDateJour", 2003, p.dateN.annee);
	}

	/** 
	 * teste setDateJour 0
	 */
	public void test5_setDateJourZero()
	{
		// PREPARATION DES DONNEES
                // on construit une date et une adresse
              	MaDate date = new MaDate(2,3,2003);
              	Adresse adresse = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p = new Personne("Dupont", "Toto", adresse, date);

		// METHODE TESTEE
		p.changerDateJour(0);

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour n'aurait pas du changer avec setDateJour(0)", 2, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois n'aurait pas du changer avec setDateJour", 3, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee n'aurait pas du changer avec setDateJour", 2003, p.dateN.annee);
	}

	/** 
	 * teste setDateJour 0
	 */
	public void test6_setDateJour32()
	{
		// PREPARATION DES DONNEES
                // on construit une date et une adresse
              	MaDate date = new MaDate(2,3,2003);
              	Adresse adresse = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p = new Personne("Dupont", "Toto", adresse, date);

		// METHODE TESTEE
		p.changerDateJour(32);

		// VERIFICATIONS
	        //on verifie son jour 
	        assertEquals("le jour n'aurait pas du changer avec setDateJour(32)", 2, p.dateN.jour);
	        //on verifie son mois 
	        assertEquals("le mois n'aurait pas du changer avec setDateJour", 3, p.dateN.mois);
                //on verifie son annee
	        assertEquals("l'annee n'aurait pas du changer avec setDateJour", 2003, p.dateN.annee);
	}



	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestChangerDate(),args);
	}

}