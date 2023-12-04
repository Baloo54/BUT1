
public class Main {
    public static void main(String[] args) {
        String[] pClefs = { "informatique", "memoire", "erreur" };
        Citation c = new Citation("Bill Gates", "640Ko suffisant", pClefs);
        c.toString();
        System.out.println(c);
    }
}