import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
/**
 * classe chargee de tester lee constructeur de Personne sans effet de bord
 */
public class TestDate {
    /**
     * test du constructeur vide
     */
    public void test1_constructeurPersonneVide()
    {
      Madate d = new Madate(-1,1,1970);
      // d.jour = 1
      assertEquals("erreur jour devrait etre 1", 1, d.jour);
      assertEquals("erreur mois devrait etre 1", 1, d.mois);
      assertEquals("erreur annee devrait etre 1970", 1970, d.année);
    }
    /**
     * test du constructeur avec parametres
     */
    public void test2_constructeurParam()
    {
      Madate d = new Madate(2,3,2020);
      // d.jour = 1
      assertEquals("erreur jour devrait etre 2", 2, d.jour);
      assertEquals("erreur mois devrait etre 3", 3, d.mois);
      assertEquals("erreur annee devrait etre 1970", 2020, d.année);
    }

    /**
     * lancement des tests
     */
    public static void main(String args[])
    {
        lancer(new TestDate(),args);
    }

}