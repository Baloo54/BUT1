/**
 * programme pour verifier que votre interface est conforme 
 */
public class PremierProg {
	
	public static void main(String[]ags)
	{
		Liste l;
		l=new ListeProf();
		
		//appel de  toutes les methodes pour verifier l'interface
		l.adjtlis(new SousTitre(10, "Test"));
		l.adjtlis(new SousTitre(11, "Test1"));
		l.adjtlis(new SousTitre(12, "Test2"));
		int a=l.tete();
		boolean bb=l.finliste(a);
		a=l.suc(a);
		l.suplis(l.tete());
		l.adjlis(l.tete(),new SousTitre(30, "Test3"));
		SousTitre s=l.val(l.tete());
		
		System.out.println(l);
		
		
	}

}
