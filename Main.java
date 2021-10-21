import glace.*;
import java.io.*;
public class Main {
    static public void main(String[] args) {
        Produit glace =
            new Chantilly(new SauceChocolat(TripleChocolat.getInstance()));
        Produit kahwa = new CoulisFraise(new Cafe("express"));
        Commande cmd = new Commande();
        cmd.addCoupe(glace);
        cmd.addCoupe(kahwa);
        PrintWriter out = new PrintWriter(System.out);
        cmd.publieFacture(out);
        out.flush();
        out.close();
    }
}
