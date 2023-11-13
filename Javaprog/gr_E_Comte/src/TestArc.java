import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;

/******************
 * test classe Arc
 *******************/
public class TestArc {

	/**
	 * methode de lancement des tests
	 */
	public static void main(String[] args) {
		lancer(new TestArc(), args);
	}
	/**
	 * test constructeur par defaut
	 */
	public void test_constructeur_defaut() {
		// preparation des donnees
		Arc arc = new Arc();
		// methode testee
		// verifications
		assertEquals("arc doit faire 5 degats", 5, arc.getDegats());
		assertEquals("arc doit avoir 3 fleches", 3, arc.getFleches());
	}
	/**
	 * test constructeur avec parametres positifs
	 */
	public void test_constructeur_parametres() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		// verifications
		assertEquals("arc doit faire 3 degats", 3, arc.getDegats());
		assertEquals("arc doit avoir 5 fleches", 5, arc.getFleches());
	}
	/**
	 * test constructeur avec parametres avec degats negatifs
	 */
	public void test_constructeur_parametres_degats_negatifs() {
		// preparation des donnees
		Arc arc = new Arc(-3,5);
		// methode testee
		// verifications
		assertEquals("arc doit faire 0 degats", 0, arc.getDegats());
		assertEquals("arc doit avoir 5 fleches", 5, arc.getFleches());
	}
	/**
	 * test constructeur avec parametres avec fleches negatifs
	 */
	public void test_constructeur_parametres_fleches_negatifs() {
		// preparation des donnees
		Arc arc = new Arc(3,-5);
		// methode testee
		// verifications
		assertEquals("arc doit faire 3 degats", 3, arc.getDegats());
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * test constructeur avec parametres avec degats et fleches negatifs
	 */
	public void test_constructeur_parametres_degats_fleches_negatifs() {
		// preparation des donnees
		Arc arc = new Arc(-3,-5);
		// methode testee
		// verifications
		assertEquals("arc doit faire 0 degats", 0, arc.getDegats());
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * test constructeur avec parametres avec degats nuls et fleches nulls
	 */
	public void test_constructeur_parametres_degats_fleches_nuls() {
		// preparation des donnees
		Arc arc = new Arc(0,0);
		// methode testee
		// verifications
		assertEquals("arc doit faire 0 degats", 0, arc.getDegats());
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * quand l'arc est recharge correctement
	 */
	public void test_recharger_OK() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		arc.recharger(2);
		// verifications
		assertEquals("arc doit toujours faire 3 degats", 3, arc.getDegats());
		assertEquals("arc doit avoir 7 fleches", 7, arc.getFleches());
	}
	/**
	 * quand l'arc est recharge avec un nombre de fleches nul
	 */
	public void test_recharger_nul() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		arc.recharger(0);
		// verifications
		assertEquals("arc doit toujours faire 3 degats", 3, arc.getDegats());
		assertEquals("arc doit avoir 5 fleches", 5, arc.getFleches());
	}
	/**
	 * quand l'arc est recharge avec un nombre de fleches negatif
	 */
	public void test_recharger_negatif() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		arc.recharger(-2);
		// verifications
		assertEquals("arc doit toujours faire 3 degats", 3, arc.getDegats());
		assertEquals("arc doit toujours avoir 5 fleches", 5, arc.getFleches());
	}
	/**
	 * quand l'arc est utilise avec un nombre de fleches suffisant
	 */
	public void test_utiliser_OK() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		int degats = arc.utiliser();
		// verifications
		assertEquals("arc doit faire 3 degats", 3, degats);
		assertEquals("arc doit avoir 4 fleches", 4, arc.getFleches());
	}
	/**
	 * quand l'arc est utilise avec un nombre de fleches nul
	 */
	public void test_utiliser_nul() {
		// preparation des donnees
		Arc arc = new Arc(3,0);
		// methode testee
		int degats = arc.utiliser();
		// verifications
		assertEquals("arc doit faire 0 degats", 0, degats);
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * quand l'arc est utilise avec un nombre de fleches negatif
	 */
	public void test_utiliser_negatif() {
		// preparation des donnees
		Arc arc = new Arc(3,-5);
		// methode testee
		int degats = arc.utiliser();
		// verifications
		assertEquals("arc doit faire 0 degats", 0, degats);
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * test de la méthode toString
	 */
	public void test_toString() {
		// preparation des donnees
		Arc arc = new Arc(3,5);
		// methode testee
		String s = arc.toString();
		// verifications
		assertEquals("arc doit faire 3 degats et avoir 5 fleches", "-arc(d: 3, f: 5)", s);
	}
}