import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester etreAvant
 */
public class TestMaDateEtreAvant {
	
	/**
 	* exemple de test a completer	
	*/
	public void test1_etreAvant_normal(){
	  // TODO a faire
	  MaDate d1 = new MaDate(2, 3, 1970);
	  MaDate d2 = new MaDate(1, 3, 1970);
	  assertEquals("Le jour en paramêtre est avant celui qui à poser la question", false, d1.etreAvant(d2));
	}
	public void test2_etreAvant_normal(){
	  MaDate d1 = new MaDate(2, 3, 1970);
	  MaDate d2 = new MaDate(3, 3, 1970);
	  assertEquals("Le jour en paramêtre est après celui qui à poser la question", true, d1.etreAvant(d2));
	}
	public void test3_etreAvant_normal(){	
	  MaDate d1 = new MaDate(3, 3, 1970);
	  MaDate d2 = new MaDate(3, 3, 1970);
	  assertEquals("Le jour en paramêtre est égal à celui qui à poser la question", false, d1.etreAvant(d2));
	}
	public void test4_etreAvant_normal(){
	  MaDate d1 = new MaDate(2, 3, 1970);
	  MaDate d2 = new MaDate(3, 4, 1970);
	  assertEquals("Le jour en paramêtre est après celui qui à poser la question", true, d1.etreAvant(d2));
	}
	public void test5_etreAvant_normal(){
	  MaDate d1 = new MaDate(4, 4, 1970);
	  MaDate d2 = new MaDate(3, 3, 1970);
	  assertEquals("Le jour en paramêtre est après celui qui à poser la question", false, d1.etreAvant(d2));
	}
	public void test6_etreAvant_normal(){
	  MaDate d1 = new MaDate(2, 3, 1970);
	  MaDate d2 = new MaDate(3, 3, 1971);
	  assertEquals("Le jour en paramêtre est après celui qui à poser la question", true, d1.etreAvant(d2));
	}
	public void test7_etreAvant_normal(){
	  MaDate d1 = new MaDate(4, 3, 1971);
	  MaDate d2 = new MaDate(3, 3, 1970);
	  assertEquals("Le jour en paramêtre est après celui qui à poser la question", false, d1.etreAvant(d2));
	}
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestMaDateEtreAvant(),args);
	}

}