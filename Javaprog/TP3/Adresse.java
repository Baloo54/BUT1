public class Adresse {
    String rue, codePostal, ville;    
    public Adresse(){
        this.rue = "Inconue";
        this.codePostal = "Inconue";
        this.ville = "Inconue";
    }
    public Adresse(String r, String c, String v){
        this.rue = r;
        this.codePostal = c;
        this.ville = v;
    }
    public Adresse(Adresse rcv){
        this.rue = rcv.rue;
        this.codePostal = rcv.codePostal;
        this.ville = rcv.ville;
    }
}
