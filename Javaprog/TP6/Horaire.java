public class Horaire {
    //initialisation varaible int heure et minutes
    int heures, minutes, secondes;
    //création constructeur Horraire par défaut
    public Horaire(){
        this.heures = 24;
        this.minutes = 0;
        this.secondes = 0;
    }
    //création Horraire avec paramètre
    public Horaire(int h, int m, int s){
        //vérification heures si supérieur à 24 ou inférieur 1.
        int h1 = h;
        if(h1<1) h1 = 1;
        if(h1>24) h1 = 24;
        this.heures = h1;
        //vérification  minutes si inférieur à 0 ou supérieur 59.
        int m1 = m;
        if(m1<0) m1 = 0;
        if(m1>59) m1 = 59;
        this.minutes = m1;
        //vérification secondes si inférieur à 0 ou supérieur 59.
        int s1 = s;
        if(s1<0) s1 = 0;
        if(s1>59) s1 = 59;
        this.secondes = s1;
    }
    public int convertirHoraireSeconde(){
        return (this.heures * 3600) + (this.minutes * 60) + this.secondes;
    }
    public boolean horraireAncienne(Horaire h){
        return this.heures < h.heures ? true : 
        (this.heures != h.heures ? false : 
        (this.minutes < h.minutes ? true : 
        (this.minutes != h.minutes ? false : 
        (this.secondes < h.secondes ? true : false))));
    }
}
