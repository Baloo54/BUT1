import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;

/**
 * classe chargee de tester lee constructeur de Personne sans effet de bord
 */
public class TestPersonne {


    /**
     * test du constructeur vide
     */
    public void test1_constructeurPersonneVide()
    {
        //on construit la personne
        Personne p =new Personne();

        //on verifie que son jour est 1
        assertEquals("le jour de naissance de p devrait etre 1", 1, p.dateN.jour);
        //on verifie que son mois est 1
        assertEquals("le mois de naissance de p devrait etre 1", 1, p.dateN.mois);
        //on verifie que son annee est 1970
        assertEquals("l'annee de naissance de p devrait etre 1970", 1970, p.dateN.annee);
    }

    /**
     * test du constructeur avec parametres
     */
    public void test2_constructeurParam()
    {
        //on construit la personne
        MaDate date = new MaDate(31,12,1959);
        Personne p =new Personne("Kilmer","Val",date);

        //on verifie la date
        assertEquals("le jour de naissance de p devrait etre 31", 31, p.dateN.jour);
        //on verifie que son mois est 1
        assertEquals("le mois de naissance de p devrait etre 12", 12, p.dateN.mois);
        //on verifie que son annee est 1970
        assertEquals("l'annee de naissance de p devrait etre 1959", 1959, p.dateN.annee);
    }

    /**
     * lancement des tests
     */
    public static void main(String args[])
    {
        lancer(new TestPersonne(),args);
    }

}