/**
 * permet de gerer un sous-titre
 * @author vthomas
 *
 */
public class SousTitre {
	
	/**
	 * a quel date correspond ce sous-titre (en secondes)
	 */
	int temps;
	
	/**
	 * phrase du sous-titre
	 */
	String phrase;
	
	/**
	 * constructeur d'un sous titre
	 * @param t date du sous titre
	 * @param p phrase du soustitre
	 */
	public SousTitre(int t,String p)
	{
		this.temps=t;
		this.phrase=p;
		
		//si la phrase est null
		if (this.phrase==null)
			this.phrase="<Hmmmm...>";
	}
	
	/**
	 * permet d'acceder a la phrase du sous titre
	 * @return attribut phrase
	 */
	public String getPhrase()
	{
		return this.phrase;
	}
	
	/**
	 * permet d'acceder au temps du sous titre
	 * @return temps du sous titre
	 */
	public int getTemps()
	{
		return this.temps;
	}
	
	
	/**
	 * permet de comparer un sous titre avec autre
	 * @param s sous titre a comparer avec this
	 * @return -1 si le deuxieme est avant le this,0 si egal, 1 si param apres this
	 */
	public int compareTo(SousTitre s)
	{
		//egalite par defaut
		int res=0;
		
		//test l'ordre
		if (this.temps<s.temps)
			res=-1;
		else if (this.temps>s.temps)
			res=1;
		
		return(res);
		
	}
	
	/**
	 * permet d'afficher le sous titre sous la forme
	 * date - phrase
	 * 
	 * @return string correspondant
	 */
	public String toString()
	{
		return(temps+ " - "+phrase);
	}

}
