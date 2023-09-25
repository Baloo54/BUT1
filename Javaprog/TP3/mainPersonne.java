public class mainPersonne {
    public static void main(String[]arg){
        MaDate d = new MaDate(27, 3, 2006);
        Adresse rcv = new Adresse("Boulevard Charlemagne", "54000" ,"Nancy");
        Personne p = new Personne("Comte", "Gabriel", d, rcv);
        p.dateN.jour = 28;
        p.rcv.rue = "Coucou";
        System.out.println("d: "+ d.jour + " rcv : " + rcv.rue);
        System.out.println("p: "+ p.dateN.jour + " " + p.rcv.rue);
    }
}
