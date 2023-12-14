/**
 * premier programme a ecrire par les etudiants
 */
public class ProgLogiqueSimple {
	
	public static void main(String []args)
	{
		Liste l=new ListeProf();
		l.adjtlis(new SousTitre(264, "Batman: Vite a la batmobile"));
		l.adjtlis(new SousTitre(98, "Robin: Batman, j'entends un rire dement"));
		l.adjtlis(new SousTitre(255, "Robin: Nom d'un petit bonhomme"));
		l.adjtlis(new SousTitre(258, "Batman: Oui, encore un coup du Joker"));
		l.adjtlis(new SousTitre(152, "Batman: Mais de qui peut il s'agir"));
		
		// **** A COMPLETER PAR LES ETUDIANTS **** 
		// ** afficher le contenu de la liste **  
		/*
		fonction afficherListe(l:Liste)
		debut
			place <-- tete(l)
			tant que non finliste(l, place) faire
				ecrire(val(l,place))
				place <-- suc(l,place)
			ftant
		fin

		 */
		int place = l.tete();
		while(!l.finliste(place)){
			System.out.println(l.val(place));
			place = l.suc(place);
		}
	}
}
