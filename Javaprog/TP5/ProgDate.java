class ProgDate{

  public static void main(String[] args) {
    MaDate d = new MaDate(31,1,2000);
    MaDate e;
    e = d.demain(); 
    d.afficher();
    e.afficher();
  }
}             