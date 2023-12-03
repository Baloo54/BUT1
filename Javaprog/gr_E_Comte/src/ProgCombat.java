/**
 * class ProCombat: permet de tester la class Arc et Guerrier.
 */
public class ProgCombat {
    public static void main(String[] args) {
        Guerrier legolas = new Guerrier("Legolas", 4);
        //legolas sort d'un combat difficile d'où les 4 point de vie
        System.out.println(legolas.toString());
        Guerrier orc = new Guerrier("Ugluk", 3);
        System.out.println(orc.toString());
        legolas.attaquer(orc);
        System.out.println(legolas.toString());
        System.out.println(orc.toString());
        Arc arcElfique = new Arc(2, 1);
        System.out.println(legolas.toString());
        legolas.prendreArc(arcElfique);
        System.out.println(legolas.toString());
        legolas.attaquer(orc);
        System.out.println(legolas.toString());
        System.out.println(orc.toString());
        legolas.attaquer(orc);
        System.out.println(legolas.toString());
        System.out.println(orc.toString());
        Arc orcArc = new Arc(5, 3);
        orc.prendreArc(orcArc);
        System.out.println(orc.toString());     
        orc.attaquer(legolas);
        System.out.println(legolas.toString());
        System.out.println(orc.toString());
        Guerrier arwen = new Guerrier("Arwen", 10);
        System.out.println(arwen.toString());
        arwen.prendreArc(arcElfique);
        System.out.println(arwen.toString());
        arcElfique.recharger(1);
        System.out.println(arwen.toString());
        arwen.attaquer(orc);
        orc.attaquer(arwen);
        System.out.println(arwen.toString());
        System.out.println(orc.toString());
    }
}