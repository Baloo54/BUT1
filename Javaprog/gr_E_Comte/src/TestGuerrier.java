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
	 *  test constructeur avec un paramètre nom
	 */
	public void test_constructeur_1() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo");
		// methode testee
		// verifications
		assertEquals("guerrier doit avoir 10 pv", 10, guerrier.getPv());
		assertEquals("guerrier doit avoir un arc", null, guerrier.getArc());
		assertEquals("guerrier doit avoir un nom", "Guerrier", guerrier.getNom());
	}
	/**
	 *  test constructeur avec un paramètre nom null	
	 */
	public void test_constructeur_1_nom_null() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier(null);
		// verifications
		assertEquals("guerrier doit avoir 10 pv", 10, guerrier.getPv());
		assertEquals("guerrier doit avoir un arc", null, guerrier.getArc());
		assertEquals("guerrier doit avoir un nom", "Guerrier", guerrier.getNom());
	}
	/**
	 *  test constructeur avec deux paramètres nom et pv
	 */
	public void test_constructeur_2() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// verifications
		assertEquals("guerrier doit avoir 5 pv", 5, guerrier.getPv());
		assertEquals("guerrier doit avoir un arc", null, guerrier.getArc());
		assertEquals("guerrier doit avoir un nom", "Baloo", guerrier.getNom());
	}
	/**
	 *  test constructeur avec deux paramètres nom null et pv négaif
	 */
	public void test_constructeur_2_nom_null_pv_negatif() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier(null, -5);
		// verifications
		assertEquals("guerrier doit avoir 1 pv", 1, guerrier.getPv());
		assertEquals("guerrier doit avoir un arc", null, guerrier.getArc());
		assertEquals("guerrier doit avoir un nom", "Guerrier", guerrier.getNom());
	}
	/**
	 * test etreBlesse
	 */
	public void test_etreBlesse() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// verifications
		assertEquals("guerrier doit avoir 5 pv", 5, guerrier.getPv());
		assertEquals("guerrier doit etre blesse", false, guerrier.etreBlesse());
	}
	/**
	 *  test etreBlesse avec pv = 0
	 */
	public void test_etreBlesse_pv_0() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 0);
		//vu que le pv est égal à 0, constructeur à mis pv à 1 donc on retire 1 pv
		guerrier.subirDegat(1);
		// verifications
		assertEquals("guerrier doit avoir 0 pv", 0, guerrier.getPv());
		assertEquals("guerrier doit etre blesse", true, guerrier.etreBlesse());
	}
	/**
	 * test subirDegat
	 */
	public void test_subirDegat() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// methode testee
		guerrier.subirDegat(3);
		// verifications
		assertEquals("guerrier doit avoir 2 pv", 2, guerrier.getPv());
		assertEquals("guerrier doit etre blesse", false, guerrier.etreBlesse());
	}
	/**
	 * test subirDegat avec degat negatif
	 */
	public void test_subirDegat_degat_negatif() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// methode testee
		guerrier.subirDegat(-3);
		// verifications
		assertEquals("guerrier doit avoir 5 pv", 5, guerrier.getPv());
		assertEquals("guerrier doit etre blesse", false, guerrier.etreBlesse());
	}
	/**
	 * test subirDegat avec degat > pv
	 */
	public void test_subirDegat_mort() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 7);
		// methode testee
		guerrier.subirDegat(5);
		// verifications
		assertEquals("guerrier doit avoir 0 pv", 0, guerrier.getPv());
		assertEquals("guerrier doit etre blesse", true, guerrier.etreBlesse());
	}
	/**
	 * test prendreArc
	 */
	public void test_prendreArc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Arc arc = new Arc(3,5);
		// methode testee
		boolean res = guerrier.prendreArc(arc);
		// verifications
		assertEquals("guerrier doit avoir un arc", arc, guerrier.getArc());
		assertEquals("prendreArc doit retourner true", true, res);
	}
	/**
	 * test prendreArc avec arc null
	 */
	public void test_prendreArc_arc_null() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// methode testee
		boolean res = guerrier.prendreArc(null);
		// verifications
		assertEquals("guerrier ne doit pas avoir d'arc", null, guerrier.getArc());
		assertEquals("prendreArc doit retourner false", false, res);
	}
	/**
	 * test prendreArc avec guerrier blesse
	 */
	public void test_prendreArc_guerrier_blesse() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 0);
		Arc arc = new Arc(3,5);
		// methode testee
		boolean res = guerrier.prendreArc(arc);
		// verifications
		assertEquals("guerrier ne doit pas avoir d'arc", null, guerrier.getArc());
		assertEquals("prendreArc doit retourner false", false, res);
	}
	/**
	 * test prendreArc avec guerrier ayant deja un arc
	 */
	public void test_prendreArc_guerrier_arc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Arc arc = new Arc(3,5);
		Arc arc2 = new Arc(2,4);
		// methode testee
		boolean res = guerrier.prendreArc(arc);
		boolean res2 = guerrier.prendreArc(arc2);
		// verifications
		assertEquals("guerrier doit avoir un arc", arc, guerrier.getArc());
		assertEquals("prendreArc doit retourner true", true, res);
		assertEquals("guerrier doit avoir un arc", arc, guerrier.getArc());
		assertEquals("prendreArc doit retourner false", false, res2);
	}
	/**
	 * test poserArc
	 */
	public void test_poserArc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		Arc res = guerrier.poserArc();
		// verifications
		assertEquals("guerrier ne doit pas avoir d'arc", null, guerrier.getArc());
		assertEquals("poserArc doit retourner l'arc", arc, res);
	}
	/**
	 * test poserArc avec guerrier n'ayant pas d'arc
	 */
	public void test_poserArc_guerrier_sans_arc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// methode testee
		Arc res = guerrier.poserArc();
		// verifications
		assertEquals("guerrier ne doit pas avoir d'arc", null, guerrier.getArc());
		assertEquals("poserArc doit retourner null", null, res);
	}
	/**
	 * test poserArc avec guerrier blesse
	 */
	public void test_poserArc_guerrier_blesse() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 0);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		Arc res = guerrier.poserArc();
		// verifications
		assertEquals("guerrier doit avoir un arc", arc, guerrier.getArc());
		assertEquals("poserArc doit retourner null", null, res);
	}
	/**
	 * test attaquer avec un arc
	 */
	public void test_attaquer_avec_arc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Guerrier victime = new Guerrier("Mowgli", 5);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		boolean res = guerrier.attaquer(victime);
		// verifications
		assertEquals("victime doit avoir 3 pv", 2, victime.getPv());
		assertEquals("res doit etre true car degat infliger", true, res);
		assertEquals("arc doit avoir 4 fleches", 4, arc.getFleches());
	}
	/**
	 * test attaquer sans arc
	 */
	public void test_attaquer_sans_arc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Guerrier victime = new Guerrier("Mowgli", 5);
		// methode testee
		boolean res = guerrier.attaquer(victime);
		// verifications
		assertEquals("victime doit avoir 5 pv", 5, victime.getPv());
		assertEquals("res doit etre false car pas de degat infliger", false, res);
	}
	/**
	 * test attaquer avec guerrier blesse
	 */
	public void test_attaquer_guerrier_blesse() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 0);
		Guerrier victime = new Guerrier("Mowgli", 5);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		boolean res = guerrier.attaquer(victime);
		// verifications
		assertEquals("victime doit avoir 5 pv", 5, victime.getPv());
		assertEquals("res doit etre false car pas de degat infliger", false, res);
	}
	/**
	 * test attaquer avec victime blesse
	 */
	public void test_attaquer_victime_blesse() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Guerrier victime = new Guerrier("Mowgli", 0);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		boolean res = guerrier.attaquer(victime);
		// verifications
		assertEquals("victime doit avoir 0 pv", 0, victime.getPv());
		assertEquals("res doit etre false car pas de degat infliger", false, res);
		assertEquals("arc doit avoir 4 fleches", 4, arc.getFleches());
	}
	/**
	 * test attaquer sans victime
	 */
	public void test_attaquer_victime_null() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		boolean res = guerrier.attaquer(null);
		// verifications
		assertEquals("res doit etre false car pas de degat infliger", false, res);
		assertEquals("arc doit avoir 5 fleches", 5, arc.getFleches());
	}
	/**
	 * test attaquer avec arc sans fleches
	 */
	public void test_attaquer_arc_sans_fleches() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Guerrier victime = new Guerrier("Mowgli", 5);
		Arc arc = new Arc(3,0);
		guerrier.prendreArc(arc);
		// methode testee
		boolean res = guerrier.attaquer(victime);
		// verifications
		assertEquals("victime doit avoir 5 pv", 5, victime.getPv());
		assertEquals("res doit etre false car pas de degat infliger", false, res);
		assertEquals("arc doit avoir 0 fleches", 0, arc.getFleches());
	}
	/**
	 * toString sans arc
	 */
	public void test_toString() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		// methode testee
		String res = guerrier.toString();
		// verifications
		assertEquals("res doit etre Baloo(5)", "Baloo(5)", res);
	}
	/**
	 * toString avec arc
	 */
	public void test_toString_avec_arc() {
		// preparation des donnees
		Guerrier guerrier = new Guerrier("Baloo", 5);
		Arc arc = new Arc(3,5);
		guerrier.prendreArc(arc);
		// methode testee
		String res = guerrier.toString();
		// verifications
		assertEquals("res doit etre Baloo(5)-arc(d: 3, f: 5)", "Baloo(5)-arc(d: 3, f: 5)", res);
	}
}
