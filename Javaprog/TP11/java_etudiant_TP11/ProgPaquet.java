/**
 * ProgPaquet
 */
public class ProgPaquet {
    public static void main(String[] args) {
        Carte[] tabCartes = new Carte[6];
        for (int i = 0; i < tabCartes.length; i++) {
            tabCartes[i] = new Carte(i+1);
        }
        Paquet paquet = new Paquet(tabCartes);
        System.out.println(paquet.toString());
        paquet.ajouterCarteFin(new Carte(7));
        System.out.println(paquet.toString());
        paquet.retirerCarte(4);
        System.out.println(paquet.toString());
        paquet.ajouterCarte(new Carte(8), 3);
        System.out.println(paquet.toString());
    }
}