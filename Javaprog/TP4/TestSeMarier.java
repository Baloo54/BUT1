import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester se marier
 */
public class TestSeMarier {
	
	/*
	 * liste des tests
	 * 1. test seMarier cas normal
	 * 2. test seMarier null
	 */

	/** 
	 * test du seMarier cas normal
	 */
	public void test1_seMarierNormal()
	{
		// PREPARATION DES DONNEES

		// on construit une date et une adresse
              	MaDate date1 = new MaDate(2,3,1998);
              	Adresse adresse1 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p1 = new Personne("Dupont", "Bertrand", adresse1, date1);
		
		// on construit une date et une adresse
              	MaDate date2 = new MaDate(4,5,1996);
              	Adresse adresse2 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p2 = new Personne("Turbo", "Adeline", adresse2, date2);


		// METHODE TESTEE
		p2.seMarier(p1);

		// VERIFICATIONS
	        assertEquals("le nom de celui qui se marie devrait changer", "Dupont", p2.nom);
	        assertEquals("le nom de celui avec qui on se marie ne devrait pas changer", "Dupont", p1.nom);

	        assertEquals("le prenom de celui qui se marie ne devrait pas changer", "Adeline", p2.prenom);
	        assertEquals("le prenom de celui avec qui on se marie ne devrait pas changer", "Bertrand", p1.prenom);

	        assertEquals("la date de naissance de celui qui se marie ne devrait pas changer", 4 , p2.dateN.jour);
	        assertEquals("la date de naissance de celui avec qui on se marie ne devrait pas changer", 2, p1.dateN.jour);
		
	}
	
        /**
         * se marier avec parametre null
         */
	public void test2_seMarierNull()
	{
		// PREPARATION DES DONNEES

		// on construit une date et une adresse
              	MaDate date1 = new MaDate(2,3,1998);
              	Adresse adresse1 = new Adresse("rue du bois","54000", "Nancy");
		//on construit une personne à une date donnee
		Personne p1 = new Personne("Dupont", "Bertrand", adresse1, date1);

		// METHODE TESTEE
		p1.seMarier(null);

		// VERIFICATIONS
	        assertEquals("le nom de celui qui se marie avec null ne devrait pas changer", "Dupont", p1.nom);
	        assertEquals("le prenom de celui qui se marie avec null ne devrait pas changer", "Bertrand", p1.prenom);
	        assertEquals("la date de naissance de celui qui se marie avec null ne devrait pas changer", 2, p1.dateN.jour);
		
	}

	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestSeMarier(),args);
	}

}