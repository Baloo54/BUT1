import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;


public class TestHoraire {
    //test1 heure par défaut
    public void test1_horaire(){
        Horaire h1 = new Horaire();
        assertEquals("heure attendu" , 24, h1.heures);
        assertEquals("minutes attendu", 0, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test2 heure normal en paramètre
    public void test2_horaire(){
        Horaire h1 = new Horaire(14, 15, 0);
        assertEquals("heure attendu" , 14, h1.heures);
        assertEquals("minutes attendu", 15, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test3 avec heure inférieur à 1 en paramètre
    public void test3_horaire(){
        Horaire h1 = new Horaire(-14, 15, 0);
        assertEquals("heure attendu" , 1, h1.heures);
        assertEquals("minutes attendu", 15, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test4 avec minutes inférieur à 0 en paramètre
    public void test4_horaire(){
        Horaire h1 = new Horaire(14, -15, 0);
        assertEquals("heure attendu" , 14, h1.heures);
        assertEquals("minutes attendu", 0, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test5 heure supérieure à 24 en paramètre
    public void test5_horaire(){
        Horaire h1 = new Horaire(26, 15, 0);
        assertEquals("heure attendu" , 24, h1.heures);
        assertEquals("minutes attendu", 15, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test6 minutes supérieure à 59 en paramètre
    public void test6_horaire(){
        Horaire h1 = new Horaire(14, 70, 40);
        assertEquals("heure attendu" , 14, h1.heures);
        assertEquals("minutes attendu", 59, h1.minutes);
        assertEquals("secondes attendu", 40, h1.secondes);
        }
    //test7 secondes inférieur à 0 
    public void test7_horaire(){
        Horaire h1 = new Horaire(14, 50, -15);
        assertEquals("heure attendu" , 14, h1.heures);
        assertEquals("minutes attendu", 50, h1.minutes);
        assertEquals("secondes attendu", 0, h1.secondes);
        }
    //test8 secondes supérieure à 59 en paramètre
    public void test8_horaire(){
        Horaire h1 = new Horaire(14, 50, 61);
        assertEquals("heure attendu" , 14, h1.heures);
        assertEquals("minutes attendu", 50, h1.minutes);
        assertEquals("secondes attendu", 59, h1.secondes);
        }
    //test9 horraire etre avant
	// ##########################
	// TODO : autres tests a ecrire ....
	// ##########################
	
	/**
	 * lancement des tests
	 */
	public static void main(String args[])
	{
		lancer(new TestHoraire(),args);
	}
}