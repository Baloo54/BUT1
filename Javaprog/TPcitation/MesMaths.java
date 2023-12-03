/**
 * classe pour gerer des nombres au hasard 
 * 
 */
public class MesMaths {
	
	/**
	 * constructeur vide ne fait rien 
	 */
	public MesMaths()
	{		
	}
	
	/**
	 * retourne un nombre entre 0 et n exclus
	 * @param n taille de l'intervalle de tirage
	 * @return nombre aleatoire dans [0,n[
	 */
	public int choisirHasard(int n)
	{
		double r=Math.random();
		return((int)(r*n));
	}

}
