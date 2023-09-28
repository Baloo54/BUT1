import java.awt .*;
public class MonDessin {
    static public void main(String[]args){
        Feuille f = new Feuille(600, 400,"dessin");
        Crayon cyan = new Crayon(java.awt.Color.CYAN);
        Crayon rouge = new Crayon(java.awt.Color.RED);
        Crayon vert = new Crayon(java.awt.Color.GREEN);
        Crayon rose = new Crayon(java.awt.Color.PINK);
        rouge.deplacer(100, 100);
        rouge.poser(f);
        rouge.deplacer(200,0);
        cyan.deplacer(300, 100);
        cyan.poser(f);
        cyan.deplacer(0,200);
        rose.deplacer(300, 300);
        rose.poser(f);
        rose.deplacer(-200,0);
        vert.deplacer(100, 300);
        vert.poser(f);
        vert.deplacer(0,-200);
        
    }   
}
