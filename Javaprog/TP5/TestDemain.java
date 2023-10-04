import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;
import java.awt.Color;

/**
 * classe chargee de tester les constructeur de rectangle
 */
public class TestDemain {
	
	/**
 	* exemple de test a completer	
	*/
	public void test1_demain_normal(){
		// donnees a tester
		MaDate d = new MaDate(1,1,2000);
		MaDate res = d.demain();

		// verification (necessite de getters)
		assertEquals("jour devrait avancer", 2, res.getJour());
		assertEquals("mois devrait etre le meme", 1, res.getMois());
		assertEquals("annee devrait etre la meme", 2000, res.getAnnee());
	}

	// ##########################
	// TODO : autres tests a ecrire ....
	// ##########################
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestDemain(),args);
	}

}