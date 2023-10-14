public class ProgrammeHoraire {
    static public void main(String[]args){
        Horaire h1 = new Horaire();
        Horaire h2 = new Horaire(14, 19, 40);
        System.out.println(h1.heures + "h " + h1.minutes + "m " + h1.secondes + "s.");
        System.out.println(h2.heures + "h " + h2.minutes + "m " + h2.secondes + "s.");
        System.err.println(h2.convertirHoraireSeconde());
    }
}
