import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;


/**
 * classe de test qui permet de verifier que la classe Paquet
 * fonctionne correctement
 */ 
public class TestPaquet {

	/**
	 * methode de lancement des tests
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new TestPaquet(), args);
	}

	/**
	 * test du constructeur vide
	 */
	/*@Test*/
	public void test1_constructeur() {
		Paquet paquet = new Paquet();
		assertEquals("paquet devrait avoir 0 carte", 0, paquet.getNbCartes());
	}

	/**
	 * test du constructeur parametres
	 */
	/*@Test*/
	public void test2_constructeurParam() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());
	}


        /**
	 * test getCarte
	 */
	/*@Test*/
	public void test3_getCarte_ok() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());

                Carte c = paquet.getCarte(1);
		assertEquals("la carte 1 a pour valeur 2", 2, c.getValeur());
	}

	/**
	 * test getCarte hors tableau
	 */
	/*@Test*/
	public void test4_getCarte_horsTableau() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());

                Carte c = paquet.getCarte(3);
		assertEquals("la carte 3 n'existe pas", null, c);
	}

	/**
	 * test ajoutCarteFin ok
	 */
	/*@Test*/
	public void test5_ajoutCarteFin() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		paquet.ajouterCarteFin(new Carte(4));

		assertEquals("paquet devrait avoir 4 cartes", 4, paquet.getNbCartes());

                // chaque carte doit etre bien placee: place i => valeur i+1
                for (int i=0;i<3;i++) {
			Carte c = paquet.getCarte(i);
			assertEquals("la carte "+i+"a pour valeur"+(i+1), i+1, c.getValeur());	
		}
		
	}

	/**
	 * test retirerCarte ok
	 */
	/*@Test*/
	public void test6_retirerCarte() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		Carte c = paquet.retirerCarte(1);
		
		// test paquet
		assertEquals("paquet devrait avoir 2 cartes", 2, paquet.getNbCartes());
		assertEquals("premiere carte valeur 1", 1, paquet.getCarte(0).getValeur());
		assertEquals("seconde carte valeur 3", 3, paquet.getCarte(1).getValeur());
			
		// test carte retournee
		assertEquals("carte retiree a pour valeur 2", 2, c.getValeur());}
	/**
	 * test ajoutCarteDebut ok avec la methode ajouterCarteDebut
	 */
	public void test7_ajoutCarteDebut() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		paquet.ajouterCarteDebut(new Carte(4));

		assertEquals("paquet devrait avoir 4 cartes", 4, paquet.getNbCartes());

		// chaque carte doit etre bien placee: place i => valeur i+1
		for (int i=0;i<3;i++) {
			Carte c = paquet.getCarte(i+1);
			assertEquals("la carte "+i+"a pour valeur"+(i+1), i+1, c.getValeur());	
		}	
		Carte c = paquet.getCarte(0);
		assertEquals("la carte 0 a pour valeur 4", 4, c.getValeur());
	}
	/**
	 * test ajoutCarte ok avec la methode ajouterCarte
	 */
	public void test8_ajoutCarte() {
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		/*carte*/
		tab[2] = new Carte(3);
					
		Paquet paquet = new Paquet(tab);
		paquet.ajouterCarte(new Carte(4),1);

		assertEquals("paquet devrait avoir 4 cartes", 4, paquet.getNbCartes());
		Carte a = paquet.getCarte(0);
		Carte b = paquet.getCarte(1);
		Carte c = paquet.getCarte(2);
		Carte d = paquet.getCarte(3);		
		assertEquals("la carte "+0+" a pour valeur "+(1), 1, a.getValeur());		
		assertEquals("la carte "+1+" a pour valeur "+(2), 2, b.getValeur());		
		assertEquals("la carte "+2+" a pour valeur "+(4), 4, c.getValeur());		
		assertEquals("la carte "+3+" a pour valeur "+(3), 3, d.getValeur());		
	}
}
