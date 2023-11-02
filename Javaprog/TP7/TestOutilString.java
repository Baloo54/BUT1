import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

/**
 * classe chargee de tester OutilString
 */
public class TestOutilString {
	
	/**
 	* test écrire punition répéter 5 fois je suis puni.
	*/
	public void test1_ecrirePunition(){
	  	OutilString phrasetest = new OutilString();
	  	String test = phrasetest.ecrirePunition("je suis puni", 3);
	  	String attendu = "1-je suis puni\n2-je suis puni\n3-je suis puni\n";
		assertEquals("les chaines ne correspondent pas", attendu, test);
	}
	/**
	 * test écrire punition répéter n fois où n est négatif
	 */
	public void test2_ecrirePunition(){
	  	OutilString phrasetest = new OutilString();
		String test = phrasetest.ecrirePunition("je suis puni", -3);
		String attendu = "";
		assertEquals("devrait avoir une chaine vide", attendu, test);
	}

	/**
	 * test écrire compterCaractere avec "je suis en but informatique" et "e"
	 */
	public void test3_compterCaractere(){
		OutilString phrasetest = new OutilString();
		int test = phrasetest.compterCaractere("je suis en but en informatique",'e');
		int attendu = 4;
		assertEquals("la phrase contient: ", attendu, test);
	}
	/**
	 * test donnerPremierMot avec "Cette phrase est fausse" 
	 */
	public void test4_donnerPremierMot(){
		OutilString phrasetest = new OutilString();
		String test = phrasetest.donnerPremierMot("Cette phrase est fausse");
		String attendu = "Cette";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	 * test donnerPremierMot avec phrase qui débute avec un espace
	 */
	public void test5_donnerPremierMot(){
		OutilString phrasetest = new OutilString();
		String test = phrasetest.donnerPremierMot(" Cette phrase est fausse");
		String attendu = "";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	 * test enumererMots avec la phrase "Trone de fer-Saison1-Episode1-L’hivervient-Episode2-La route royale"  
	 * et avec le séparator '-'
	 */
	public void test6_enumererMots(){
		OutilString phraseTest = new OutilString();
		String test = phraseTest.enumererMots("Trone de fer-Saison1-Episode1-L’hivervient-Episode2-La route royale",'-');
		String attendu = "(1)Trone de fer(2)Saison1(3)Episode1(4)L’hivervient(5)Episode2(6)La route royale";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	* test enumererMots avec la phrase "Trone de fer-Saison1-Episode1---L’hivervient--Episode2-La route royale"  
	* et avec le séparator '-' ou le nombre de séparateur concecutif n'importe pas
	*/
	public void test7_enumererMots(){
		OutilString phraseTest = new OutilString();
		String test = phraseTest.enumererMots("Trone de fer-Saison1--Episode1-L’hivervient---Episode2-La route royale",'-');
		String attendu = "(1)Trone de fer(2)Saison1(3)Episode1(4)L’hivervient(5)Episode2(6)La route royale";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	* test enumererMots avec la phrase "-Trone de fer-Saison1-Episode1---L’hivervient--Episode2-La route royale"  
	* et avec le séparator '-' où la phrase commence avec un séparator
	*/
	public void test8_enumererMots(){
		OutilString phraseTest = new OutilString();
		String test = phraseTest.enumererMots("-Trone de fer-Saison1--Episode1-L’hivervient---Episode2-La route royale",'-');
		String attendu = "(1)Trone de fer(2)Saison1(3)Episode1(4)L’hivervient(5)Episode2(6)La route royale";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	* test extraireMot avec la phrase "Trone de fer-Saison1-Episode1-L’hiver
	*vient-Episode2-La route royale"   et avec le séparator '-' et le mot 3
	*/
	public void test9_extraireMot(){
		OutilString phraseTest = new OutilString();
		String test = phraseTest.extraireMot("Trone de fer-Saison1-Episode1-L’hivervient-Episode2-La route royale",'-',3);
		String attendu = "Episode1";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	/**
	* test enumererMots avec la phrase "-Trone de fer-Saison1-Episode1---L’hivervient--Episode2-La route royale"  
	* et avec le séparator '-'  et n est négatif
	*/
	public void test10_extraireMot(){
		OutilString phraseTest = new OutilString();
		String test = phraseTest.extraireMot("-Trone de fer-Saison1--Episode1-L’hivervient---Episode2-La route royale",'-',-3);
		String attendu = "";
		assertEquals("Ce n'est pas le mot attendu", attendu, test);
	}
	*/
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestOutilString(),args);
	}

}
