//import libtest.Test;

import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;


/**
 * classe de test qui permet de verifier que la classe Arc
 * fonctionne correctement
 */
public class TestGuerrier {

	/**
	 * methode de lancement des tests
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new TestGuerrier(), args);
	}

	/**
	 * test des methodes de guerrier
	 */
	// @Test
	public void test_guerrier_methodes() {
		Guerrier guerrier = new Guerrier("Toto",10);
		int pv = guerrier.getPv();
		Arc arc = guerrier.getArc();
		String nom = guerrier.getNom();

		boolean b = guerrier.etreBlesse();
		guerrier.subirDegat(1);

		Arc arcN =new Arc();
		boolean resPrendre = guerrier.prendreArc(arcN);
		Arc resPoser =guerrier.poserArc();

		Guerrier victime = new Guerrier("vict");
		boolean resAttaque = guerrier.attaquer(victime);

		String guerrierS = guerrier.toString();
	}




}
