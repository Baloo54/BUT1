public interface Liste {
    /**
     * renvoie la tete de la liste
     * 
     * @return la tete de la liste
     */
    public int tete();
    /**
     * renvoie le sous-titre correspondant a l'indice i
     * 
     * @param i l'indice du sous-titre
     *           
     * @return le sous-titre correspondant a l'indice i
     */
    public SousTitre val(int i);
    /**
     * renvoie l'indice du sous-titre suivant
     * 
     * @param i l'indice du sous-titre
     *           
     * @return l'indice du sous-titre suivant
     */
    public int suc(int i);
    /**
     * renvoie vrai si l'indice i correspond a la fin de la liste
     * 
     * @param i l'indice du sous-titre
     *           
     * @return vrai si l'indice i correspond a la fin de la liste
     */
    public boolean finliste(int i);
    /**
     * creer une liste vide
     * 
     * @return une liste vide 
     */
    public void lisvide();
    /**
     * ajoute un sous-titre au debut de la liste 
     * 
     * @param s le sous-titre a ajouter
     */
    public void adjtlis(SousTitre s);
    /**
     * ajoute un sous-titre dans la liste à la place de l'indice i
     * 
     * @param i l'indice du sous-titre 
     * @param s le sous-titre a ajouter 
     */
    public void adjlis(int i,SousTitre s);
    /**
     * supprime le sous-titre a l'indice i
     * 
     * @param i l'indice du sous-titre a supprimer
     */
    public void suplis(int i);
}