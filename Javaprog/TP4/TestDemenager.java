import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester demenager
 */
public class TestDemenager {
	
	/*
	 * liste des tests
	 * 1. test demenager cas normal
	 * 2. test demenager null
	 * 2. test demenager effet de bord
	 */

	/** 
	 * test demenager cas normal
	 */
	public void test1_demenager_Normal()
	{
		// PREPARATION DES DONNEES

		// on construit une date et une adresse
              	MaDate date1 = new MaDate(2,3,1998);
              	Adresse adresse1 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p1 = new Personne("Dupont", "Bertrand", adresse1, date1);
		
		// on construit une autre adresse
              	Adresse adresse2 = new Adresse("rue de la colline","54450", "Laxou");

		// METHODE TESTEE
		p1.demenager(adresse2);

		// VERIFICATIONS 
	        assertEquals("la nouvelle rue devrait etre differente", "rue de la colline", p1.adresse.rue);
	        assertEquals("le nouveau code devrait etre different", "54450", p1.adresse.code);
	        assertEquals("la nouvelle ville devrait etre differente", "Laxou", p1.adresse.ville);		
	}
	
	/** 
	 * test demenager cas null
	 */
	public void test2_demenager_Null()
	{
		// PREPARATION DES DONNEES

		// on construit une date et une adresse
              	MaDate date1 = new MaDate(2,3,1998);
              	Adresse adresse1 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p1 = new Personne("Dupont", "Bertrand", adresse1, date1);
		
		// on construit une autre adresse
              	Adresse adresse2 = new Adresse("rue de la colline","54450", "Laxou");

		// VERIFICATIONS 
	        assertEquals("la nouvelle rue devrait etre la meme", "rue du bois", p1.adresse.rue);
	        assertEquals("le nouveau code devrait etre la meme", "54000", p1.adresse.code);
	        assertEquals("la nouvelle ville devrait etre la meme", "Nancy", p1.adresse.ville);		
	}

	/** 
	 * test demenager cas - test pas d'effet de bord
	 */
	public void test3_demenager_EffetDeBord()
	{
		// PREPARATION DES DONNEES

		// on construit une date et une adresse
              	MaDate date1 = new MaDate(2,3,1998);
              	Adresse adresse1 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p1 = new Personne("Dupont", "Bertrand", adresse1, date1);
		
		// on construit une autre adresse
              	Adresse adresse2 = new Adresse("rue de la colline","54450", "Laxou");

		// METHODE TESTEE
		p1.demenager(adresse2);
		adresse2.ville = "Villers";

		// VERIFICATIONS 
	        assertEquals("la nouvelle ville devrait rester Laxou", "Laxou", p1.adresse.ville);
	        assertEquals("le nouveau code devrait rester 54450", "54450", p1.adresse.code);				
	}


	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestDemenager(),args);
	}

}